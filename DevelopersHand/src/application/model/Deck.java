/**
 * 
 */
package application.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.image.Image;

/**
 * @author Valenciana22 
 *
 */
public interface Deck {

	public static final ArrayList<Card> DeckofCards = new ArrayList<Card>();
	

	/**
	 * @return the deckofCards
	 */
	public ArrayList<Card> getDeckofCards();

	/**
	 * @param deckofCards the deckofCards to set
	 */
	public void setDeckofCards(ArrayList<Card> deckofCards);
	
	public void addCard(Card card);
	/**
	 * @param filename
	 * This method loads in card data from a csv file and adds the cards into a deck
	 * */
	public void loadDeck(String fileName) throws FileNotFoundException;

}
