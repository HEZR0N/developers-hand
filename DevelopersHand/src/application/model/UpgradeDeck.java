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
 * The UpgradeDeck class has one field: ArrayList<Card> deckOfCards. This class
 * implements all methods from the Deck interface, though only getDeckOfCards,
 * setDeckOfCards, and createCard are overwritten.
 * 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 *
 */
public class UpgradeDeck implements Deck {

	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private static final Color deckColor = Color.LIMEGREEN;

	/**
	 * @return the deckOfCards
	 */
	@Override
	public ArrayList<Card> getDeckOfCards() {
		return UpgradeDeck.deckOfCards;
	}

	/**
	 * @param deckofCards the ArrayList<Card> to set
	 */
	@Override
	public void setDeckOfCards(ArrayList<Card> deckofCards) {
		UpgradeDeck.deckOfCards = deckofCards;
	}

	/**
	 * @param cardInfo an array of String attributes used to initialize a Card
	 *                 object
	 * @return a new UpgradeCard object
	 */
	@Override
	public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new UpgradeCard(cardInfo[0], cardInfo[1],
				new Image(new FileInputStream("src/images/developers-hand-logo.png")), cardInfo[2], deckColor);
	}
	
	/**
	 * @return the deckColor
	 */
	@Override
	public Color getDeckcolor() {
		return UpgradeDeck.deckColor;
	}

}
