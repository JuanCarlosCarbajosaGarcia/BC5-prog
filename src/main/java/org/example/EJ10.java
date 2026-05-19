package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EJ10 {
    public static void ejercicio_10(){
        Stage ej_10 = new Stage();

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll("A","B","C","D");
        Button button = new Button("Boton");
        Label label = new Label();

        button.setOnAction(boton -> label.setText("letra selecionada: " + comboBox.getValue().toString()));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(comboBox,0,0);
        gridPane.add(button,1,0);
        gridPane.add(label,2,0);
        Scene scene = new Scene(gridPane,300,200);
        ej_10.setTitle("Ejercicio 10");
        ej_10.setScene(scene);
        ej_10.show();
    }
}
