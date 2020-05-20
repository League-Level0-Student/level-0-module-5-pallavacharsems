package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot ice = new Robot("mini");
public static void main(String[] args) {
	

	ice.penDown();
	ice.setSpeed(10);
	
	int CST = JOptionPane.showOptionDialog(null, "Out of three shapes, a CIRCLE, a TRIANGLE, and a SQUARE, which one would you like me to draw?", "Title", 0,
			JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Square", "Circle", "Triangle" }, null);

	
	if (CST == 2) {
		drawTriangle();
	} else if (CST== 1) {
		drawCircle();
	}else if (CST== 0) {
		drawSquare();
	}

}
	
	static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		ice.move(200);
		ice.turn(90);
	} 
	}
	static void drawCircle() {
		for (int i = 0; i < 36; i++) {
			ice.move(25);
			ice.turn(10);
		}
	}
	static void drawTriangle() {
		ice.setAngle(-90);
		for (int i = 0; i < 3; i++) {
			ice.move(200);
			ice.turn(120);
		}
	}
}