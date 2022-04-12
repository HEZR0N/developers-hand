package application.model;

import java.util.*;

/** 
 * This class is a basic definition of a Player object. It contains 
 * a definition, constructor, getters, and setters.
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
	private static int products;
	private static int troubleshooting;

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
	 * @return the rP
	 */
	public static int getrp() {
		return rp;
	}

	/**
	 * @param rP the rP to set
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
	}

	/**
	 * @return the Coding
	 */
	public static int getCoding() {
		return coding;
	}

	/**
	 * @param coding the Coding to set
	 */
	public static void setCoding(int coding) {
		Player.coding = coding;
	}

	/**
	 * @return the Documentation
	 */
	public static int getDocumentation() {
		return documentation;
	}

	/**
	 * @param documentation the Documentation to set
	 */
	public static void setDocumentation(int documentation) {
		Player.documentation = documentation;
	}

	/**
	 * @return the Git
	 */
	public static int getGit() {
		return git;
	}

	/**
	 * @param git the Git to set
	 */
	public static void setGit(int git) {
		Player.git = git;
	}

	/**
	 * @return the Products
	 */
	public static int getProducts() {
		return products;
	}

	/**
	 * @param products the Products to set
	 */ 
	public static void setProducts(int products) {
		Player.products = products;
	}

	/**
	 * @return the Troubleshooting
	 */
	public static int getTroubleshooting() {
		return troubleshooting;
	}

	/**
	 * @param troubleshooting the Troubleshooting to set
	 */
	public static void setTroubleshooting(int troubleshooting) {
		Player.troubleshooting = troubleshooting;
	}
	
}
