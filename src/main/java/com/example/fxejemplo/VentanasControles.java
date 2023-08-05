package com.example.fxejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VentanasControles {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("formulario examen parcial");
    }
}