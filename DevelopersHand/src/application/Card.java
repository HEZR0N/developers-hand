/** 
 * This class is a basic definition of a Card object. It contains 
 * a definition, constructor, getters, and setters.
 */

package application;

import javafx.scene.image.Image;

public class Card {
	private String name;
	private String description;
	private Image picture;
	private String event;
	
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
	 * 
	 * @return the event of the Card object.
	 */
	public String getEvent() {
		return this.event;
	}
	
	/**
	 * @param e is the event of the Card object.
	 */
	public void setEvent(String e) {
		this.event = e;
	}
}