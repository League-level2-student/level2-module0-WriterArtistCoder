package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] augh = new Robot[29];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < augh.length; i++) {
			augh[i] = new Robot();
			augh[i].setWindowSize(600, 600);
			augh[i].setSpeed(100);
			augh[i].miniaturize();
			augh[i].setY(600);
			augh[i].setX((i+1)*20);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		boolean sentinal = true;
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while (sentinal) {
			for (int i = 0; i < augh.length; i++) {
				augh[i].move(new Random().nextInt(50));
				if (augh[i].getY() <= 0) {
					JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " is the winner! *balloons* *confetti*");
					sentinal = false;
					break;
				}
			}
		}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.
	
	//9. TODO make the robots race around a circular track.
	}
}
