package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import application.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PauseMenuController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonAbout;

    @FXML
    private Button buttonRules;
    
    @FXML
    private Button buttonResume;
    
    @FXML
    private Button buttonQuitGame;
 
    @FXML
    void goResume(ActionEvent event) {
    	// When clicked loads game scene back
    	try {
    		URL playURL = new File("src/Game.fxml").toURI().toURL();
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

    @FXML
    void goAbout(ActionEvent event) throws IOException {
    	// Loads about scene on click
    	URL url = new File("src/About.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setTitle("About");
    	Image logo = new Image("images/developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.show();
    }

    @FXML
    void goRules(ActionEvent event) throws IOException {
    	// Loads rules scene on click
    	URL url = new File("src/Rules.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setTitle("Rules");
    	Image logo = new Image("images/developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.show();
    }
    
    @FXML
    void quitGame(ActionEvent event) {
    	Player.clearData();
    	// Quits game and loads main menu scene on click
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
