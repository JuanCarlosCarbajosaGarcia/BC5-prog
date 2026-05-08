package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        Button  button13 = new Button("Ejercicio_13");
        Button  button14 = new Button("Ejercicio_14");

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
        gridPane.add(button13, 1,3);
        gridPane.add(button14, 2,3);
        Scene scene = new Scene(gridPane, 315,150);
        basestage.setTitle("Ejercicios");
        basestage.setScene(scene);
        basestage.show();
        button1.setOnAction(e1 -> ejercicio_1());
        button2.setOnAction(e2 -> ejercicio_2());
        button3.setOnAction(e3 -> ejercicio_3());
        button4.setOnAction(e4 -> ejercicio_4());
        button5.setOnAction(e5 -> ejercicio_5());
        button6.setOnAction(e6 -> ejercicio_6());
        button7.setOnAction(e7 -> ejercicio_7());
        button8.setOnAction(e8 -> ejercicio_8());
        button9.setOnAction(e9 -> ejercicio_9());
        button10.setOnAction(e10 -> ejercicio_10());
        button11.setOnAction(e11 -> ejercicio_11());
        button12.setOnAction(e12 -> ejercicio_12());
        button13.setOnAction(e13 -> ejercicio_13());
        button14.setOnAction(e14 -> ejercicio_14());
    }

    public void ejercicio_1(){
        Stage ej_1 = new Stage();

        Button button = new Button("Haz click aqui");

        VBox vBox = new VBox(10, button);
        Scene scene = new Scene(vBox,300,200);

        ej_1.setTitle("Ejercicio 1");
        ej_1.setScene(scene);
        ej_1.show();
    }
    public void ejercicio_2(){
        Stage ej_2 = new Stage();

        Button button = new Button("Haz click aqui");

        VBox vBox = new VBox(10, button);
        Scene scene = new Scene(vBox,300,200);

        button.setOnAction(action -> System.out.println("has hecho click"));

        ej_2.setTitle("Ejercicio 2");
        ej_2.setScene(scene);
        ej_2.show();
    }
    public void ejercicio_3(){
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
    public void ejercicio_4(){
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
    public void ejercicio_5(){
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
    public void ejercicio_6(){
        Stage ej_6 = new Stage();

        Button button1 = new Button("Boton_1");
        Button button2 = new Button("Boton_2");
        Button button3 = new Button("Boton_3");
        Button button4 = new Button("Boton_4");
        Button button5 = new Button("Boton_5");

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane,200,200);

        borderPane.setCenter(button1);
        borderPane.setTop(button2);
        borderPane.setBottom(button3);
        borderPane.setLeft(button4);
        borderPane.setRight(button5);

        ej_6.setTitle("Ejercicio 6");
        ej_6.setScene(scene);
        ej_6.show();
    }
    public void ejercicio_7(){}
    public void ejercicio_8(){}
    public void ejercicio_9(){}
    public void ejercicio_10(){}
    public void ejercicio_11(){}
    public void ejercicio_12(){}
    public void ejercicio_13(){}
    public void ejercicio_14(){}

    public static void main(String[] args) {
        launch(args);
    }
}