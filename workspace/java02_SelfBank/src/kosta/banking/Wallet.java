package kosta.banking;

public class Wallet {
	double balance;
	
	public Wallet(double balance) {
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
	}
	
	public String getBalance() {
		return "Blanace"+balance;
	}

}
