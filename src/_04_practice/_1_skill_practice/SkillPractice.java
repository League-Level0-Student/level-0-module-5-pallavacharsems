package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	 public static void main(String[] args) {

	SkillPractice skills = new SkillPractice();
	           skills.skill1();
	           skills.skill2();
	           skills.skill3();
	           skills.skill4();
	           skills.skill5();
	 }

	 void skill1() {
	// Use pop-ups for the following.
	// Ask the user how many dimes they have

String dimecounts = JOptionPane.showInputDialog("how many dimes do you have");
int count = Integer.parseInt(dimecounts);

	// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + count*10 + " cents!");



	// Ask the user how tall they are (inches)

String tall = JOptionPane.showInputDialog("How tall are you (in INCHES)");
int dtall = Integer.parseInt(tall); 

	// If they are shorter than 36 inches, tell them to eat their Wheaties

if (dtall < 36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!!!");
}else {
	JOptionPane.showMessageDialog(null, "You are looking good!!!");
}

	 }

	 void skill2() {// Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
	
}





	 }

	 void skill3() {// Get a random number that is less than 20 and print it to the console 
int y = 0;
Random num = new Random();
y = num.nextInt();
System.out.println(num);
	// Get another random number that is less than 10 and print it to the console 



	// Using a pop-up, tell the user the difference between the numbers// Hint: use subtraction 



		}

	 void skill4() {// In a pop-up, ask the user for the city they live in 



	// If they answered "San Diego", tell them they live in America's Finest City 



	// Otherwise, tell them to move to San Diego 



	// Create a variable - cars - and initialize it to the number of cars your family has.// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



	// If there is 1 car, use a pop-up to display the make/model of the car 



	// If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 



	 }

	 void skill5() {// In a pop-up, ask the user for the name of their school 



	// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 



	 }
	 }