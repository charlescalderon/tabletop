package gui.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import lib.Dice;

public class diceController implements Initializable {
	@FXML private Text tickerText;
	@FXML private Text rollName;
	
	private String tickerInitText = "Dice roll log";
    
	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		System.out.println("Initializing controller");
		tickerText.setText(tickerInitText);
	}
	
    @FXML protected void rollDice(ActionEvent event) {
    	
    	Object source = event.getSource();
    	Button button = (Button) source;
    	
    	int die = 0;
    	
    	switch (button.getId()) {
	    	case "dice-d4": die = 4; break;
	    	case "dice-d6": die = 6; break;
	    	case "dice-d8": die = 8; break;
	    	case "dice-d10": die = 10; break;
	    	case "dice-d12": die = 12; break;
	    	case "dice-d20": die = 20; break;
    	}
    	
    	Dice dice = new Dice();
    	int[] roll = dice.roll(1, die);
    	
    	int result = roll[0];
    	
    	// Set audio file for chosen die
    	final URL resource = getClass().getResource("../../audio/d" + Integer.toString(die) + ".wav");
    	
    	// Play audio click
    	AudioClip dieRole = new AudioClip(resource.toString());
    	dieRole.play();
    	
    	// Set roll result
    	rollName.setText(Integer.toString(result));
    	
    	/**
    	 * Ticker tape
    	 */
    	
    	// Current roll result
    	String currentRoll = "You rolled D" + Integer.toString(die) + " and got " + Integer.toString(result);
    	// Get existing rolls from ticker tape
    	String[] existingRolls = tickerText.getText().split("\\n");
    	// ArrayList for roll results
    	List<String> rollResults = new ArrayList<String>();
    	// String builder outputs roll results to UI
    	StringBuilder sb = new StringBuilder();
    	
    	// Add the current roll to the ticker
		System.out.println("Add current roll to rollResults list");
		rollResults.add(currentRoll);
    	
    	// If first roll in ticker tape, replace the default "Roll..." text
    	if (existingRolls.length >= 1) {
    		if (existingRolls[0].equals(tickerInitText)) {
    			System.out.println("Replace first roll default text on ticker tape");
    		} else {
    			// If not default, add current rolls up to 8 + current = 9 total rolls in history
    			int j = 8;
    			System.out.println("Adding existing rolls to rollResults list");
				for (String rollString: existingRolls) {
					if (j > 0) {
						rollResults.add(rollString);
					}
					j--;
				}			
    		}
    	}
    	
    	// Print out the results in reverse order
    	int i = 0;
    	while (i < rollResults.size()) {
    		System.out.println(rollResults.get(i));
    		sb.append(rollResults.get(i) + "\n");
    		i++;
    	}
    	
    	tickerText.setText(sb.toString().trim());
    }
}