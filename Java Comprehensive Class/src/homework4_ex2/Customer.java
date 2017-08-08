package homework4_ex2;

public class Customer extends Person {

	private int cutomerNumber;

	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getCustomerNumber() {
		return this.cutomerNumber;
	}

	public void setCustomerNumber(int number) {
		this.cutomerNumber = number;
	}

	@Override
	String getDisplayText() {
		// TODO Auto-generated method stub
		return super.toString() + "Customer Number:" + this.cutomerNumber + "\n";
	}

}
