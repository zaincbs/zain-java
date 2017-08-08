/**
 * 
 */
package homework4_ex2;

import java.util.Scanner;

import homework4_ex2.OOValidator;

/**
 * @author zijaz
 *
 */
public class MyValidator extends OOValidator {
	public MyValidator(Scanner sc) {
		super(sc);
	}

	public String getRequiredString(String prompt) {
		String userInput;

		do {
			System.out.println(prompt);
			userInput = super.input.nextLine();

			if (userInput.isEmpty()) {
				System.out.println("Error! This entry is required. Try again.");
				continue;
			} else {
				break;
			}
		} while (true);
		return userInput;
	}

	public String getChoiceString(String prompt, String s1, String s2) {
		String userInput;
		do{
			userInput = this.getRequiredString(prompt);
			if(userInput.equalsIgnoreCase(s1) || userInput.equalsIgnoreCase(s1) ){
				break;
			}
			else{
				System.out.printf("Error! Entry must be '%s' or '%s'. Try again.", s1, s2);
				continue;
			}
		}while(true);
		return userInput;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		MyValidator testVal = new MyValidator(sc);
		testVal.getChoiceString("Test", "x", "y");
	}
}
