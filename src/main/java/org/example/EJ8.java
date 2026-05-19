package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EJ8 {
    public static void ejercicio_8(){
        Stage ej_8 = new Stage();

        Button button = new Button("Boton");
        Label label = new Label("Etiqueta");
        TextField textField = new TextField();

        button.setOnAction(action -> label.setText(textField.getText()));
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label,0,0);
        gridPane.add(textField,1,0);
        gridPane.add(button,0,1);
        Scene scene = new Scene(gridPane,300,200);
        ej_8.setTitle("Ejercicio 8");
        ej_8.setScene(scene);
        ej_8.show();
    }
}
