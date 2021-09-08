package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class HelloApplication extends Application implements EventHandler {
    Button btnEntrar;
    @Override
    public void start(Stage primaryStage) throws Exception {

        btnEntrar = new Button("Presiona");
        //btnEntrar.addEventHandler(MouseEvent.MOUSE_CLICKED,this);
        //btnEntrar.addEventHandler(MouseEvent.MOUSE_CLICKED,new GestorEvento());
        btnEntrar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Mi tercer evento con objeto anonimo");
            }
        });

        Scene escena = new Scene(btnEntrar,200,300);
        primaryStage.setTitle("Topicos Avanzados de Programacion");
        primaryStage.setScene(escena);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(Event event) {
        System.out.println("Hola mi primer evento c:");

    }
    class GestorEvento implements EventHandler{


        @Override
        public void handle(Event event) {
            System.out.println("Mi segundo evento desde otra clase :)");
        }
    }
}