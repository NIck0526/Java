package kosta.banking;

public class Account {
	double balance;//10,000--> 20,000

	public Account(double balance) {
			this.balance = balance;
	}
	
	public void deposit(double amount) {//10,000
		balance += amount;
		//balance = balance+amount; =  balance += amount; ���� ǥ���Դϴ�.
		//deposit, withdraw �� amount �� �ٸ� ��. �̰��� ���ú��� �Դϴ�. �� Breath �ȿ����� ��밡��
	}
	public void withdraw(double amount) {
		balance -= amount;
		//balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
}
