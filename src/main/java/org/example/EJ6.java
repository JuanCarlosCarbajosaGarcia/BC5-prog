package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EJ6 {
    public static void ejercicio_6(){
        Stage ej_6 = new Stage();

        Button button1 = new Button("Boton_1");
        Button button2 = new Button("Boton_2");
        Button button3 = new Button("Boton_3");
        Button button4 = new Button("Boton_4");
        Button button5 = new Button("Boton_5");

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(button1);
        borderPane.setTop(button2);
        borderPane.setBottom(button3);
        borderPane.setLeft(button4);
        borderPane.setRight(button5);

        Scene scene = new Scene(borderPane,200,200);

        ej_6.setTitle("Ejercicio 6");
        ej_6.setScene(scene);
        ej_6.show();
    }
}
