package lib;

import java.util.HashMap;
import java.util.Map;

public class Character {
	
	private int strength = 0;
	private int dexterity = 0;
	private int consitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private Dice die = new Dice();
	
	public void Character() {
		
	}
	
	private void generate() {
		// Strength
		for (int i: die.roll(3, 6)) {
			strength += i;
		}
		// Dexterity
		for (int i: die.roll(3, 6)) {
			dexterity += i;
		}
		// Constitution
		for (int i: die.roll(3, 6)) {
			consitution += i;
		}
		// Intelligence
		for (int i: die.roll(3, 6)) {
			intelligence += i;
		}
		// Wisdom
		for (int i: die.roll(3, 6)) {
			wisdom += i;
		}
		// Charisma
		for (int i: die.roll(3, 6)) {
			charisma += i;
		}
	}
	
	public Map<String, Integer> getCharacterScores() {
		// Character a map with score name, score value
		Map<String, Integer> abScores = new HashMap<String, Integer>();
		// Generate scores
		this.generate();
		// Add scores to the map
		abScores.put("STR", strength);
		abScores.put("DEX", dexterity);
		abScores.put("CON", consitution);
		abScores.put("INT", intelligence);
		abScores.put("WIS", wisdom);
		abScores.put("CHR", charisma);
		// Return scores
		return abScores;
	}
}
