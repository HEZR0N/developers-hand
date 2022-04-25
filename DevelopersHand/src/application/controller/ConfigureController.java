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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * this class is the controller for Configure.FXML and handles all of the buttons labels, and textfield variables
 * 
 * 
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022 
 */
public class ConfigureController {
    
    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonStart;

    @FXML
    private Button buttonBack;

    @FXML
    private TextField playerName;

   @FXML
   private Label nullName;

   @FXML
   /**
    * Saves the player's name and takes the player to the Main Game Screen
    */
   void goGame(ActionEvent event) {
   	try {
   		Player.setName(playerName.getText().trim());
   	 if(Player.getName().length() != 0) {
   		URL playURL = new File("src/Game.fxml").toURI().toURL();
    	borderPane = FXMLLoader.load(playURL);
    	Scene scene = new Scene(borderPane);
    	scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	stage.setScene(scene);
    	stage.show();
   	 }else {
   		 nullName.setText("Please Enter Name");

   	 }
      	
   	}catch (Exception e) {
   		e.printStackTrace();
   	}
   }
    @FXML
    /*
     * Takes player to main menu upon button press
     */
    void goMain(ActionEvent event) {
    	try {
        	URL playURL = new File("src/MainMenu.fxml").toURI().toURL();
        	borderPane = FXMLLoader.load(playURL);
        	Scene scene = new Scene(borderPane);
        	scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
        	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        	stage.setScene(scene);
        	stage.show();
        	}catch (Exception e) {
        		e.printStackTrace();
        	}
    }


}
