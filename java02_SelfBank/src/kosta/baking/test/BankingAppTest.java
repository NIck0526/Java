package kosta.baking.test;

import kosta.baking.Account;
import kosta.baking.Customer;

public class BankingAppTest {

	public static void main(String[] args) {
		Customer custom = new Customer("James", "Gosling", 12345);
		
		//James가 통장을 하나 개설한다..
		custom.setAccount(new Account(10000.0));
		
		//James가 개설한 통장을 리턴받는다.
		//James가 개설한 통장의 기능을 사용할수 있다 : 입금, 출금, 잔액조회
		Account jamesAcc=custom.getAccount();
		
		System.out.println("=========== 입금 시작 =================");
		jamesAcc.deposit(3000.0);
		jamesAcc.deposit(5000.0);		
		System.out.println("=========== 출금 시작 =================");
		jamesAcc.withdraw(2000.0);
		
		System.out.println("=========== 잔액 조회 =================");
		System.out.println("Balance :: "+ jamesAcc.getBalance()+" 달러");	

	}
}












