package application.model;

import java.util.*;

/** 
 * This class is a basic definition of a Player object. It contains 
 * a definition, constructor, getters, and setters.
 */
public class Player {

	private String name;
	private ArrayList<String> skills;
	private ArrayList<Card> hand = new ArrayList<Card>();
	private String objective;
	private int XP;
	private int RP;
	private int bugs;

	public Player(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the skills
	 */
	public ArrayList<String> getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(ArrayList<String> skills) {
		this.skills = new ArrayList<String>();
	}

	/**
	 * @return the objective
	 */
	public String getObjective() {
		return objective;
	}

	/**
	 * @param objective the objective to set
	 */
	public void setObjective(String objective) {
		this.objective = objective;
	}

	/**
	 * @return the xP
	 */
	public int getXP() {
		return XP;
	}

	/**
	 * @param xP the xP to set
	 */
	public void setXP(int XP) {
		this.XP = XP;
	}

	/**
	 * @return the rP
	 */
	public int getRP() {
		return RP;
	}

	/**
	 * @param rP the rP to set
	 */
	public void setRP(int RP) {
		this.RP = RP;
	}

	/**
	 * @return the bugs
	 */
	public int getBugs() {
		return bugs;
	}

	/**
	 * @param bugs the bugs to set
	 */
	public void setBugs(int bugs) {
		this.bugs = bugs;
	}

	/**
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	/**
	 * @param c The card to remove from this.hand
	 */
	public void removeFromHand(Card c) {
		this.hand.remove(c);
	}

	/**
	 * @param c The card to add to this.hand
	 */
	public void addToHand(Card c) {
		this.hand.add(c);
	}
}
