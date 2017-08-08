/**
 * 
 */
package homework4_ex2;

import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class PersonApp {

	/**
	 * 
	 */
	public PersonApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Person Tester application");
		
		Scanner sc = new Scanner(System.in);
		String personChoice;
		
		MyValidator validateData = new MyValidator(sc);
		personChoice = validateData.getChoiceString("Create customer or employee? (c/e):", "c", "e");
		
		
	}

}
