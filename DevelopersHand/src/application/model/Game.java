/**
 * 
 */
package application.model;

/**
 * This class contains the Game's information. It contains 
 * getters, setters, and a constructor.
 * 
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022
 */
public class Game {
	
	private static ActionDeck actionDeck; // Cards that increase RP (Reputation Points) by a lot, XP by a little
	private static UpgradeDeck upgradeDeck; // Cards that increase XP by a lot
	private static ObjectiveDeck objectiveDeck; // Cards that increase RP by a lot
	private static Card currentCard;
	private static ObjectiveCard currentObjectiveCard;
	private static Deck currentDeck;
	private static boolean viewingHand;

	/**
	 * The game constructor/initializer
	 */
	public Game() {
		
		Game.actionDeck = new ActionDeck();
		Game.upgradeDeck = new UpgradeDeck();
		Game.objectiveDeck = new ObjectiveDeck();
		
	}

	/**
	 * @return the actionDeck
	 */
	public static ActionDeck getActionDeck() {
		return actionDeck;
	}

	/**
	 * @param actionDeck the actionDeck to set
	 */
	public static void setActionDeck(ActionDeck actionDeck) {
		Game.actionDeck = actionDeck;
	}

	/**
	 * @return the upgradeDeck
	 */
	public static UpgradeDeck getUpgradeDeck() {
		return upgradeDeck;
	}

	/**
	 * @param upgradeDeck the upgradeDeck to set
	 */
	public static void setUpgradeDeck(UpgradeDeck upgradeDeck) {
		Game.upgradeDeck = upgradeDeck;
	}

	/**
	 * @return the objectiveDeck
	 */
	public static ObjectiveDeck getObjectiveDeck() {
		return objectiveDeck;
	}

	/**
	 * @param objectiveDeck the objectiveDeck to set
	 */
	public static void setObjectiveDeck(ObjectiveDeck objectiveDeck) {
		Game.objectiveDeck = objectiveDeck;
	}

	/**
	 * @return the currentCard
	 */
	public static Card getCurrentCard() {
		return currentCard;
	}

	/**
	 * @param currentCard the currentCard to set
	 */
	public static void setCurrentCard(Card currentCard) {
		Game.currentCard = currentCard;
	}

	/**
	 * @return the currentObjectiveCard
	 */
	public static ObjectiveCard getCurrentObjectiveCard() {
		return currentObjectiveCard;
	}

	/**
	 * @param currentObjectiveCard the currentObjectiveCard to set
	 */
	public static void setCurrentObjectiveCard(ObjectiveCard currentObjectiveCard) {
		Game.currentObjectiveCard = currentObjectiveCard;
	}

	/**
	 * @return the currentDeck
	 */
	public static Deck getCurrentDeck() {
		return currentDeck;
	}

	/**
	 * @param currentDeck the currentDeck to set
	 */
	public static void setCurrentDeck(Deck currentDeck) {
		Game.currentDeck = currentDeck;
	}

	/**
	 * @return the viewingHand
	 */
	public static boolean isViewingHand() {
		return viewingHand;
	}

	/**
	 * @param viewingHand the viewingHand to set
	 */
	public static void setViewingHand(boolean viewingHand) {
		Game.viewingHand = viewingHand;
	}

}
