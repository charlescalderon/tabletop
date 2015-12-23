package lib;

import java.util.Random;

public class Dice {

	private static final int D4 = 4;
	private static final int D6 = 6;
	private static final int D8 = 8;
	private static final int D10 = 10;
	private static final int D12 = 12;
	private static final int D20 = 20;
	
	/**
	 * @param num	number of rolls to run
	 * @param die	the type of die to roll (D4, D6, D8, D10, D12, D20)
	 * @return		integer array with roll results
	 */
	public int[] roll(int num, int die) {
		
		int rollNum; // Number of rolls
		int rollDie; // Die type
		
		int[] results; // Results array
		
		Random randGen = new Random(); // Random number generator
		
		// Validate number of rolls, or set to default
		if (num <= 0) {
			rollNum = 1;
		} else {
			rollNum = num;
		}
		
		// Size result to match number of rolls
		results = new int[rollNum];
		
		// Validate die choice
		switch (die) {
			// D&D die options
			case 4: rollDie = D4; break;
			case 6: rollDie = D6; break;
			case 8: rollDie = D8; break;
			case 10: rollDie = D10; break;
			case 12: rollDie = D12; break;
			case 20: rollDie = D20; break;
			default: rollDie = D6; break; // Default to D6
		}
		
		// Perform rolls
		int n = 0;
		
		while (n < rollNum) {
			results[n] = (int)randGen.nextInt(rollDie) + 1;
			n++;
		}
		
		return results;
	}
	
}