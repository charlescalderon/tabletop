package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TableTop extends Application {

	@Override
	
	public void start(Stage primaryStage) {
		
		// Set the stage
        primaryStage.setTitle("TableTop: AD&D Toolkit");
        
        // Create GridPane at root node
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        // Show grid lines for troubleshooting
        //grid.setGridLinesVisible(true);
        
        // Create the welcome text
        Text welcome = new Text("Welcome");
        welcome.setId("welcome");
        grid.add(welcome, 0, 0, 2, 1);
        
        // Create labels
        Label username = new Label("Username:");
        grid.add(username, 0, 1);
        Label password = new Label("Password:");
        grid.add(password, 0, 2);
        
        // Create fields
        TextField usernameField = new TextField();
        grid.add(usernameField, 1, 1);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);
        
        // Create a button
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        // Button action text
        final Text actionTarget = new Text();
        actionTarget.setId("actiontarget");
        grid.add(actionTarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	
        	@Override
        	public void handle(ActionEvent e) {
        		actionTarget.setText("Sign in button pressed.");
        	}
        });
        
        // Create the scene with the GridPane
        Scene scene = new Scene(grid, 300, 275);
        
        // Set the scene on the stage
        primaryStage.setScene(scene);
        
        // Style the scene on the stage
        scene.getStylesheets().add(TableTop.class.getResource("TableTopDesign.css").toExternalForm());
        
        primaryStage.show();
    }
	 
	public static void main(String[] args) {
        launch(args);
    }

}
	