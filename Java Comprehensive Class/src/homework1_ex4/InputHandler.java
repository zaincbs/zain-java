/**
 * 
 */
package homework1_ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class InputHandler {

	/**
	 * 
	 */
	Scanner input;
	
	public InputHandler() {
		input = new Scanner(System.in);
	}

	public float [] getFloatValues() {
		float[] userChoices = new float[2];
		do {
			try {
				System.out.println("Enter miles:");
				userChoices[0] = input.nextFloat();
				System.out.println("Enter miles per hour:");
				userChoices[1] = input.nextFloat();
				input.nextLine();
				break;
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid choice, please re-enter your choice:");
				input.nextLine();
			}
		} while (true);
		return userChoices;
	}
	
	public void cleanUp(){
		input.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
