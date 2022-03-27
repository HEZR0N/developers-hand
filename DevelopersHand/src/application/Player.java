package application;

import java.util.*;

public class Player {
  
  private String name;
  private ArrayList<String> skills;
  //private ArrayList<Card> deck;
  private String objective;
  private int XP;
  private int bugs;
  
  public Player(String name){
	this.setName(name);
  }

/**
 * @return the name
 */
private String getName() {
	return name;
}

/**
 * @param name the name to set
 */
private void setName(String name) {
	this.name = name;
}

/**
 * @return the skills
 */
private ArrayList<String> getSkills() {
	return skills;
}

/**
 * @param skills the skills to set
 */
private void setSkills(ArrayList<String> skills) {
	this.skills = new ArrayList<String>();
}

/**
 * @return the objective
 */
private String getObjective() {
	return objective;
}

/**
 * @param objective the objective to set
 */
private void setObjective(String objective) {
	this.objective = objective;
}

/**
 * @return the xP
 */
private int getXP() {
	return XP;
}

/**
 * @param xP the xP to set
 */
private void setXP(int XP) {
	XP = XP;
}

/**
 * @return the bugs
 */
private int getBugs() {
	return bugs;
}

/**
 * @param bugs the bugs to set
 */
private void setBugs(int bugs) {
	this.bugs = bugs;
}
  
  
  
  
  
}
