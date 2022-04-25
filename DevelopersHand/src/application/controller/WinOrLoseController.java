package application.controller;

import java.io.File;
import java.net.URL;

import application.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * The WinOrLoseController class has BorderPane, textArea, and Buttons fields. 
 * It has methods setPageLabel and goMainMenu.
 * This controller handles events on the Win/Lose screen (ie WinOrLose.fxml).
 * 
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022 
 */
public class WinOrLoseController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonMainMenu;

    @FXML
    private TextArea textArea;

    /**
     * Officially ends the game and changes scene to MainMenu.fxml
     * @param event
     */
    @FXML
    void goMainMenu(ActionEvent event) {
    	// Loads main menu on click
    	Player.clearData();
    	try {
        	URL playURL = new File("src/MainMenu.fxml").toURI().toURL();
        	borderPane = FXMLLoader.load(playURL);
        	Scene scene = new Scene(borderPane);
        	scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
        	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        	stage.setScene(scene);
        	stage.setTitle("Developer's Hand");
        	stage.show();
        	}catch (Exception e) {
        		e.printStackTrace();
        	}
    }
    
    /*
     * Sets label on loading
     */
    public void setPageLabel(String label) {
    	textArea.getStyleClass().add("centered-text-area");
    	textArea.setText(label);   	   	

    }

}
