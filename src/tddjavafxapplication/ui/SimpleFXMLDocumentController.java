package tddjavafxapplication.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Simple Java FX UI controller.
 * @author javi
 */
public class SimpleFXMLDocumentController{
    
    @FXML
    private Label label;
    @FXML
    private Button button;

    public void initialize() {
        button.setOnAction(this::handleButtonAction);
    }    

    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello JavaFX TDD World!!!");
    }
}
