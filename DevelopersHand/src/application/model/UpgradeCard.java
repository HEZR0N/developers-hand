/**
 * 
 */
package application.model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 *  @author Colby Bailey, Ahmet Bilici, Jack Huerta, Hezron Perez, Antonio Valenciana
 * This class enables the creation of an UpgradeCard which extends the card card class
 *
 */
public class UpgradeCard extends Card {

	/**
	 * @param n
	 * @param d
	 * @param p
	 * @param s
	 * @param c
	 */
	public UpgradeCard(String n, String d, Image p, String s, Color c) {
		super(n, d, p, s, c);
	}

}
