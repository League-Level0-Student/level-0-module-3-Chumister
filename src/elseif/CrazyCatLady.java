//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String marco = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int

 int num = Integer.parseInt(marco);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (num > 3) {
	JOptionPane.showInputDialog("Are u catwoman?");
	
}
		// 4. If they have 3 or less, call the method below to show them a cat video
if (num<3) {
	playVideo("https://youtu.be/oSB6LKlQEMc");
	
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if (num == 0) {
			playVideo("https://youtu.be/T9m6-FnbU2Q");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

