package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;

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
        Button  button13 = new Button("Ejercicio_13");
        Button  button14 = new Button("Ejercicio_14");
        Button  button15 = new Button("Ejercicio_15");
        Button  button16 = new Button("Ejercicio_16");
        Button  button17 = new Button("Ejercicio_17");
        Button  button18 = new Button("Ejercicio_18");
        Button  button19 = new Button("Ejercicio_19");
        Button  button20 = new Button("Ejercicio_20");
        Button  button21 = new Button("Ejercicio_21");
        Button  button22 = new Button("Ejercicio_22");
        Button  button23 = new Button("Ejercicio_23");
        Button  button24 = new Button("Ejercicio_24");
        Button  button25 = new Button("Ejercicio_25");
        Button  button26 = new Button("Ejercicio_26");

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
        gridPane.add(button13, 0,3);
        gridPane.add(button14, 1,3);
        gridPane.add(button15, 2,3);
        gridPane.add(button16, 3,3);
        gridPane.add(button17, 0,4);
        gridPane.add(button18, 1,4);
        gridPane.add(button19, 2,4);
        gridPane.add(button20, 3,4);
        gridPane.add(button21, 0,5);
        gridPane.add(button22, 1,5);
        gridPane.add(button23, 2,5);
        gridPane.add(button24, 3,5);
        gridPane.add(button25, 1,6);
        gridPane.add(button26, 2,6);
        Scene scene = new Scene(gridPane, 325,240);
        basestage.setTitle("Ejercicios");
        basestage.setScene(scene);
        basestage.show();
        button1.setOnAction(e1 -> EJ1.ejercicio_1());
        button2.setOnAction(e2 -> EJ2.ejercicio_2());
        button3.setOnAction(e3 -> EJ3.ejercicio_3());
        button4.setOnAction(e4 -> EJ4.ejercicio_4());
        button5.setOnAction(e5 -> EJ5.ejercicio_5());
        button6.setOnAction(e6 -> EJ6.ejercicio_6());
        button7.setOnAction(e7 -> EJ7.ejercicio_7());
        button8.setOnAction(e8 -> EJ8.ejercicio_8());
        button9.setOnAction(e9 -> EJ9.ejercicio_9());
        button10.setOnAction(e10 -> EJ10.ejercicio_10());
        button11.setOnAction(e11 -> EJ11.ejercicio_11());
        button12.setOnAction(e12 -> EJ12.ejercicio_12());
        button13.setOnAction(e13 -> EJ13.ejercicio_13());
        button14.setOnAction(e14 -> EJ14.ejercicio_14());
        button15.setOnAction(e15 -> EJ15.ejercicio_15());
        button16.setOnAction(e16 -> EJ16.ejercicio_16());
        button17.setOnAction(e17 -> EJ17.ejercicio_17());
        button18.setOnAction(e18 -> EJ18.ejercicio_18());
        button19.setOnAction(e19 -> EJ19.ejercicio_19());
        button20.setOnAction(e20 -> EJ20.ejercicio_20());
        button21.setOnAction(e21 -> EJ21.ejercicio_21());
        button22.setOnAction(e22 -> EJ22.ejercicio_22());
        button23.setOnAction(e23 -> EJ23.ejercicio_23());
        button24.setOnAction(e24 -> EJ24.ejercicio_24());
        button25.setOnAction(e25 -> EJ25.ejercicio_25());
        button26.setOnAction(e26 -> EJ26.ejercicio_26());
    }

    public static void main(String[] args) {
        launch(args);
    }
}