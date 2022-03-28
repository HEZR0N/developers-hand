package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import application.model.Card;
import application.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Coding, Documentation, Git (Team-work), Troubleshooting, Product

public class GameController {
	
	private ArrayList<Card> actionDeck; // Change to Deck class. Cards that increase RP (Reputation Points) by a lot, XP by a little
	private ArrayList<Card> upgradeDeck; // Change to Deck class. Cards that increase XP by a lot
	private ArrayList<Card> objectiveDeck; // Change to Deck class. Cards that increase XP by a lot
	private Player player1;
	private int roundNumber;
	private Card currentCard;
    @FXML
    private BorderPane borderPane;
    
    @FXML
    private Button objectiveDeckButton;

    @FXML
    private Button actionDeckButton;

    @FXML
    private Button upgradeDeckButton;

    @FXML
    private Rectangle cardRectangle;
    
    @FXML
    private Label nameLabel;

    @FXML
    private Label codingLabel;

    @FXML
    private Label documentationLabel;

    @FXML
    private Label gitLabel;

    @FXML
    private Button previousButton;

    @FXML
    private Button viewHandButton;

    @FXML
    private Button nextButton;

    @FXML
    private Text storyText;

    @FXML
    private Text descriptionText;

    @FXML
    private Text titleText;

    @FXML
    private Label productLabel;

    @FXML
    private Label troubleShootingLabel;

    @FXML
    private Label xpLabel;

    @FXML
    private Label rpLabel;

    @FXML
    private Text rpNumberText;

    @FXML
    private Text xpNumberText;

    @FXML
    private Text codingNumberText;

    @FXML
    private Text documentationNumberText;

    @FXML
    private Text gitNumberText;

    @FXML
    private Text productNumberText;

    @FXML
    private Text troubleshootingNumberText;

    @FXML
    private Button developButton;

    @FXML
    private Button buttonMenu;
    
    @FXML
    private ImageView cardImage;

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

    @FXML
    void drawFromActionDeck(ActionEvent event) {

    }

    @FXML
    void drawFromObjectiveDeck(ActionEvent event) {

    }

    @FXML
    void drawFromUpgradeDeck(ActionEvent event) {
//    	displayCard(currentCard);
    }
    
//    @FXML
//    void collectCard() {
//    	
//    }
    
    @FXML
    void displayCard() {
    	cardRectangle.setFill(currentCard.getColor());
    	titleText.setText(currentCard.getName());
    	storyText.setText(currentCard.getStory());
    	descriptionText.setText(currentCard.getDescription());
    	Image logo = new Image("developers-hand-logo.png");
    	cardImage.setImage(logo);
    	
    }
    
	public void initialize() {
		player1 = new Player("Intern");
		actionDeck = new ArrayList<Card>();
		upgradeDeck = new ArrayList<Card>();
		currentCard = new Card("Onboarding","+5XP",new Image("developers-hand-logo.png"), "It's your first day on the job! You filled out forms and learned basic procedures. You didn't code, but you got a free lunch.",Color.LIGHTBLUE);
		displayCard();
	}

}
