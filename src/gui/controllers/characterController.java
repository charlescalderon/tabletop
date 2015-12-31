package gui.controllers;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import lib.Character;

public class characterController implements Initializable {

	@FXML private Text textStrength;
	@FXML private Text textDexterity;
	@FXML private Text textConstitution;
	@FXML private Text textIntelligence;
	@FXML private Text textWisdom;
	@FXML private Text textCharisma;
	
	@FXML private Text textModStrength;
	@FXML private Text textModDexterity;
	@FXML private Text textModConstitution;
	@FXML private Text textModIntelligence;
	@FXML private Text textModWisdom;
	@FXML private Text textModCharisma;
	
	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		
		Character character = new Character();
		Map<String, Integer> abilityScores = character.getCharacterScores();
		
		textStrength.setText(abilityScores.get("STR").toString());
		textDexterity.setText(abilityScores.get("DEX").toString());
		textConstitution.setText(abilityScores.get("CON").toString());
		textIntelligence.setText(abilityScores.get("INT").toString());
		textWisdom.setText(abilityScores.get("WIS").toString());
		textCharisma.setText(abilityScores.get("CHR").toString());
		
	}
	
}