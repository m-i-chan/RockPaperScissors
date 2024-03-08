package com.example.rockpaperscissors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RPSFX extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setStyle("-fx-padding: 5;");
        root.setStyle("-fx-alignment: CENTER;");

        Scene scene = new Scene(root);
        stage.setTitle("Rock Paper Scissors");
        stage.setScene(scene);
        stage.show();

    }
    public void main(String[] args) {
        launch();
    }
}
