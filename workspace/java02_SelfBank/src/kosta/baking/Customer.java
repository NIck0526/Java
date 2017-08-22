package kosta.baking;

public class Customer {
	String firstName;
	String lastName;
	int ssn;
	Account account;
	
	public Customer(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
	
}
