package application.controller;

import java.io.File;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WinOrLoseController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonMainMenu;

    @FXML
    private TextArea textArea;

    @FXML
    void goMainMenu(ActionEvent event) {
    	// Loads main menu on click
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
    
    public void setPageLabel(String label) {
    	// Sets label on loading 
    	textArea.getStyleClass().add("centered-text-area");
    	textArea.setText(label);   	   	

    }

}
