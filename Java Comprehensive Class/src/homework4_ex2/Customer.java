package homework4_ex2;

public class Customer extends Person {

	private String cutomerNumber;

	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getCustomerNumber() {
		return this.cutomerNumber;
	}

	public void setCustomerNumber(String number) {
		this.cutomerNumber = number;
	}

	@Override
	String getDisplayText() {
		// TODO Auto-generated method stub
		return super.toString() + "Customer Number:" + this.cutomerNumber + "\n";
	}

}
