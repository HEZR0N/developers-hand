/**
 * 
 */
package application.model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * This class enables the creation of an ActionCard which extends the card class
 *
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022 
 */
public class ActionCard extends Card {

	/**
	 * @param n
	 * @param d
	 * @param p
	 * @param s
	 * @param c
	 */
	public ActionCard(String n, String d, Image p, String s, Color c) {
		super(n, d, p, s, c);
	}

}
