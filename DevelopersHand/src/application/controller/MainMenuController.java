package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * The MainMenuController class has BorderPane, and Buttons fields. 
 * It has methods goPlay, goAbout, and goRules.
 * This controller handles events on the Main menu screen (ie MainMenu.fxml).
 * 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 */
public class MainMenuController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonAbout;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonRules;

    /**
     * Changes the scene to Configure.fxml
     * @param event
     */
    @FXML
    void goPlay(ActionEvent event) {
    	try {
    	URL playURL = new File("src/Configure.fxml").toURI().toURL();
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

    /**
     * Pop ups a window About which gives information about game
     * @param event
     * @throws IOException
     */
    @FXML
    void goAbout(ActionEvent event) throws IOException {
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

    /**
     * Pop ups a window Rule which shows the rules of game
     * @param event
     * @throws IOException
     */
    @FXML
    void goRules(ActionEvent event) throws IOException {
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

}
