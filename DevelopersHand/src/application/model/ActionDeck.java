/**
 * 
 */
package application.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 * 
 *         The ActionDeck class has one field: ArrayList<Card> deckOfCards.
 *         This class implements all methods from the Deck interface, though
 *         only getDeckOfCards, setDeckOfCards, and createCard are overwritten.
 *
 */
public class ActionDeck implements Deck {

	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();

	/**
	 * @return the deckOfCards
	 */
	@Override
	public ArrayList<Card> getDeckOfCards() {
		return ActionDeck.deckOfCards;
	}

	/**
	 * @param deckofCards the ArrayList<Card> to set
	 */
	@Override
	public void setDeckOfCards(ArrayList<Card> deckofCards) {
		ActionDeck.deckOfCards = deckofCards;
	}
	
	/**
	 * @param cardInfo an array of String attributes used to initialize a Card
	 *                 object
	 */
	@Override
	public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new Card(cardInfo[0], cardInfo[1], new Image(new FileInputStream("src/images/developers-hand-logo.png")), cardInfo[2], Color.DODGERBLUE);
	}

}
