/**
 * 
 */
package homework1_ex1;

import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class TestRectangleCalculator {

	/**
	 * 
	 */
	public TestRectangleCalculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float[] userData;
		String cont;
		
		// TODO Auto-generated method stub
		while (true) {
			InputHandler getValue = new InputHandler();
			userData = getValue.getFloatValues();
			RectangleCalculator data = new RectangleCalculator(userData[0], userData[1]);
			System.out.printf("%-10s", "Area:");
			System.out.printf("%10.2f\n", data.area());
			System.out.printf( "%-10s", "Perimiter:" );
			System.out.printf( "%10.2f\n", data.perimter() );
			
			System.out.println("Continue? (y/n):");
			
			Scanner input = new Scanner(System.in);
			
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
