package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import application.Main;
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
    private Button buttonExit;

    @FXML
    private Button buttonAbout;

    @FXML
    private Button buttonRules;
    
    @FXML
    private Button buttonResume;
    
    @FXML
    void goResume(ActionEvent event) {
    	Node source = (Node) event.getSource();
    	Stage oldStage = (Stage) source.getScene().getWindow();
    	oldStage.close();    
    }

    @FXML
    void goAbout(ActionEvent event) throws IOException {
    	URL url = new File("src/About.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setTitle("About");
    	Image logo = new Image("developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.show();
    }

    @FXML
    void goRules(ActionEvent event) throws IOException {
    	URL url = new File("src/Rules.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setTitle("Rules");
    	Image logo = new Image("developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.show();
    }

    @FXML
    void goExit(ActionEvent event) throws IOException {
    	
    	Node source = (Node) event.getSource();
    	Stage oldStage = (Stage) source.getScene().getWindow();
    	oldStage.close();    	

    }

}