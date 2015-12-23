package gui;

import gui.DiceGUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceGUI extends Application {
	
	@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("dice.fxml"));
        
        stage.setTitle("AD&D Dice Toolkit");
        stage.setScene(new Scene(root, 1024, 768));
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(DiceGUI.class, args);
    }
}
