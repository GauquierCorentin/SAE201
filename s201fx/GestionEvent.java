package com.example.s201fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GestionEvent {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}