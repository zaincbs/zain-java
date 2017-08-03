/**
 * 
 */
package homework1_ex3;

import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class TempCalculator {

	/**
	 * 
	 */
	public TempCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static double tempConvertor(double temp){
		return  (temp-32) * (5.0/9.0);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cont;
		while (true) {

			System.out.print("Enter degrees in Fahrenheit:");
			double userInput = input.nextDouble();
			cont = input.nextLine();

			System.out.printf("Degrees in Celsius: %.2f\n", tempConvertor(userInput));
			System.out.println("Continue? (y/n):");
			cont = input.nextLine();
			if ( cont.equals("y") || cont.equals("Y")){
				continue;
			}
			else{
				input.close();
				break;
			}
		}
	}
}
