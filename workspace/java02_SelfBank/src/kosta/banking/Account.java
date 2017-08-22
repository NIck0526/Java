package kosta.banking;

public class Account {
	double balance;//10,000--> 20,000

	public Account(double balance) {
			this.balance = balance;
	}
	
	public void deposit(double amount) {//10,000
		balance += amount;
		//balance = balance+amount; =  balance += amount; 같은 표현입니다.
		//deposit, withdraw 의 amount 는 다른 것. 이것은 로컬변수 입니다. 그 Breath 안에서만 사용가능
	}
	public void withdraw(double amount) {
		balance -= amount;
		//balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
}
