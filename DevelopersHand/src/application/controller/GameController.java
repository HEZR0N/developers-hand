package application.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import application.model.ActionDeck;
import application.model.Card;
import application.model.ObjectiveDeck;
import application.model.Player;
import application.model.UpgradeDeck;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Coding, Documentation, Git (Team-work), Troubleshooting, Product
/*
 *There are 5 core skills for a developer: 

- Coding: You thought you get paid to do this? This is only part of the package deal. This includes programming new features, creating automated tests, and writing scripts

- Documentation: Code and Software tools without documentation leads to excess troubleshooting

- Git (Team-work): Your code should build upon your team's code. Miscommunication leads to wasted time and dead code

- Troubleshooting: Stuff breaks... a lot in the developer's life. You have to figure out how to get back on track quickly. Easily the most frustrating part of the job.

- Product: Even a newly hired senior developer will have to take time to get familiar the product (it's purpose, algorithms, architecture, etc) before they can figure out how to make it bette 
 */

public class GameController {	

	private ActionDeck actionDeck; //Cards that increase RP (Reputation Points) by a lot, XP by a little
	private UpgradeDeck upgradeDeck; // Cards that increase XP by a lot
	private ObjectiveDeck objectiveDeck; // Cards that increase RP by a lot
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
    private Button viewDictionaryButton;

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
    private Label sprintLabel;

    @FXML
    private Text sprintNumberText;
    
    @FXML
    private Button collectButton;

    @FXML
    private Button buttonPause;
   
    
    @FXML
    void pauseGame(ActionEvent event) throws IOException{

    	URL url = new File("src/PauseMenu.fxml").toURI().toURL();
    	borderPane = FXMLLoader.load(url);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(borderPane);
    	stage.setTitle("Pause");
    	Image logo = new Image("images/developers-hand-logo.png");
    	stage.getIcons().add(logo);
    	stage.setScene(scene);
    	stage.show();    	
    }
    
    @FXML
    void developButtonPressed(ActionEvent event) {
    	Player.addToHand(currentCard); //Should have checked if card can be developed
//    	developButton.setManaged(false);
    	developButton.setVisible(false);
    	System.out.println("Develop Button used");
    }
    
    @FXML
    void collectButtonPressed(ActionEvent event) throws IOException {
    	Player.addToHand(currentCard); //Should have checked if card can be developed
//    		collectButton.setManaged(false);
    	collectButton.setVisible(false);
    	System.out.println("Collect Button used");
    	
    	// If sprint number exceeds 10 or player gets enough xp and rp load WinOrLose scene
    	if(Player.getSprintNumber() > 10 || (Player.getrp() >= 50 && Player.getxp() >= 50)) {
    		displayPlayerResults();
    	}
    }

    @FXML
    void drawFromActionDeck(ActionEvent event) {
    	// first do some checks to see if the player can remove the card
    	// draw card a random-ish from actionDeck: currentCard = actionDeck.remove();
    	currentCard = actionDeck.removeCard();
    	displayCard();
    	collectButton.setVisible(true);
    }

    @FXML
    void drawFromObjectiveDeck(ActionEvent event) {
    	// first do some checks to see if the player can remove the card
    	// draw card a random-ish from objectiveDeck: currentCard = objectiveDeck.remove()
    	currentCard = objectiveDeck.removeCard();
    	displayCard();
    	collectButton.setVisible(true);
    }

    @FXML
    void drawFromUpgradeDeck(ActionEvent event) {
    	// first do some checks to see if the player can remove the card
    	// draw card a random-ish from upgradeDeck: currentCard = upgradeDeck.remove();
    	currentCard = upgradeDeck.removeCard();
    	displayCard();
    	collectButton.setVisible(true);
    	
    }

    void displayCard() {
    	cardRectangle.setFill(currentCard.getColor());
    	titleText.setText(currentCard.getName());
    	storyText.setText(currentCard.getStory());
    	descriptionText.setText(currentCard.getDescription());
    	cardImage.setImage(currentCard.getPicture());
    }
    

    void displayPlayerResults() throws IOException {
    	// Loads WinOrLose scene where it shows the end result of the game depending on players' xp and rp
    	// Call method for this method is collectButtonPressed() 
    	URL fxmlLocation = new File("src/WinOrLose.fxml").toURI().toURL();
    	FXMLLoader loader = new FXMLLoader(fxmlLocation);
    	Parent root = (Parent) loader.load();
    	
    	WinOrLoseController winOrLose = loader.getController();
    	
    	if((Player.getrp() >= 50 && Player.getxp() >= 50)) {
    		winOrLose.setPageLabel("Congratulations\nYou gained new skills\nand\nshowcased them to the company");
    	}else if((Player.getrp() < 50 || Player.getxp() < 50)) {
    		if(Player.getrp() < 50 && Player.getxp() >= 50) {
    			winOrLose.setPageLabel("You Lost\nYou might have the skills\nbut your boss thinks you slacked off");
    		}else if(Player.getrp() >= 50 && Player.getxp() < 50) {
    			winOrLose.setPageLabel("You Lost\nNo one can deny you work hard\nbut your boss thinks you lack some skills");
    		}else {
    			winOrLose.setPageLabel("You Lost\nYour boss wasn't impressed with your progress");
    		}
    	}
    	
    	Stage stage = (Stage) borderPane.getScene().getWindow();
    	Scene scene = new Scene(root);
    	Image logo = new Image("images/developers-hand-logo.png");
    	scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
    	stage.getIcons().add(logo);
    	stage.setTitle("Game Result");
    	stage.setScene(scene);
    	stage.show();
    }
    

	public void initialize() throws IOException {
		nameLabel.setText(Player.getName());
		Player.setSprintNumber(1);
		sprintNumberText.setText("" + Player.getSprintNumber());
		developButton.setVisible(false);
		currentCard = new Card("Onboarding","RP 1",new Image(new FileInputStream("src/images/developers-hand-logo.png")), "It's your first day on the job! You filled out forms and learned basic procedures. You didn't code, but you got a free lunch.",Color.SILVER);
		displayCard();
		objectiveDeck = new ObjectiveDeck();
		actionDeck = new ActionDeck();
		upgradeDeck = new UpgradeDeck();
		objectiveDeck.loadDeck("objectiveDeck.csv");
		upgradeDeck.loadDeck("upgradeDeck.csv");
		actionDeck.loadDeck("actionDeck.csv");
	}

}
