package kosta.banking.Test;

import kosta.banking.Account;
import kosta.banking.Customer;



public class KostaBangkingTest {
	public static void main(String[] args) {
	
	
	Customer c = new Customer("Gosling", "James", 13451);
	Customer d = new Customer("MM", "DD", 8905);
	
	c.setAccount(new Account(10000));
	d.setAccount(new Account(50000));
	
	//James�� ������ ������ ���Ϲ޴´�.
	//James�� ������ ������ ����� ����Ҽ� �ִ� : �Ա�, ���, �ܾ���ȸ
	Account jamesAcc = c.getAccount();
	
	//�Ա�
	System.out.println("=====�Աݽ���=====\n");
	double input = 3000.0;
	System.out.println(input+" �Ա� ���� ");
	c.getAccount().deposit(input);
	
	
	double input2 = 5000.0;
	System.out.println(input2+" �Ա� ���� ");
	c.getAccount().deposit(input2);
	
	System.out.println("======��ݽ���=====");
	c.getAccount().withdraw(2000);
	d.getAccount().deposit(10000);
	
	System.out.println("======�ܾ���ȸ======");
	System.out.println("Ballance ::"+" $ "+c.getAccount().getBalance());
	System.out.println(d.getAccount().getBalance());
	}
}
/*james gosling ������
 * JG�� �ܾ� 1���� �̵� ���� ����
 * ������ ������ ���Ϲ޾Ƽ�
 * 3õ�� �Ա�, 5õ�� �Ա�,2õ�� ���
 * �ܾ�Ȯ�� = 1.6����
 * c.setAccount(new Account(10000)); ���� �� new�� ���ִ°���?

*/