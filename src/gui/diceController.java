package gui;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import lib.Dice;

public class diceController {
	@FXML private Text tickerText;
	@FXML private Text rollName;
    
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
    	final URL resource = getClass().getResource("../audio/d" + Integer.toString(die) + ".wav");
    	
    	// Play audio click
    	AudioClip dieRole = new AudioClip(resource.toString());
    	dieRole.play();
    	
    	tickerText.setText("You rolled 1D" + Integer.toString(die) + " and got " + Integer.toString(result));
    	rollName.setText(Integer.toString(result));
    }
}
