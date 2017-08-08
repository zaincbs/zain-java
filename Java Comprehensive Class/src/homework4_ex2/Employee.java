package homework4_ex2;

public class Employee extends Person {

	String ssn;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void setSSN(String ssNumber) {
		this.ssn = ssNumber;
	}

	public String getSSN() {
		return ssn;
	}

	@Override
	String getDisplayText() {
		// TODO Auto-generated method stub
		return super.toString() + "SSN Number:" + this.ssn + "\n";
	}
}
