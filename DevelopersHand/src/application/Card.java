package application;
import javafx.scene.image.Image;

/** 
 * This class is a basic definition of a Card object. It contains 
 * a definition, constructor, getters, and setters.
 */

public class Card {
	private String name;
	private String description;
	private Image picture;
	private String story;
	private int XP;
	private boolean isBug;
	private String color;
	private boolean drawCard;
	
	/**
	 * Constructor for a basic Card object.
	 * @param String n is the name of the Card.
	 */
	public Card(String n) {
		this.setName(n);
	}
	
	/**
	 * @return the name of the Card object.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @param n is the name of the Card object.
	 */
	public void setName(String n) {
		this.name = n;
	}
	
	/**
	 * @return the description of the Card object.
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * @param d is the description of the Card object.
	 */
	public void setDescription(String d) {
		this.description = d;
	}
	
	/**
	 * @return the picture of the Card object.
	 */
	public Image getPicture() {
		return this.picture;
	}
	
	/**
	 * @param p is the picture of the Card object.
	 */
	public void setPicture(Image p) {
		this.picture = p;
	}
	
	/**
	 * @return the story of the Card object.
	 */
	public String getStory() {
		return this.story;
	}
	
	/**
	 * @param s is the story of the Card object.
	 */
	public void setStory(String s) {
		this.story = s;
	}
	
	/**
	 * @return the XP of the Card object.
	 */
	public int getXP() {
		return this.XP;
	}
	
	/**
	 * @param xp is the XP of the Card object.
	 */
	public void setXP(int xp) {
		this.XP = xp;
	}
	
	/**
	 * @return true if Card object is a bug, or false otherwise.
	 */
	public boolean isBug() {
		if(this.isBug == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @param b is the boolean value to set for isBug in Card object.
	 */
	public void setBug(boolean b) {
		if(b == true) {
			this.isBug = true;
		}
		else {
			this.isBug = false;
		}
	}
	
	/**
	 * @return the color of the Card object.
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * @param c is the color to set the Card object.
	 */
	public void setColor(String c) {
		this.color = c;
	}
	
	/**
	 * @return true if this Card object results in drawing any cards, false otherwise.
	 */
	public boolean drawAnything() {
		if(this.drawCard == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @param b is the boolean value to set drawCard to in Card object.
	 */
	public void setDraw(boolean b) {
		if(b == true) {
			this.drawCard = true;
		}
		else {
			this.drawCard = false;
		}
	}
}