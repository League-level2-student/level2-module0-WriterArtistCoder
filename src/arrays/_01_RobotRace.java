package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] augh = new Robot[29];
		JOptionPane.showMessageDialog(null, "When you press OK the straight racers will prepare!");
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < augh.length; i++) {
			augh[i] = new Robot();
			augh[i].setWindowSize(600, 600);
			augh[i].setSpeed(100);
			augh[i].miniaturize();
			augh[i].setY(500);
			augh[i].setX((i + 1) * 20);
		}
		JOptionPane.showMessageDialog(null, "When you press OK the straight race will start!");
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean sentinal = true;
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (sentinal) {
			for (int i = 0; i < augh.length; i++) {
				augh[i].move(new Random().nextInt(50));
				if (augh[i].getY() <= 100) {
					JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " is the winner! *balloons* *confetti*");
					augh[i].sparkle();
					sentinal = false;
					break;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		JOptionPane.showMessageDialog(null, "When you press OK the round racers will prepare!");
		int[] turned = new int[augh.length];

		for (int i = 0; i < augh.length; i++) {
			turned[i] = 0;
			augh[i].setSpeed(100);
			augh[i].miniaturize();
			augh[i].setY(500);
			augh[i].setX(20);
		}
		
		JOptionPane.showMessageDialog(null, "When you press OK the round race will start!");
		sentinal = true;
		while (sentinal) {
			for (int i = 0; i < augh.length; i++) {
				augh[i].move(new Random().nextInt(100));
				if (augh[i].getY() <= 100 && augh[i].getX() < 500 && turned[i] == 0
						|| augh[i].getY() <= 100 && augh[i].getX() >= 500 && turned[i] == 1
						|| augh[i].getY() >= 500 && augh[i].getX() >= 500 && turned[i] == 2
						|| augh[i].getY() >= 500 && augh[i].getX() <= 100 && turned[i] == 3) {

					augh[i].turn(90);
					turned[i]++;
				}

				if (turned[i] == 3) {
					JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " is the winner! *balloons* *confetti*");
					augh[i].sparkle();
					sentinal = false;
					break;
				}
			}
		}

	}
}
