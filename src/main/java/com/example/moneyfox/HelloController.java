package com.example.moneyfox;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button chooseFile;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void fileChooser(){
        FileChooser fileChooser = new FileChooser();
        Stage stage = (Stage) chooseFile.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if(selectedFile != null){
            System.out.println(selectedFile.getAbsolutePath());
        }
    }
}