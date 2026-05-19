package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ2 {
    public static void ejercicio_2(){
        Stage ej_2 = new Stage();

        Button button = new Button("Haz click aqui");

        VBox vBox = new VBox(10, button);
        Scene scene = new Scene(vBox,300,200);

        button.setOnAction(action -> System.out.println("has hecho click"));

        ej_2.setTitle("Ejercicio 2");
        ej_2.setScene(scene);
        ej_2.show();
    }
}
