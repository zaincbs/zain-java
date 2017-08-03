/**
 * 
 */
package homework2_ex1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author zijaz
 *
 */
public class InterestCalculator {

	double loanAmount = 0.00;
	double interestRate = 0.00;

	/**
	 * 
	 */
	public InterestCalculator(double loanAmount, double interestRate) {
		// TODO Auto-generated constructor stub
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public void printData() {
		BigDecimal decimalAmount = new BigDecimal(loanAmount);
		BigDecimal decimalRate = new BigDecimal(interestRate);
		BigDecimal decimalInterestPaid = decimalAmount.multiply(decimalRate);

		decimalAmount = decimalAmount.setScale(2, RoundingMode.HALF_UP);
		decimalRate = decimalRate.setScale(5, RoundingMode.HALF_UP);
		decimalInterestPaid = decimalInterestPaid.setScale(2, RoundingMode.HALF_UP);

		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		percentFormat.setMinimumFractionDigits(3);
		moneyFormat.setMinimumFractionDigits(2);

		System.out.printf("Loan amount:      %s\n", moneyFormat.format(loanAmount));
		System.out.printf("Interest Rate:    %s\n", percentFormat.format(decimalRate));
		System.out.printf("Interest:         %s\n", moneyFormat.format(decimalInterestPaid));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter Loan Amount:");
			double loanAmount = input.nextDouble();
			System.out.println("Enter Interest Rate:");
			double intrestRate = input.nextDouble();
			
			InterestCalculator tester = new InterestCalculator(loanAmount, intrestRate);
			tester.printData();

			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();
		}
		input.close();
	}

}
