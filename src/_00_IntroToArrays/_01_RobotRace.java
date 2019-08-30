package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robotArray = new Robot[5];

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i] = new Robot();
			robotArray[i].setX(i * 100 + 5);
			robotArray[i].setY(300);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		boolean isRacing = true;

		while (isRacing) {
			for (int j = 0; j < 36; j++) {

				for (int i = 0; i < robotArray.length; i++) {
					int randy = rand.nextInt(50);
					robotArray[i].move(70 );
					robotArray[i].turn(10);
					
					robotArray[i].setSpeed(randy);
					robotArray[i].sparkle();
					robotArray[i].setRandomPenColor();
					robotArray[i].penDown();
					if (robotArray[i].getY() <= 0) {
						isRacing = false;
					}
				}
			}

			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

			// 7. declare that robot the winner and throw it a party!

			// 8. try different races with different amounts of robots.

			// 9. make the robots race around a circular track.

		}
	}
}
