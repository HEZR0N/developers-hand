/**
 * 
 */
package application.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * 
 * The Deck interface has one static variable, ArrayList<Card> deckOfCards.
 * There are 7 methods: readLines, getDeckOfCards, setDeckOfCards, addCard,
 * removeCard, createCard, and loadDeck.
 * 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 *
 */
public interface Deck {

	public static final ArrayList<Card> deckOfCards = new ArrayList<Card>();
	public static final Color deckColor = Color.SILVER;

	/**
	 * @return an ArrayList<String> holding all the lines of a csv file
	 */
	default public ArrayList<String> readLines(String fileName) throws IOException {
		FileReader readFile = new FileReader("src/data/" + fileName);
		BufferedReader readBuffer = new BufferedReader(readFile);
		ArrayList<String> cardLines = new ArrayList<String>();
		String line = readBuffer.readLine();
		while (line != null) {
			cardLines.add(line);
			line = readBuffer.readLine();
		}
		readBuffer.close();
		return cardLines;
	}

	/**
	 * @return the ArrayList<Card> deckOfCards
	 */
	public ArrayList<Card> getDeckOfCards();

	/**
	 * @param deckofCards the ArrayList<Card> to set
	 */
	public void setDeckOfCards(ArrayList<Card> deckofCards);

	/**
	 * @param card the card to be added to deckOfCards
	 */
	default public void addCard(Card card) {
		getDeckOfCards().add(card);
	}

	/**
	 * @return a Card object from deckofCards
	 */
	default public Card removeCard() {
		return getDeckOfCards().remove(getDeckOfCards().size()-1);
	}

	/**
	 * @param cardInfo an array of String attributes used to initialize a Card
	 *                 object
	 */
	default public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new Card(cardInfo[0], cardInfo[1], new Image("application/view/developers-hand-logo.png"),
				cardInfo[2], deckColor);
	}

	/**
	 * @param fileName the name of a csv file This method loads in card data from a
	 *                 csv file and adds the cards into a deck
	 * @throws IOException
	 */
	default public void loadDeck(String fileName) throws IOException {
		ArrayList<String> cardLines = readLines(fileName);
		String cardInfo[];
		Collections.shuffle(cardLines);
		for (String line : cardLines) {
			cardInfo = line.split(",");
			addCard(createCard(cardInfo));
		}
	}
	
	/**
	 * clears the contents of the deck to 0 cards
	 */
	default public void clearDeck() {
		getDeckOfCards().clear();
	}
	
	/**
	 * @return the deckColor
	 */
	public Color getDeckcolor();

}
