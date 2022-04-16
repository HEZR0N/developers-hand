package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



/** 
 * This class is a basic definition of a Player object. It contains 
 * a definition, constructor, getters, and setters.
 */
public class Player {

	private static String name;
	private static ArrayList<Card> hand = new ArrayList<Card>();
	private static String objective;
	private static int xp;
	private static int rp;
	private static int bugs;
	private static int coding;
	private static int documentation;
	private static int git;
	private static int product;
	private static int troubleshooting;

	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		Player.name = name;
	}

	/**
	 * @return the objective
	 */
	public static String getObjective() {
		return objective;
	}

	/**
	 * @param objective the objective to set
	 */
	public static void setObjective(String objective) {
		Player.objective = objective;
	}

	/**
	 * @return the xp
	 */
	public static int getxp() {
		return xp;
	}

	/**
	 * @param xp the xp to set
	 */
	public static void setxp(int xp) {
		Player.xp = xp;
	}

	/**
	 * @return the rp
	 */
	public static int getrp() {
		return rp;
	}

	/**
	 * @param rp the rp to set
	 */
	public static void setrp(int rp) {
		Player.rp = rp;
	}

	/**
	 * @return the bugs
	 */
	public static int getBugs() {
		return bugs;
	}

	/**
	 * @param bugs the bugs to set
	 */
	public static void setBugs(int bugs) {
		Player.bugs = bugs;
	}

	/**
	 * @return the hand
	 */
	public static ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public static void setHand(ArrayList<Card> hand) {
		Player.hand = hand;
	}
	
	/**
	 * @param c The card to remove from Player.hand
	 */
	public static void removeFromHand(Card c) {
		Player.hand.remove(c);
	}

	/**
	 * @param c The card to add to Player.hand
	 */
	public static void addToHand(Card c) {
		Player.hand.add(c);
	}

	/**
	 * @return the coding
	 */
	public static int getCoding() {
		return coding;
	}

	/**
	 * @param coding the coding to set
	 */
	public static void setCoding(int coding) {
		Player.coding = coding;
	}

	/**
	 * @return the documentation
	 */
	public static int getDocumentation() {
		return documentation;
	}

	/**
	 * @param documentation the documentation to set
	 */
	public static void setDocumentation(int documentation) {
		Player.documentation = documentation;
	}

	/**
	 * @return the git
	 */
	public static int getGit() {
		return git;
	}

	/**
	 * @param git the git to set
	 */
	public static void setGit(int git) {
		Player.git = git;
	}

	/**
	 * @return the product
	 */
	public static int getProduct() {
		return product;
	}

	/**
	 * @param products the product to set
	 */ 
	public static void setProduct(int product) {
		Player.product = product;
	}

	/**
	 * @return the troubleshooting
	 */
	public static int getTroubleshooting() {
		return troubleshooting;
	}

	/**
	 * @param troubleshooting the troubleshooting to set
	 */
	public static void setTroubleshooting(int troubleshooting) {
		Player.troubleshooting = troubleshooting;
	}
	public static ArrayList<String>loadPlayers(String fileName) {
		File file = new File(fileName);
        ArrayList<String> players = new ArrayList<String>();
        try {

            // opening scanner to read through the file
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] tokens = line.split(",");
                // reading through the file to gather the information
                if (tokens != null && tokens.length != 0) {

                    String playerName = tokens[0];
                    players.add(playerName);
                    }

                 
                }
          

            // closing scanner
            scan.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return players;
    }
	public static String Validate(ArrayList<String> P, String n) {
		String S = null;
		for(String i: P) {
			if(i.equals(n)) {
				S = i;
		
			}
		}
		return S;
	}
	}
	
