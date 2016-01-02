package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class CavernsofThornvale extends Application {

	public static final String MAIN_SCREEN = "SplashGUI";
	public static final String MAIN_SCREEN_FXML = "splash.fxml";
	public static final String CHAR_SCREEN = "CharacterGUI";
	public static final String CHAR_SCREEN_FXML = "character.fxml";
	public static final String DICE_SCREEN = "DiceGUI";
	public static final String DICE_SCREEN_FXML = "dice.fxml";
	
	
	public static void main(String[] args) {
		System.out.println("Starting Caverns of Thornvale...");
		Application.launch(CavernsofThornvale.class, args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Caverns of Thornvale GUI launched.");
		
	}
	
}
