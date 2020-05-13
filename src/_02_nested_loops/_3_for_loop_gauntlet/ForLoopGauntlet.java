package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int j = 100; j > 0; j--) {
			System.out.println(j);
		}

		for (int i = 0; i < 102; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 501; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(" is Even");
			} else {
				System.out.println(" is Odd");

			}
		}

		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2007; i < 2021; i++) {
			System.out.println(i + ", I was " + (i - 2007) + " years old");

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i);
				System.out.println(" " + j);

			}
		}
int u = 1;
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 4; j++) {
				System.out.print(" "+u);
				u = u+1;
			
			}
		System.out.println();
		}
		int s = 1;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(" "+s);
			s = s+1;
			}
		System.out.println();
		}
		
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < i-1 ; j++) {
			System.out.print(" * ");	
			}
		System.out.println();
		}
		
		
		
		
		

	}
}
