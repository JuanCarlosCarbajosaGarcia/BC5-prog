package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage basestage) {
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        Button  button1 = new Button("Ejercicio_1");
        Button  button2 = new Button("Ejercicio_2");
        Button  button3 = new Button("Ejercicio_3");
        Button  button4 = new Button("Ejercicio_4");
        Button  button5 = new Button("Ejercicio_5");
        Button  button6 = new Button("Ejercicio_6");
        Button  button7 = new Button("Ejercicio_7");
        Button  button8 = new Button("Ejercicio_8");
        Button  button9 = new Button("Ejercicio_9");
        Button  button10 = new Button("Ejercicio_10");
        Button  button11 = new Button("Ejercicio_11");
        Button  button12 = new Button("Ejercicio_12");

        gridPane.add(button1, 0,0);
        gridPane.add(button2, 1,0);
        gridPane.add(button3, 2,0);
        gridPane.add(button4, 3,0);
        gridPane.add(button5, 0,1);
        gridPane.add(button6, 1,1);
        gridPane.add(button7, 2,1);
        gridPane.add(button8, 3,1);
        gridPane.add(button9, 0,2);
        gridPane.add(button10, 1,2);
        gridPane.add(button11, 2,2);
        gridPane.add(button12, 3,2);
        Scene scene = new Scene(gridPane, 315,100);
        basestage.setTitle("Ejercicios");
        basestage.setScene(scene);
        basestage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}