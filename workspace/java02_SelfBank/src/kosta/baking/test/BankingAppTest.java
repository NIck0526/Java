package kosta.baking.test;

import kosta.baking.Account;
import kosta.baking.Customer;

public class BankingAppTest {

	public static void main(String[] args) {
		Customer custom = new Customer("James", "Gosling", 12345);
		
		//James�� ������ �ϳ� �����Ѵ�..
		custom.setAccount(new Account(10000.0));
		
		//James�� ������ ������ ���Ϲ޴´�.
		//James�� ������ ������ ����� ����Ҽ� �ִ� : �Ա�, ���, �ܾ���ȸ
		Account jamesAcc=custom.getAccount();
		
		System.out.println("=========== �Ա� ���� =================");
		jamesAcc.deposit(3000.0);
		jamesAcc.deposit(5000.0);		
		System.out.println("=========== ��� ���� =================");
		jamesAcc.withdraw(2000.0);
		
		System.out.println("=========== �ܾ� ��ȸ =================");
		System.out.println("Balance :: "+ jamesAcc.getBalance()+" �޷�");	

	}
}












