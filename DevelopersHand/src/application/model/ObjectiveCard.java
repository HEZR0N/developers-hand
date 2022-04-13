/**
 * 
 */
package application.model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Valenciana22
 * This class enables the creation of an ObjectiveCard
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
	public ObjectiveCard(String n, String d, Image p, String s, Color c,
			int goal, String stat) {
		super(n, d, p, s, c);
		this.setDescription("RP +" + Integer.valueOf(d));
		this.setGoal(goal);
		this.setProgress(0); //Sets progress to 0
		this.setStat(stat);
	}
	/**
	 * @return the goal
	 */
	private int getGoal() {
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
	private int getProgress() {
		return progress;
	}
	/**
	 * @param progress the progress to set
	 */
	private void setProgress(int progress) {
		this.progress = progress;
	}
	/**
	 * @return the stat
	 */
	private String getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	private void setStat(String stat) {
		stat = stat;
	}

}
