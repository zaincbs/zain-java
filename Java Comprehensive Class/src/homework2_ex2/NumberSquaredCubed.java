/**
 * 
 */
package homework2_ex2;

import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class NumberSquaredCubed {

	/**
	 * 
	 */
	public NumberSquaredCubed() {
		// TODO Auto-generated constructor stub
	}

	public void displaySqCuNumber(int number) {
		System.out.printf("%-10s%-12s%-12s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s%-12s%-12s\n", "======", "=======", "=====");
		for (int i = 1; i <= number; i++) {
			System.out.printf("%-10d%-12d%-12d\n", i, i * i, i * i * i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		System.out.printf("Welcome to the Squares and Cubes table\n");
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer:");
			int value = input.nextInt();
			NumberSquaredCubed tester = new NumberSquaredCubed();
			tester.displaySqCuNumber(value);
			
			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();
		}
		input.close();
	}
}
