
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot Camry = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		Camry.setX(10);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
		Camry.penDown();
		Camry.setSpeed(100);
		for (int i = 0; i < 13; i++) {
			Camry.setAngle(90);

			for (int j = 0; j < 5; j++) {
				Camry.penDown();
				Camry.move(30);
				Camry.turn(144);
				Camry.penUp();
			}

			Camry.move(100);
		}
		// 3. Set the size of the star to 30.
		Camry.penUp();
		Camry.move(500);
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
