package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ4 {
    public static void ejercicio_4(){
        Stage ej_4 = new Stage();

        Button button1 = new Button("Boton_1");
        Button button2 = new Button("Boton_2");
        Button button3 = new Button("Boton_3");

        HBox hBox = new HBox(10, button1, button2);
        VBox vBox = new VBox(10, hBox, button3);
        Scene scene = new Scene(vBox,300,200);

        ej_4.setTitle("Ejercicio 4");
        ej_4.setScene(scene);
        ej_4.show();
    }
}
