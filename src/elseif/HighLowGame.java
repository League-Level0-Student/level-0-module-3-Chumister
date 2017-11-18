//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(5);
		// 2. Print out the random variable above

		// 11. do the following 10 times
		for (int i = 0; i < 11; i++) {

		}
		// 1. ask the user for a guess using a pop-up window, and save their response
		String a = JOptionPane.showInputDialog("");
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int c = Integer.parseInt(a);
		// 5. if the guess is correct
		// 6. win\
		if (c == 9) {

			JOptionPane.showConfirmDialog(null, "You win!");

		}
		// 7. if the guess is high
		// 8. tell them it's too high
		if (c > 9) {
			JOptionPane.showConfirmDialog(null, "Too High!");

		}
		// 9. if the guess is low
		if (c < 9) {
			// 10. tell them it's too low
			JOptionPane.showConfirmDialog(null, "Too low!");
			// 12. tell them they lose
		}
	}
}
