package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot SwagLord = new Robot();

	
	void go() {
		 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		SwagLord.setSpeed(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int Length = (50);

		// 7. Do the following (up to step 10) 60 times
				for (int i = 0; i < 1000; i++) {
					
				

			// 9. Change the color of the pen to a random color
					SwagLord.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
					Length = Length + 1;
	
			// 5. call your drawTriangle() method using your length variable
					drawTriangle(Length);
	
			// 10. Turn the tortoise 6 degrees to the right
					SwagLord.turn(6);
				}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		SwagLord.penDown();
		SwagLord.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			
		SwagLord.move(length);
		SwagLord.turn(120);
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
