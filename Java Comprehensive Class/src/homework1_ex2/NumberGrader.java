package homework1_ex2;

import java.util.Scanner;

public class NumberGrader {

	public NumberGrader() {
		// TODO Auto-generated constructor stub
	}

	public static String gradeCalculator(double score) {

		String finalScore = new String();
		if (score < 100 && score >= 88) {
			finalScore = "A";
		} else if (score < 87 && score >= 80) {
			finalScore = "B";
		} else if (score < 79 && score >= 67) {
			finalScore = "C";
		} else if (score < 66 && score >= 60) {
			finalScore = "D";
		} else if (score < 60) {
			finalScore = "F";
		}
		return finalScore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cont;
		while (true) {

			System.out.print("Enter Numberical grade:");
			double userInput = input.nextDouble();
			cont = input.nextLine();

			System.out.println("Letter Grade: " + gradeCalculator(userInput));
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
