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
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio Valenciana
 *
 */
public class ObjectiveDeck implements Deck {
	
	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();

	public ObjectiveDeck() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Card> getdeckOfCards() {
		return ObjectiveDeck.deckOfCards;
	}

	@Override
	public void setdeckOfCards(ArrayList<Card> deckofCards) {
		ObjectiveDeck.deckOfCards = deckofCards;
	}
	
	@Override
	public Card createCard(String cardInfo[]) throws FileNotFoundException {
		return new Card(cardInfo[0], cardInfo[1], new Image(new FileInputStream("src/images/developers-hand-logo.png")), cardInfo[2], Color.GOLD);
	}

}
