package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot SwagLord = new Robot();
		for (int i = 0; i < 3; i++) {
			SwagLord.penDown();
			SwagLord.setSpeed(100);
			SwagLord.move(300);
			SwagLord.turn(120);
			
		}
		
	


	
		
		
	}
}
