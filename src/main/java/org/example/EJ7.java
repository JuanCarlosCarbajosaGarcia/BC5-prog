package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EJ7 {
    public static void ejercicio_7(){
        Stage ej_7 = new Stage();
        Button button1 = new Button("Boton_1");
        Button button2 = new Button("Boton_2");
        Button button3 = new Button("Boton_3");
        Button button4 = new Button("Boton_4");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(button1,0,0);
        gridPane.add(button2,0,1);
        gridPane.add(button3,1,0);
        gridPane.add(button4,1,1);

        Scene scene = new Scene(gridPane,300,200);

        ej_7.setTitle("Ejercicio 7");
        ej_7.setScene(scene);
        ej_7.show();
    }
}
