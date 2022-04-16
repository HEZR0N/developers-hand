package application.model;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/** 
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
		
		String reward = " ";
		ArrayList<String> tokens = new ArrayList<String>();
		
		Scanner tokenize = new Scanner(cardDesc);
		while (tokenize.hasNext()) {
		    tokens.add(tokenize.next());
		}

		int count = 0;
	      for (String token : tokens){
	         count++;
	         
	         if(count%2 == 1){ //adds first token to reward (i.e., Git)
	             reward += token;
	         }
	         
	         /** 
	          * if count is even, it will get the first char in the token, convert it to a string,
	          * then check to see if it is positive or negative, add the correct sign, and then
	          * adds it to reward
	          * */
	         if ( count%2 == 0 ){ 
	        	 char Csign = token.charAt(0);
	        	 String Ssign = String.valueOf(Csign);
	        	 
	        	 if(Ssign.equals("-")) {
	        		 reward += token;
	        	 }else {
	        		 reward += "+" + token + " "; //Unsure if whether or not to add the space at the end
	        	 }
	         }
	      }
		
		return reward; //returns the String reward
	}
}