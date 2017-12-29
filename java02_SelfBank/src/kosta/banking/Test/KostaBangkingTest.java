package kosta.banking.Test;

import kosta.banking.Account;
import kosta.banking.Customer;



public class KostaBangkingTest {
	public static void main(String[] args) {
	
	
	Customer c = new Customer("Gosling", "James", 13451);
	Customer d = new Customer("MM", "DD", 8905);
	
	c.setAccount(new Account(10000));
	d.setAccount(new Account(50000));
	
	//James가 개설한 통장을 리턴받는다.
	//James가 개설한 토장의 기능을 사용할수 있다 : 입금, 출금, 잔액조회
	Account jamesAcc = c.getAccount();
	
	//입금
	System.out.println("=====입금시작=====\n");
	double input = 3000.0;
	System.out.println(input+" 입금 시작 ");
	c.getAccount().deposit(input);
	
	
	double input2 = 5000.0;
	System.out.println(input2+" 입금 시작 ");
	c.getAccount().deposit(input2);
	
	System.out.println("======출금시작=====");
	c.getAccount().withdraw(2000);
	d.getAccount().deposit(10000);
	
	System.out.println("======잔액조회======");
	System.out.println("Ballance ::"+" $ "+c.getAccount().getBalance());
	System.out.println(d.getAccount().getBalance());
	}
}
/*james gosling 고객생성
 * JG가 잔액 1만원 이든 통장 개설
 * 개설한 통장을 리턴받아서
 * 3천원 입금, 5천원 입금,2천원 출금
 * 잔액확인 = 1.6만원
 * c.setAccount(new Account(10000)); 에서 왜 new를 해주는거지?

*/