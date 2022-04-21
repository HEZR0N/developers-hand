package application.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import application.model.ActionDeck;
import application.model.Card;
import application.model.Deck;
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

/**
 * The GameController class has ActionDeck, UpgradeDeck, ObjectiveDeck, Card, Deck,
 * and boolean objects as fields. It has methods pauseGame, nextButtonPressed,
 * previousButtonPressed, viewHandButtonPressed, viewHandButtonPressed,
 * collectButtonPressed, drawFromActionDeck, drawFromObjectiveDeck,
 * drawFromUpgradeDeck, displayCard, displayBackOfCard,
 * setVisibilityForViewingHand, setVisibilityForChoosingNewCard,
 * displayPlayerResults, onboardPlayer, and initialize. This controller handles
 * events on the primary Game screen (ie Game.fxml).
 * 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 */
public class GameController {

	private static ActionDeck actionDeck; // Cards that increase RP (Reputation Points) by a lot, XP by a little
	private static UpgradeDeck upgradeDeck; // Cards that increase XP by a lot
	private static ObjectiveDeck objectiveDeck; // Cards that increase RP by a lot
	private static Card currentCard;
	private static Deck currentDeck;
	private static boolean viewingHand;

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
	private ImageView cardImage;

	@FXML
	private Label sprintLabel;

	@FXML
	private Text sprintNumberText;

	@FXML
	private Button collectButton;

	@FXML
	private Button buttonPause;

