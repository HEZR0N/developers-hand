/**
 * 
 */
package application.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * The ObjectiveDeck class has one field: ArrayList<Card> deckOfCards. This
 * class implements all methods from the Deck interface, though only
 * getDeckOfCards, setDeckOfCards, and createCard are overwritten.
 * 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio
 *         Valenciana
 *
 */
public class ObjectiveDeck implements Deck {

	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private static final Color deckColor = Color.GOLD;

	/**
	 * @return the deckOfCards
	 */
	@Override
	public ArrayList<Card> getDeckOfCards() {
		return ObjectiveDeck.deckOfCards;
	}

	/**
	 * @param deckofCards the ArrayList<Card> to set
	 */
	@Override
	public void setDeckOfCards(ArrayList<Card> deckofCards) {
		ObjectiveDeck.deckOfCards = deckofCards;
	}

	/**
	 * @param cardInfo an array of String attributes used to initialize a Card
	 *                 object
	 * @return a new ObjectiveCard object
	 */
	@Override
	public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new ObjectiveCard(cardInfo[0], cardInfo[1],
				new Image(new FileInputStream("src/application/view/objective.jpg")), cardInfo[2], deckColor,
				Integer.valueOf(cardInfo[3]), cardInfo[4]);
	}

	/**
	 * @return the deckColor
	 */
	@Override
	public Color getDeckcolor() {
		return ObjectiveDeck.deckColor;
	}

}
