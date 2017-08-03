/**
 * 
 */
package homework1_ex4;

import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class TestTimeCalculator {

	/**
	 * 
	 */
	public TestTimeCalculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputHandler get = new InputHandler();
		Scanner input = new Scanner(System.in);
		float[] data;
		int[] timeData;
		String cont;
		TimeCalculator getTime = new TimeCalculator();

		do {
			data = get.getFloatValues();

			timeData = getTime.timeCalulator(data[0], data[1]);
			System.out.printf("Hours %d\n", timeData[0]);
			System.out.printf("Minutes %d\n", timeData[1]);

			cont = input.nextLine();
			if (cont.equals("y") || cont.equals("Y")) {
				continue;
			} else
				input.close();
			break;
		} while (true);

	}

}
