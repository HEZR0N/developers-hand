package application.model;

import java.util.*;

/**
 * This class contains a Player's information. It contains 
 * getters, setters, and methods addReward and increaseSprintNumber.
 * 
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022 
 */
public class Player {

	private static String name;
	private static ArrayList<Card> hand = new ArrayList<Card>();
	private static String objective;
	private static int xp;
	private static int rp;
	private static int bugs;
	private static int coding;
	private static int documentation;
	private static int git;
	private static int product;
	private static int troubleshooting;
	private static boolean onboarded;
	private static int sprintNumber;
	
	/**
	 * @return the sprintNumber
	 */
	public static int getSprintNumber() {
		return sprintNumber;
	}

	/**
	 * @param sprintNumber the name to set
	 */
	public static void setSprintNumber(int sprintNumber) {
		Player.sprintNumber = sprintNumber;
	}

	/**
	 * @return the name
	 */
	public static void clearData() {
		Player.xp = 0;
		Player.rp = 0;
		Player.bugs = 0;
		Player.coding = 0;
		Player.documentation = 0;
		Player.git = 0;
		Player.product = 0;
		Player.troubleshooting = 0;
		Player.onboarded = false;
		sprintNumber = 0;
		Player.hand.clear();
	}
	
	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		Player.name = name;
	}

	/**
	 * @return the objective
	 */
	public static String getObjective() {
		return objective;
	}

	/**
	 * @param objective the objective to set
	 */
	public static void setObjective(String objective) {
		Player.objective = objective;
	}

	/**
	 * @return the xp
	 */
	public static int getxp() {
		return xp;
	}

	/**
	 * @param xp the xp to set
	 */
	public static void setxp(int xp) {
		Player.xp = xp;
	}

	/**
	 * @return the rp
	 */
	public static int getrp() {
		return rp;
	}

	/**
	 * @param rp the rp to set
	 */
	public static void setrp(int rp) {
		Player.rp = rp;
	}

	/**
	 * @return the bugs
	 */
	public static int getBugs() {
		return bugs;
	}

	/**
	 * @param bugs the bugs to set
	 */
	public static void setBugs(int bugs) {
		Player.bugs = bugs;
	}

	/**
	 * @return the hand
	 */
	public static ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public static void setHand(ArrayList<Card> hand) {
		Player.hand = hand;
	}

	/**
	 * @param c The card to remove from Player.hand
	 */
	public static void removeFromHand(Card c) {
		Player.hand.remove(c);
	}

	/**
	 * @param c The card to add to Player.hand
	 */
	public static void addToHand(Card c) {
		Player.hand.add(c);
		Player.increaseSprintNumber();
	}

	/**
	 * @return the coding
	 */
	public static int getCoding() {
		return coding;
	}

	/**
	 * @param coding the coding to set
	 */
	public static void setCoding(int coding) {
		Player.coding = coding;
	}

	/**
	 * @return the documentation
	 */
	public static int getDocumentation() {
		return documentation;
	}

	/**
	 * @param documentation the documentation to set
	 */
	public static void setDocumentation(int documentation) {
		Player.documentation = documentation;
	}

	/**
	 * @return the git
	 */
	public static int getGit() {
		return git;
	}

	/**
	 * @param git the git to set
	 */
	public static void setGit(int git) {
		Player.git = git;
	}

	/**
	 * @return the product
	 */
	public static int getProduct() {
		return product;
	}

	/**
	 * @param products the product to set
	 */
	public static void setProduct(int product) {
		Player.product = product;
	}

	/**
	 * @return the troubleshooting
	 */
	public static int getTroubleshooting() {
		return troubleshooting;
	}

	/**
	 * @param troubleshooting the troubleshooting to set
	 */
	public static void setTroubleshooting(int troubleshooting) {
		Player.troubleshooting = troubleshooting;
	}
	
	/**
	 * Increments sprintNumber depending on amount of cards in hand 
	 */
	public static void increaseSprintNumber() {
		int sprintLength = 2;
		Player.setSprintNumber((int)Math.ceil(Player.hand.size()/sprintLength) + 1);
	}
	/**
	 * This method will take a card description and input the correct amount of experience
	 * into the correct player field
	 * @param cardDesc the String description of a card
	 */
	public static void addReward(String cardDesc) {
		String rewardArray[] = cardDesc.split("&");

		for (String reward : rewardArray) {
			String space[] = reward.split(" ");
			if (space[0].equalsIgnoreCase("RP")) {
				rp += Integer.valueOf(space[1]);
			} else if (!(space[0].equalsIgnoreCase("RP"))) {
				xp += Integer.valueOf(space[1]);
				if(space[0].equalsIgnoreCase("Troubleshooting")){
					troubleshooting += Integer.valueOf(space[1]);
                }
                if(space[0].equalsIgnoreCase("Git")){
                	git += Integer.valueOf(space[1]);
                }
                if(space[0].equalsIgnoreCase("Coding")){
                	coding += Integer.valueOf(space[1]);
                }
                if(space[0].equalsIgnoreCase("Documentation")){
                	documentation += Integer.valueOf(space[1]);
                }
                if(space[0].equalsIgnoreCase("Product")){
                	product += Integer.valueOf(space[1]);
                }
			}
		}
	}

	/**
	 * @return the onboarded
	 */
	public static boolean isOnboarded() {
		return onboarded;
	}

	/**
	 * @param onboarded the onboarded to set
	 */
	public static void setOnboarded(boolean onboarded) {
		Player.onboarded = onboarded;
	}
}
