package application;
	
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			URL url = new File("src/MainMenu.fxml").toURI().toURL();
			BorderPane root = (BorderPane)FXMLLoader.load(url);
			Scene scene = new Scene(root,800,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Developer's Hand");
			Image logo = new Image("developers-hand-logo.png");
			primaryStage.getIcons().add(logo);
			primaryStage.setScene(scene);
			primaryStage.setMaxHeight(800);
			primaryStage.setMaxWidth(800);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}