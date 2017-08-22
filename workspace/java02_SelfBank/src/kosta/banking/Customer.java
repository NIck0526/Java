package kosta.banking;

public class Customer {
	String firstName;
	String lastname;
	int ssn;
	Account account;

	public Customer(String firstName, String lastname, int ssn) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.ssn = ssn;
	}
	public void setAccount(Account acc){
		account = acc;
	}
	
	public Account getAccount(){
		return account;
	
	}
	
	
	

}
