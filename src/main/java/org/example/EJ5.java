package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ5 {
    public static void ejercicio_5(){
        Stage ej_5 = new Stage();

        Button button1 = new Button("Boton_1");
        Button button2 = new Button("Boton_2");
        Button button3 = new Button("Boton_3");

        button1.setStyle("-fx-background-color: red; -fx-font-size: 10px");
        button2.setStyle("-fx-background-color: blue; -fx-font-size: 20px");
        button3.setStyle("-fx-background-color: green; -fx-font-size: 30px");

        HBox hBox = new HBox(10, button1, button2);
        VBox vBox = new VBox(10, hBox, button3);
        Scene scene = new Scene(vBox,300,200);

        ej_5.setTitle("Ejercicio 5");
        ej_5.setScene(scene);
        ej_5.show();
    }
}
