package gui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import lib.ControlledScreen;

public class splashController implements Initializable, ControlledScreen {

	screensController mainController;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void setScreenParent(screensController screenPage) {
		mainController = screenPage;
	}

}
