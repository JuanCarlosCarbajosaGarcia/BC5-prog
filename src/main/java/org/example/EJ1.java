package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ1 {
    public static void ejercicio_1(){
        Stage ej_1 = new Stage();

        Button button = new Button("Haz click aqui");

        VBox vBox = new VBox(10, button);
        Scene scene = new Scene(vBox,300,200);

        ej_1.setTitle("Ejercicio 1");
        ej_1.setScene(scene);
        ej_1.show();
    }
}
