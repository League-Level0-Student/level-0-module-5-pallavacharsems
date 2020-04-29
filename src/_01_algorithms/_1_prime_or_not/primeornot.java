package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {

	
	
	String number = JOptionPane.showInputDialog("Type a number, any number!");
	
	int num = Integer.parseInt(number);
	boolean s = true;
	for (int i = 2; i < num; i++) {
if(num%i== 0) {
s=false;
}

	
	}
if (s == false) {
	JOptionPane.showMessageDialog(null, "Your number is not prime!");	
}else {
	JOptionPane.showMessageDialog(null, "Your number is prime!");
}
	
	
	
	
	
	
	
	
}
}
