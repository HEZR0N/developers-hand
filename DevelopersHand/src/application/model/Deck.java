/**
 * 
 */
package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio Valenciana
 *
 */
public interface Deck {

	public static final ArrayList<Card> deckOfCards = new ArrayList<Card>();
	

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
	 * @return the deckofCards
	 */
	public ArrayList<Card> getdeckOfCards();

	/**
	 * @param deckofCards the deckofCards to set
	 */
	public void setdeckOfCards(ArrayList<Card> deckofCards);
	
	/**
	 * @param card the card to be added to deckOfCards
	 */
	default public void addCard(Card card) {
		getdeckOfCards().add(card);
	}
	
	/**
	 * Removes a Card object from deckofCards
	 */
	default public Card removeCard() {
		return getdeckOfCards().remove(0);
	}
	/**
	 * @param cardInfo an array of String attributes used to initialize a Card object
	 */
	default public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new Card(cardInfo[0], cardInfo[1], new Image(new FileInputStream("src/images/developers-hand-logo.png")), cardInfo[2], Color.SILVER);
	}
	/**
	 * @param filename
	 * This method loads in card data from a csv file and adds the cards into a deck
	 * @throws IOException 
	 * */
	default public void loadDeck(String fileName) throws IOException{
		ArrayList<String> cardLines = readLines(fileName);
		String cardInfo[];
		for(String line : cardLines) {
			cardInfo = line.split(",");
			addCard(createCard(cardInfo));
		}
		
	}

}
