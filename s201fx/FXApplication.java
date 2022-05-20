package com.example.s201fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class FXApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        GridPane board= new GridPane();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                GridPane box = new GridPane();

                for (int row1 = 0; row1 < 3; row1++) {
                    for (int col1 = 0; col1 < 3; col1++) {
                        Region rectangle= new Region();
                        rectangle.setStyle(" -fx-border-color:black; -fx-stroke: black; -fx-stroke-width: 5;");
                        GridPane.setConstraints(rectangle, col1, row1);
                        box.getChildren().addAll(rectangle);
                    }
                }
                GridPane.setConstraints(box, col, row);
                board.getChildren().addAll(box);

            }

        }



        Scene scene = new Scene(grid, 700, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}