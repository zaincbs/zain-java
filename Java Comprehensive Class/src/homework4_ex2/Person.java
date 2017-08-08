package homework4_ex2;

public abstract class Person {

	private String nameFirst;
	private String nameLast;
	private String emailAddr;

	public Person() {

	};

	public void setFirstName(String name) {
		this.nameFirst = name;
	};

	public String getFirstName() {
		return this.nameFirst;
	};

	public void setLastName(String name) {
		this.nameLast = name;
	};

	public String getLastName() {
		return this.nameLast;
	};

	public void setEmail(String email) {
		this.emailAddr = email;
	};

	public String getEmail() {
		return this.emailAddr;
	};

	@Override
	public String toString() {
		return "Name: "+ this.nameFirst + " " + this.nameLast + "\n" + "Email: "+ this.emailAddr + "\n";
	}

	abstract String getDisplayText();
}
