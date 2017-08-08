/**
 * 
 */
package homework4_ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class OOValidator {

	/**
	 * 
	 */
	protected Scanner input;

	public OOValidator(Scanner sc) {
		this.input = sc;
	}

	public int getInt(String prompt) {
		int userChoices = 0;
		do {
			try {
				System.out.println(prompt);
				userChoices = input.nextInt();
				input.nextLine();
				break;
			} catch (final InputMismatchException e) {
				System.out.println("Error! Invalid integer value. Try again.");
				input.nextLine();
			}
		} while (true);
		return userChoices;
	}

	public int getIntWithinRange(String prompt, int min, int max) {
		int userChoices = 0;
		do {
			userChoices = this.getInt(prompt);
			if (userChoices < min) {
				System.out.printf("Error! Number must be greater than %d\n", userChoices);
				continue;
			} else if (userChoices > max) {
				System.out.printf("Error! Number must be less than %d\n", userChoices);
				continue;
			} else {
				break;
			}
		} while (true);
		return userChoices;
	}

	public double getDouble(String prompt) {
		double userChoices = 0.00;
		do {
			try {
				userChoices = input.nextDouble();
				input.nextLine();
				break;
			} catch (final InputMismatchException e) {
				System.out.println(prompt);
				input.nextLine();
			}
		} while (true);
		return userChoices;
	}

	public double getDoubleWithinRange(String prompt, double min, double max) {

		return 0.00;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OOValidator vaTest = new OOValidator(sc);
		
		System.out.println("Int Test");
		vaTest.getIntWithinRange("Enter an integer between -100 and 100:", -100, 100);
		
		//System.out.println("Double Test");
		//System.out.println("Enter any number between -100 and 100:");
		sc.close();

	}

}
