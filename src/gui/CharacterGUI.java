package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CharacterGUI extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("views/character.fxml"));
        
        stage.setTitle("AD&D Character Toolkit");
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("../img/D20.png")));
        stage.setScene(new Scene(root, 800, 768));
        stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(CharacterGUI.class, args);
	}

}
