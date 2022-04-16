package application.model;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/** 
 * @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio Valenciana
 * This class is a basic definition of a Card object. It contains 
 * a definition, constructor, getters, and setters.
 */

public class Card {
	private String name;
	private String description;
	private Image picture;
	private String story;
	private Color color;
	
	/**
	 * Constructor for a basic Card object.
	 * @param String n is the name of the Card.
	 * @param String d is the description of the Card.
	 * @param Image p is the picture of the Card.
	 * @param String s is the story of the Card.
	 * @param String c is the color of the Card.
	 */
	public Card(String n, String d, Image p, String s, Color c) {
		this.setName(n);
		this.setDescription(d);
		this.setPicture(p);
		this.setStory(s);
		this.setColor(c);
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
	 * @return the color of the Card object.
	 */
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * @param c is the color to set the Card object.
	 */
	public void setColor(Color c) {
		this.color = c;
	}
	
	/**
	 * @param cardDesc is the description that we want to return
	 * @return the String description of a card
	 */
	public String getReward(String cardDesc) {
		String rewardFinal = "";
		
		String rewardArray[] = cardDesc.split(",");
                
		for(String reward: rewardArray) {
                    String space[] = reward.split(" ");
                    if(space[0].equalsIgnoreCase("RP")){
                        if(space[1].startsWith("-")){
                            rewardFinal += space[0] + space[1] + ", ";
                        }
                    } else {
                        rewardFinal += space[0] + "+" + space[1] + ", ";
                    }
		}
		
		return rewardFinal.substring(0, rewardFinal.length()-1);
	}
}