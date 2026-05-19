package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EJ10 {
    public static void ejercicio_10(){
        Stage ej_10 = new Stage();

        ComboBox comboBox = new ComboBox();
        comboBox.addEventHandler("saludo","hola");
        comboBox.addEventHandler("despedida","adios");
        Button button = new Button("Boton");

        button.setOnAction(boton -> comboBox);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(comboBox,0,0);
        gridPane.add(button,1,0);
        Scene scene = new Scene(gridPane,300,200);
        ej_10.setTitle("Ejercicio 10");
        ej_10.setScene(scene);
        ej_10.show();
    }
}
