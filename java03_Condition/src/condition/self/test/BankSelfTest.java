package condition.self.test;

public class BankSelfTest {
	public static void main(String[] args) {
		
		
		Account acc = new Account(10000);
		
		acc.deposit(2000);
		acc.deposit(1500);
		acc.deposit(100);
		System.out.println("잔액확인 1 ::"+acc.getBalance()+"원");
		
		acc.withdraw(8000);
		acc.withdraw(7000);
		System.out.println("잔액확인 2 ::"+acc.getBalance()+"원");
		
	}

}
/*
 * 1. 입금하려는 금액이 1000원 이상일때만 입금을 허용
 *    그렇지 않다면 "입금액은 1000원 이상이어야함!!"을 출력
 * 2. 출금하려는 금액은 입금액이 잔액보다 크면 안되도록 함
 *    그렇지 않다면 "~~~" 출력
 */


class Account {
	double balance;

	public Account(double balance) {
			this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		if(amount < 1000) {
			System.out.println("===1000원이상 입금해야합니다");
		}
		else balance += amount;
		
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("출금액이 너무 큽니다");
		}
		else balance -= amount;
		//balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
}
