/**
 * 
 */
package homework3_ex1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class CircleCalculator {

	/**
	 * 
	 */
	private double radius = 0;
	private double area = 0;
	private double circum = 0;
	static int objcount = 0;
	
	public static int getObjectCount(){
		return objcount;
	}

	public CircleCalculator(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
		objcount++;
	}

	public double getArea() {
		this.area = (Math.PI * radius * radius);
		return this.area;
	}

	public double getCircumference() {
		this.circum = 2 * Math.PI * radius;
		return this.circum;
	}

	public String getFormattedCircumference() {
		BigDecimal circum = new BigDecimal(this.getCircumference());
		circum = circum.setScale(2, RoundingMode.HALF_UP);
		return circum.toString();
	}

	public String getFormattedArea() {
		BigDecimal area = new BigDecimal(this.getArea());
		area = area.setScale(2, RoundingMode.HALF_UP);

		return area.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice = "y";
	
		InputHandler getUserInput = new InputHandler();

		System.out.printf("Welcome to the Circle Calculator\n");	
		while (choice.equalsIgnoreCase("y")) {
			double radiusInput = getUserInput.getDoubleValue();

			CircleCalculator tester = new CircleCalculator(radiusInput);
			System.out.printf("Circumference:    %s\nArea:             %s\n", tester.getFormattedCircumference(),tester.getFormattedArea());

			System.out.print("Continue? (y/n):");
			choice = input.next();
			System.out.println();
		}
		input.close();
		getUserInput.cleanUp();
		
		System.out.printf("Goodbye. You created %d Circle object(s).", CircleCalculator.getObjectCount());
	}
}
