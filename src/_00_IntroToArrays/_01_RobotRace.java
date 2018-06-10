package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robs = new Robot[5];
		//3. use a for loop to initialize the robots.
    	for (int i = 0; i < robs.length; i++) {
    		//4. make each robot start at the bottom of the screen, side by side, facing up
			robs[i] = new Robot((i * 150) + 100, 500);
		}
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	for (int i = 0; i < robs.length; i++) {
    		Random r = new Random();
			robs[i].move(r.nextInt(50));
		}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    	boolean winner = false;
    	int winningRobot = -1;
    	while(!winner) {
    		for (int i = 0; i < robs.length; i++) {
        		Random r = new Random();
    			robs[i].move(r.nextInt(50));
    			if(robs[i].getY() <= 0) {
    				winner = true;
    				winningRobot = i;
    				break;
    			}
    		}
    	}
		//7. declare that robot the winner and throw it a party!
    	JOptionPane.showMessageDialog(null, "The winner is Robot #" + winningRobot + "!");
    	
		//8. try different races with different amounts of robots.
    	/*****UP TO STUDENT*****/
    	
	    //9. make the robots race around a circular track.
    	
    	for (int i = 0; i < robs.length; i++) {
    		robs[i].setSpeed(100);
    		robs[i].penDown();
    		robs[i].setRandomPenColor();
    		robs[i].miniaturize();
			robs[i].moveTo(500, (i * 20) + 500);
			robs[i].setAngle(90);
		}
    	while(true) {
	    	for (int i = 0; i < robs.length; i++) {
	    		Random r = new Random();
	    		int rand = r.nextInt(50) + 1;
	    		for(int j = 0; j < rand; j++) {
	    			robs[i].move(i + 1);
	    			robs[i].turn(-1);
	    		}
			}
    	}
	}
}
