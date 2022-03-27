package application;

import java.io.File;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController {

    @FXML
    private BorderPane borderPane;
    
    @FXML
    private Button internDeck;

    @FXML
    private Button itemDeck;

    @FXML
    private Button buttonMenu;

    @FXML
    private Button juniorDeck;

    @FXML
    void goMain(ActionEvent event) {
    	try {
        	URL playURL = new File("src/application/MainMenu.fxml").toURI().toURL();
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
