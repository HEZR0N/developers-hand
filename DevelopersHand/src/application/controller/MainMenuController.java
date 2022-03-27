package application.controller;

import java.io.File;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button buttonAbout;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonRules;

    @FXML
    void goPlay(ActionEvent event) {
    	try {
    	URL playURL = new File("src/application/Sample.fxml").toURI().toURL();
    	borderPane = FXMLLoader.load(playURL);
    	Scene scene = new Scene(borderPane);
    	scene.getStylesheets().add(new File("src/application/application.css").toURI().toURL().toExternalForm());
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	stage.setScene(scene);
    	stage.show();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void goAbout(ActionEvent event) {
    	JFrame jFrame = new JFrame();
    	jFrame.setTitle("About");
    	JOptionPane.showMessageDialog(jFrame, "1.Press play\n"
    					   + "2.Main Game screen appears\n"
    					   + "3.Welcome message appears\n"
    					   + "4.Round 1 begins\n"
    					   + "5.Player draws a scenario card from intern deck\n"
    					   + "6.Player reads description and accepts card\n"
    					   + "   i.Objective appears in objective section\n"
    					   + "  ii.If a player plays an action card that is an objective, 3x XP gets added\n"
    					   + "7.Round 2 begins\n"
    					   + "8.Player Draws 2 action cards, reads, accepts\n"
    					   + "9.Round 3");
//    	Alert alert = new Alert(AlertType.INFORMATION);
//    	alert.setTitle("About");
//    	alert.setHeaderText("Game Procedure");
//    	alert.setContentText("1.Press play\n"
//    					   + "2.Main Game screen appears\n"
//    					   + "3.Welcome message appears\n"
//    					   + "4.Round 1 begins\n"
//    					   + "5.Player draws a scenario card from intern deck\n"
//    					   + "6.Player reads description and accepts card\n"
//    					   + "   i.Objective appears in objective section\n"
//    					   + "  ii.If a player plays an action card that is an objective, 3x XP gets added\n"
//    					   + "7.Round 2 begins\n"
//    					   + "8.Player Draws 2 action cards, reads, accepts\n"
//    					   + "9.Round 3");
//    	alert.show();
    }

    @FXML
    void goRules(ActionEvent event) {
    	JFrame jFrame = new JFrame();
    	jFrame.setTitle("Rules");
    	JOptionPane.showMessageDialog(jFrame, "1.Each round a player can either\n"
				+ "	  i.Draw a scenario card and get an objective (Card added to hand)\n"
				+ "		a.You can only ever have one objective. Drawn another, and current objective is overwritten.\n"
				+ "	 ii.Draw 2 action cards\n"
				+ " iii.Draw 1 action card and play 1 action card\n"
				+ "  iv.Play 2 action cards\n"
				+ "2.When playing an action card, what can happen\n"
				+ "   i.Skill level up (Gain XP, possible objective)\n"
				+ "  ii.Code merged (Gain XP, possible objective)\n"
				+ " iii.Bug introduced (Lose Current Objective, Gain one bug)\n"
				+ "  iv.To resolve a bug, player selects card, clicks resolve, and loses one action card (Gains XP, possible objective)\n"
				+ "3.Lose Condition: have 3 unresolved bugs (Shows poor time management and lack of skill)\n"
				+ "4.Win Condition: Gain 123 XP: Get promoted from intern to developer!\n"
				+ "5.Strategy\n"
				+ "   i.May want to hold on to action cards until a certain skill higher (player.XP+=card.XP+player.getSkillLevel(cardSkill)*2)\n"
				+ "  ii.May want to draw a different scenario/objective\n"
				+ " iii.May want to resolve bug");
//    	Alert alert = new Alert(AlertType.INFORMATION);
//    	alert.setTitle("Rules");
//    	alert.setHeaderText("Rules");
//    	alert.setContentText("1.Each round a player can either\n"
//    						+ "	  i.Draw a scenario card and get an objective (Card added to hand)\n"
//    						+ "		a.You can only ever have one objective. Drawn another, and current objective is overwritten.\n"
//    						+ "	 ii.Draw 2 action cards\n"
//    						+ " iii.Draw 1 action card and play 1 action card\n"
//    						+ "  iv.Play 2 action cards\n"
//    						+ "2.When playing an action card, what can happen\n"
//    						+ "   i.Skill level up (Gain XP, possible objective)\n"
//    						+ "  ii.Code merged (Gain XP, possible objective)\n"
//    						+ " iii.Bug introduced (Lose Current Objective, Gain one bug)\n"
//    						+ "  iv.To resolve a bug, player selects card, clicks resolve, and loses one action card (Gains XP, possible objective)\n"
//    						+ "3.Lose Condition: have 3 unresolved bugs (Shows poor time management and lack of skill)\n"
//    						+ "4.Win Condition: Gain 123 XP: Get promoted from intern to developer!\n"
//    						+ "5.Strategy\n"
//    						+ "   i.May want to hold on to action cards until a certain skill higher (player.XP+=card.XP+player.getSkillLevel(cardSkill)*2)\n"
//    						+ "  ii.May want to draw a different scenario/objective\n"
//    						+ " iii.May want to resolve bug");
//    	alert.show();
    }

}
