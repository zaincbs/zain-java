package homework3_ex2;

public class Dice {

	private int diceFaces = 0;
	private int diceValue = 0;
	
	public Dice() {
		// TODO Auto-generated constructor stub
		diceFaces = 6;
	}
	
	public Dice( int sides) {
		// TODO Auto-generated constructor stub
		diceFaces = sides;
	}
	
	public void roll(){
		diceValue  = randomWithRange(0,diceFaces);
	}
	public int getValue(){
		return diceValue;
	}
	
	static private int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
