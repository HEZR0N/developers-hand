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
	 * This is a constructor for a basic Card object.
	 * @param String 
	 */
	public Card(String n) {
		this.setName(n);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public Image getPicture() {
		return this.picture;
	}
	public void setPicture(Image p) {
		this.picture = p;
	}
	public String getEvent() {
		return this.event;
	}
	public void setEvent(String e) {
		this.event = e;
	}
}