	/**
	 * Takes the user to pause menu (ie switches to PauseMenu.fxml & PauseMenuController.java)
	 */
	@FXML
	void pauseGame(ActionEvent event) throws IOException {
		URL url = new File("src/PauseMenu.fxml").toURI().toURL();
		borderPane = FXMLLoader.load(url);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(borderPane);
		stage.setTitle("Developer's Hand - Pause");
		Image logo = new Image("images/developers-hand-logo.png");
		stage.getIcons().add(logo);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Changes UI when the user presses the nextButton
	 */
	@FXML
	void nextButtonPressed(ActionEvent event) {
		currentCard = Player.getHand().get(Player.getHand().indexOf(currentCard) + 1);
		setVisibilityForViewingHand();
	}

	/**
	 * Changes UI when the user presses the previousButton
	 */
	@FXML
	void previousButtonPressed(ActionEvent event) {
		currentCard = Player.getHand().get(Player.getHand().indexOf(currentCard) - 1);
		setVisibilityForViewingHand();
	}

	/**
	 * Changes UI when the user presses the viewHandButton
	 */
	@FXML
	void viewHandButtonPressed(ActionEvent event) {
		setVisibilityForViewingHand();
	}

	/**
	 * Changes UI when the user presses the developButton
	 */
	@FXML
	void developButtonPressed(ActionEvent event) {
		Player.addToHand(currentCard); // Should have checked if card can be developed;
		developButton.setVisible(false);
	}

	/**
	 * Changes UI when the user presses the collectButton
	 */
	@FXML
	void collectButtonPressed(ActionEvent event) throws IOException {
		currentCard = currentDeck.removeCard();
		Player.addToHand(currentCard); // Should have checked if card can be developed
		setVisibilityForViewingHand();
		if (!Player.isOnboarded()) {
			objectiveDeckButton.setVisible(true);
			upgradeDeckButton.setVisible(true);
			actionDeckButton.setVisible(true);
			Player.setOnboarded(true);
		}
		Player.addReward(currentCard.getDescription());
		displayPlayerStats();
		System.out.println("Collect Button used");
		// If sprint number exceeds 10 or player gets enough xp and rp load WinOrLose
		// scene
		if (Player.getSprintNumber() > 10 || (Player.getrp() >= 50 && Player.getxp() >= 50)) {
			displayPlayerResults();
		}
	}

	/**
	 * Sets the actionDeck to upgradeDeck and calls setVisibilityForChoosingNewCard()
	 */
	@FXML
	void drawFromActionDeck(ActionEvent event) {
		currentDeck = actionDeck;
		setVisibilityForChoosingNewCard();
	}

	/**
	 * Sets the objectiveDeck to upgradeDeck and calls setVisibilityForChoosingNewCard()
	 */
	@FXML
	void drawFromObjectiveDeck(ActionEvent event) {
		currentDeck = objectiveDeck;
		setVisibilityForChoosingNewCard();
	}
	
	/**
	 * Sets the currentDeck to upgradeDeck and calls setVisibilityForChoosingNewCard()
	 */
	@FXML
	void drawFromUpgradeDeck(ActionEvent event) {
		currentDeck = upgradeDeck;
		setVisibilityForChoosingNewCard();
	}

	/**
	 * Displays the front of a card
	 */
	void displayCard() {
		cardRectangle.setFill(currentCard.getColor());
		titleText.setText(currentCard.getName());
		storyText.setText(currentCard.getStory());
		descriptionText.setText(currentCard.getReward());
		cardImage.setImage(currentCard.getPicture());
	}

	/**
	 * Displays the back of a card
	 */
	void displayBackOfCard() {
		cardRectangle.setFill(currentDeck.getDeckcolor());
		titleText.setText("");
		storyText.setText("");
		descriptionText.setText("");
		cardImage.setImage(currentCard.getPicture());
	}
	
	/**
	 * Sets up UI for viewing a card that has already been selected
	 */
	void setVisibilityForViewingHand() {
		viewingHand = true;
		int currentCardIndex = Player.getHand().indexOf(currentCard);
		viewHandButton.setVisible(false);
		nextButton.setVisible(false);
		previousButton.setVisible(false);
		collectButton.setVisible(false);
		if (Player.getHand().size() > 1) {
			if (currentCardIndex > 0) {
				previousButton.setVisible(true);
			}
			if (currentCardIndex < Player.getHand().size() - 1) {
				nextButton.setVisible(true);
			}
		}
		displayCard();
	}
	/**
	 * Sets up UI for choosing a new card from a Deck
	 */
	void setVisibilityForChoosingNewCard() {
		viewingHand = false;
		displayBackOfCard();
		previousButton.setVisible(false);
		nextButton.setVisible(false);
		viewHandButton.setVisible(Player.getHand().size() > 0);
		collectButton.setVisible(true);
	}
	
	/**
	 * Loads WinOrLose scene where it shows the end result of the game depending on players' xp and rp
	 */
	void displayPlayerResults() throws IOException {
		// This method is called in collectButtonPressed()
		URL fxmlLocation = new File("src/WinOrLose.fxml").toURI().toURL();
		FXMLLoader loader = new FXMLLoader(fxmlLocation);
		Parent root = (Parent) loader.load();

		WinOrLoseController winOrLose = loader.getController();

		if ((Player.getrp() >= 50 && Player.getxp() >= 50)) {
			winOrLose.setPageLabel("Congratulations\nYou gained new skills\nand\nshowcased them to the company");
		} else if ((Player.getrp() < 50 || Player.getxp() < 50)) {
			if (Player.getrp() < 50 && Player.getxp() >= 50) {
				winOrLose.setPageLabel("You Lost\nYou might have the skills\nbut your boss thinks you slacked off");
			} else if (Player.getrp() >= 50 && Player.getxp() < 50) {
				winOrLose.setPageLabel(
						"You Lost\nNo one can deny you work hard\nbut your boss thinks you lack some skills");
			} else {
				winOrLose.setPageLabel("You Lost\nYour boss wasn't impressed with your progress");
			}
		}

		Stage stage = (Stage) borderPane.getScene().getWindow();
		Scene scene = new Scene(root);
		Image logo = new Image("images/developers-hand-logo.png");
		scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
		stage.getIcons().add(logo);
		stage.setTitle("Developer's Hand - Game Result");
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Updates the player's stats on the UI.
	 */
	void displayPlayerStats() {
    	// Updates the numbers on the screen to match the Player stats
    	xpNumberText.setText(String.valueOf(Player.getxp()));
    	rpNumberText.setText(String.valueOf(Player.getrp()));
    	codingNumberText.setText(String.valueOf(Player.getCoding()));
    	documentationNumberText.setText(String.valueOf(Player.getDocumentation()));
    	gitNumberText.setText(String.valueOf(Player.getGit()));
    	productNumberText.setText(String.valueOf(Player.getProduct()));
    	troubleshootingNumberText.setText(String.valueOf(Player.getTroubleshooting()));
    	sprintNumberText.setText(String.valueOf(Player.getSprintNumber()));
    }

	/**
	 * Initializes Deck objects and calls onboardPlayer() if necessary.
	 */
	public void initialize() throws IOException {
		nameLabel.setText(Player.getName());
		sprintNumberText.setText("" + Player.getSprintNumber());
		developButton.setVisible(false);
		objectiveDeck = new ObjectiveDeck();
		actionDeck = new ActionDeck();
		upgradeDeck = new UpgradeDeck();
		if (!Player.isOnboarded()) {
			onboardPlayer();
		}
		if (viewingHand) {
			setVisibilityForViewingHand();
		} else {
			setVisibilityForChoosingNewCard();
		}
		displayPlayerStats();
	}
	/**
	 * Sets up the UI for the beginning of a game.
	 */
	public void onboardPlayer() throws IOException {
		objectiveDeckButton.setVisible(false);
		upgradeDeckButton.setVisible(false);
		actionDeckButton.setVisible(false);
		Player.setSprintNumber(1);
		currentCard = new Card("Onboarding", "RP 1",
				new Image(new FileInputStream("src/images/developers-hand-logo.png")),
				"It's your first day on the job! You filled out forms and learned basic procedures. You didn't code, but you got a free lunch.",
				Color.SILVER);
		objectiveDeck.clearDeck();
		upgradeDeck.clearDeck();
		actionDeck.clearDeck();
		objectiveDeck.loadDeck("objectiveDeck.csv");
		upgradeDeck.loadDeck("upgradeDeck.csv");
		actionDeck.loadDeck("actionDeck.csv");
		currentDeck = actionDeck;
		actionDeck.addCard(currentCard);
		setVisibilityForViewingHand();
		viewingHand = false;
	}

}
