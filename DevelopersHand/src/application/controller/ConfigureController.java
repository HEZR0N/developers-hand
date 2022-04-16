package application.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;

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

public class ConfigureController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonAbout;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonRules;

    @FXML
    private Button buttonStart;

    @FXML 
    private BorderPane namePane;

    @FXML
    private Button buttonBack;

    @FXML
    private TextField playerName;

   public static String name;
   
   public static Player activePlayer;
   
   @FXML
   private Label nullName;

   @FXML
   void goPlay(ActionEvent event) {
   	try {
   	ArrayList<String>Players = Player.loadPlayers("playerInfo.txt");
   	name = playerName.getText();
   	 if(name.length() != 0) {
   	 	String activePlayerName = Player.Validate(Players, playerName.getText());
   	    if(activePlayerName == null) {
   	     FileWriter myWriter = new FileWriter("playerInfo.txt" , true);
   	    	myWriter.write(playerName.getText() + "\n");
   	    		myWriter.close();
   	         }
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
      	 //creates player info file and adds player 
   	}catch (Exception e) {
   		e.printStackTrace();
   	}
   }
    @FXML
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
