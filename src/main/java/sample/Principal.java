package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.views.Loteria;
import sample.views.Taquimecanografo;

public class Principal extends Application {
    private BorderPane bdpPrincipal;
    private MenuBar mnbOpciones;
    private Menu menCompetencia1, menCompetencia2, menSalir;
    private MenuItem mitLoteria, mitSalir,mitTaqui;
    private Scene escena;



    @Override
    public void start(Stage primaryStage) throws Exception{
        CrearUI();
        escena = new Scene(bdpPrincipal);
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Formulario Principal");
        primaryStage.show();


    }

    private void CrearUI() {
        bdpPrincipal =new BorderPane();
        mnbOpciones = new MenuBar();
        menCompetencia1 = new Menu("1er. Competencia");
        menCompetencia2 = new Menu("2da. Competecia");
        menSalir = new Menu("Salir");
        // Agregar menus al menubar
        mnbOpciones.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);
        bdpPrincipal.setTop(mnbOpciones);
        // Instanciamos los MenuItems
        mitLoteria = new MenuItem("Loteria");
        mitTaqui = new MenuItem("Taaquimecanografo");

        mitLoteria.setOnAction(event -> MenuOpciones(1));
        mitTaqui.setOnAction(event -> MenuOpciones(2));

        menCompetencia1.getItems().addAll(mitLoteria,mitTaqui);
        mitSalir = new MenuItem("Hasta Luego");
        menSalir.setOnAction(event -> MenuOpciones(20));

        menSalir.getItems().add(mitSalir);
    }
    private void MenuOpciones(int opc){
        switch (opc){
            case 1:new Loteria(); break;
            case 2: new Taquimecanografo();break;
            //aqui van los demas casos que se trabajaran en clase
            case 20: System.exit(0);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}
