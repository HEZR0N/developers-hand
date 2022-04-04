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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameController {

    @FXML
    private BorderPane borderPane;
    
    @FXML
    private Button internDeck;

    @FXML
    private Button itemDeck;

    @FXML
    private Button buttonQuitGame;

    @FXML
    private Button juniorDeck;
    
    @FXML
    private Button buttonPause;
   
    @FXML
    void quitGame(ActionEvent event) {
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
    
    @FXML
    void pauseGame(ActionEvent event) throws IOException{

    	URL url = new File("src/PauseMenu.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setTitle("Pause");
    	Image logo = new Image("developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.showAndWait();

//    	stage.show();
    	
    }
    
}
