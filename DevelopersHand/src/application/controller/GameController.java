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
    private Button juniorDeck;
    
    @FXML
    private Button buttonPause;
   
    
    @FXML
    void pauseGame(ActionEvent event) throws IOException{

    	URL url = new File("src/PauseMenu.fxml").toURI().toURL();
    	borderPane = FXMLLoader.load(url);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(borderPane);
    	stage.setTitle("Pause");
    	Image logo = new Image("developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.show();    	
    }
    
}
