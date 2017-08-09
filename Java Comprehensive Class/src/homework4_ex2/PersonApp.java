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

		String custNumber = null;
		String ssnNumber = null;
		String [] personInfo = new String[3];

		getPersonInfo(validateData,  personInfo);
		switch (personChoice) {
		case "c": {
			custNumber = getCustInfo(validateData);
			Customer csData = new Customer();
			csData.setFirstName(personInfo[0]);
			csData.setLastName(personInfo[1]);
			csData.setEmail(personInfo[2]);
			csData.setCustomerNumber(custNumber);
			System.out.println(csData.getDisplayText());
			break;
		}
		case "e":
			ssnNumber = getEmpInfo( validateData );
			Employee csData = new Employee();
			csData.setFirstName(personInfo[0]);
			csData.setLastName(personInfo[1]);
			csData.setEmail(personInfo[2]);
			csData.setSSN(ssnNumber);
			System.out.println(csData.getDisplayText());
			break;
		default:
			break;
		}

	}

	private static void getPersonInfo(MyValidator validateData, String [] personInfo) {
		personInfo[0] = validateData.getRequiredString("Enter first name:");
		personInfo[1] = validateData.getRequiredString("Enter last name:");
		personInfo[2] = validateData.getRequiredString("Enter email address:");
	}

	private static String getEmpInfo(MyValidator validateData) {
		return validateData.getRequiredString("Social security number:");
	}

	private static String getCustInfo(MyValidator validateData ) {
		return validateData.getRequiredString("Customer number:");
	}
}
