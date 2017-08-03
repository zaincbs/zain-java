/**
 * 
 */
package homework3_ex1;
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

	public double getDoubleValue() {
		double userChoices = 0.00;
		do {
			try {
				System.out.println("Enter Radius:");
				userChoices = input.nextDouble();
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
