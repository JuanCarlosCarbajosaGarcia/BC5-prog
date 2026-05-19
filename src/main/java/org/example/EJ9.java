package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EJ9 {
    public static void ejercicio_9(){
        Stage ej_9 = new Stage();

        Button button = new Button("Boton");
        Label label = new Label("Etiqueta");
        TextField textField = new TextField();

        button.setOnAction(boton9 -> textField.setText(null));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label,0,0);
        gridPane.add(textField,1,0);
        gridPane.add(button,0,1);
        Scene scene = new Scene(gridPane,300,200);
        ej_9.setTitle("Ejercicio 9");
        ej_9.setScene(scene);
        ej_9.show();
    }
}
