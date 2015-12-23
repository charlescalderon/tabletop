package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class diceController {
	@FXML private Text diceText;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
    	
    	Object source = event.getSource();
    	Button button = (Button) source;
    	
    	diceText.setText(button.getId() + "...");
    }
}
