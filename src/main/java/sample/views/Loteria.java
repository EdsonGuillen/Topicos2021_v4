package sample.views;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class Loteria extends Stage{
private String[] arImagenes ={""};
    private Scene escena;
    private VBox vBox;
    private HBox hBox1, hBox2;
    private Button btnAtras, btnSiguiente;
    private Button[][]arBtnCartas = new Button[3][3];
    private Image imgCarta;
    private GridPane gdpPlantilla;
    private Label lblCarta; //Clase 8
    private File file;

    public Loteria(){
        CrearUI();
        this.setTitle("Loteria");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {

        vBox = new VBox();
        hBox1 = new HBox();
        btnAtras = new Button("<Plantilla anteriro");
        btnSiguiente = new Button("Plantilla Siguiente>");
        hBox1.getChildren().addAll(btnAtras,btnSiguiente);
        hBox1.setSpacing(10);

        hBox2 = new HBox();
        gdpPlantilla = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arBtnCartas[j][i] = new Button();
                arBtnCartas[j][i].setPrefSize(120,140);
file = new File( "src/main/java/sample/imagenes/"+arImagenes[0]);
                imgCarta = new Image(file.toURI().toString());
                ImageView view = new ImageView(imgCarta);
                view.setFitHeight(140);
                view.setFitWidth(120);
                view.setPreserveRatio(true);
                arBtnCartas[j][i].setGraphic(view);

                gdpPlantilla.add(arBtnCartas[j][i],j,i);
            }
        }
        lblCarta =new Label();
        imgCarta = new Image(file.toURI().toString());
        ImageView view = new ImageView(imgCarta);
        view.setFitWidth(140);
        view.setFitHeight(160);
        view.setPreserveRatio(true);
        lblCarta.setGraphic(view);

        hBox2.getChildren().addAll(gdpPlantilla);
        hBox2.setSpacing(10);

        vBox.getChildren().addAll(hBox1,hBox2);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));


        escena = new Scene(vBox,500,600);
    }
}
