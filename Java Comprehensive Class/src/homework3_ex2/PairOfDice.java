/**
 * 
 */
package homework3_ex2;

/**
 * @author zijaz
 *
 */
public class PairOfDice{

	/**
	 * 
	 */
	private int diceFaces = 0;
	private int diceValue1 = 0;
	private int diceValue2 = 0;
	
	public PairOfDice(){
		// default to six-sided dice
		diceFaces = 6;
	}
	public PairOfDice(int sides){
		// allow a variable number of sides
		diceFaces = sides;
	}
	public void roll(){
		diceValue1  = randomWithRange(0,diceFaces);
		diceValue2  = randomWithRange(0,diceFaces);
	}
	public int getValue1(){
		// get value of die1
		return diceValue1;
	}
	public int getValue2(){
		// get value of die2
		return diceValue2;
	}
	public int getSum(){
		// get the sum of both dice
		return diceValue1 + diceValue2;
	}
	static private int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
