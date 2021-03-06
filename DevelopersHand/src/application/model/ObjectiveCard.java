/**
 * 
 */
package application.model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * This class enables the creation of an ObjectiveCard which extends the card
 * card class with the exception of three new fields: int goal, int progress,
 * and String stat, and has two new methods: goalMet and updateProgress.
 * 
 * @author Colby Bailey (nib667), Ahmet Bilici (ejr617), Jack Huerta (qhq704), Hezron Perez (uih310), Antonio
 *         Valenciana (qpd898). 
 *         UTSA CS 3443 - Group 07. 
 *         Spring 2022 
 */
public class ObjectiveCard extends Card {

	private int goal;
	private int progress;
	private String stat;

	/**
	 * @param n
	 * @param d
	 * @param p
	 * @param s
	 * @param c
	 */
	public ObjectiveCard(String n, String d, Image p, String s, Color c, int goal, String stat) {
		super(n, d, p, s, c);
		this.setDescription("RP " + Integer.valueOf(d));
		this.setGoal(goal);
		this.setProgress(0); // Sets progress to 0
		this.setStat(stat);
	}

	/**
	 * @return the goal
	 */
	public int getGoal() {
		return goal;
	}

	/**
	 * @param goal the goal to set
	 */
	private void setGoal(int goal) {
		this.goal = goal;
	}

	/**
	 * @return the progress
	 */
	public int getProgress() {
		return progress;
	}

	/**
	 * @param progress the progress to set
	 */
	public void setProgress(int progress) {
		this.progress = progress;
	}

	/**
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * @param stat the stat to set
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}

	/**
	 * This method parses a card description and increases/decreases
	 *                 if this.stat is in the description
	 * @param cardDesc 
	 */
	public void updateProgress(String cardDesc) {

		String parseArray[] = cardDesc.split("&");

		for (String parse : parseArray) {
			String space[] = parse.split(" ");

			if (stat.equalsIgnoreCase(space[0])) {
				if (stat.equalsIgnoreCase("rp")) {
					if (!(space[0].startsWith("-"))) {
						progress += Integer.valueOf(space[1]);
					}
				} else {
					progress += Integer.valueOf(space[1]);
				}

			}
			if (stat.equalsIgnoreCase("xp") && !space[0].equalsIgnoreCase("xp") && !space[0].equalsIgnoreCase("rp")) {
				progress += Integer.valueOf(space[1]);
			}
		}

	}
	
	public boolean goalMet() {
		return progress >= goal;
	}

}
