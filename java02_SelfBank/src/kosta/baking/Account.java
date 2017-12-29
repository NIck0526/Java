package kosta.baking;

public class Account {
	double balance;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public void deposit(double amt) {
		//balance=balance + amt;
		balance +=amt;
	}
	public void withdraw(double amt) {
		balance -=amt;
	}
	public double getBalance() {
		return balance;
	}
}







