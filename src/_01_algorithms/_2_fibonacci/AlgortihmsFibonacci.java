package _01_algorithms._2_fibonacci;

public class AlgortihmsFibonacci {
public static void main(String[] args) {

int number1 = 0;
int number2 = 1;
System.out.println(number1);
System.out.println(number2);
//0 1 1 2 3 5 8 13 21	
for (int i = 0; i < 11; i++) {
		int sum = number1+number2;
		System.out.println(sum);
		number1 = number2;
		number2 = sum;
	}
	
	
	
	
	
}
}
