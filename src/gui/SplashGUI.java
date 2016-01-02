package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SplashGUI extends Application {

	public static void main(String[] args) {
		Application.launch(SplashGUI.class, args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("views/splash.fxml"));
        
        stage.setTitle("Caverns of Thornvale");
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("../img/D20.png")));
        stage.setScene(new Scene(root, 1280, 720));
        stage.show();
	}

	
}
