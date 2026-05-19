package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ3 {
    public static void ejercicio_3(){
        Stage ej_3 = new Stage();

        Button button = new Button("Haz click aqui");

        VBox vBox = new VBox(10, button);
        Scene scene = new Scene(vBox,300,200);


        button.setOnAction(action -> {
            Stage ej3_1 = new Stage();
            Label label = new Label("Has hecho click");
            VBox vBox_1 = new VBox(10, label);

            Scene scene_1 = new Scene(vBox_1,300,200);
            ej3_1.setTitle("Ejercicio 3");
            ej3_1.setScene(scene_1);
            ej3_1.show();
        });

        ej_3.setTitle("Ejercicio 3");
        ej_3.setScene(scene);
        ej_3.show();
    }
}
