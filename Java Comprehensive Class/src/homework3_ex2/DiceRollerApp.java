/**
 * 
 */
package homework3_ex2;

import java.util.Scanner;



/**
 * @author zijaz
 *
 */
public class DiceRollerApp {

	/**
	 * 
	 */
	public DiceRollerApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static String specialMessageConverter( int diceValue1, int diceValue2){
		if((diceValue1+diceValue2) == 7){
			return "Craps!";
		}
		else if( diceValue1 == 1 && diceValue2 == 1){
			return  "Snake Eyes!"; 
		}
		else if( diceValue1 == 6 && diceValue2 == 6 ){
			return "Box cars";
		}
		else{
			return "";
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice = "y";
		int rollCount = 1;

		PairOfDice dice = new PairOfDice();

		System.out.printf("Roll the dice? (y/n):\n");
		choice = input.nextLine();
		while (choice.equalsIgnoreCase("y")) {
			dice.roll();
			System.out.printf("Roll %d:\n%d\n%d\n", rollCount, dice.getValue1(), dice.getValue2());
			System.out.printf("Roll again? (y/n):\n");
			System.out.printf("%s", specialMessageConverter( dice.getValue1(), dice.getValue2() ) );
			choice = input.nextLine();
		}
		input.close();

		System.out.println("Goodbye.");
	}
}
