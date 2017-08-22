package condition.self.test;

public class BankSelfTest {
	public static void main(String[] args) {
		
		
		Account acc = new Account(10000);
		
		acc.deposit(2000);
		acc.deposit(1500);
		acc.deposit(100);
		System.out.println("�ܾ�Ȯ�� 1 ::"+acc.getBalance()+"��");
		
		acc.withdraw(8000);
		acc.withdraw(7000);
		System.out.println("�ܾ�Ȯ�� 2 ::"+acc.getBalance()+"��");
		
	}

}
/*
 * 1. �Ա��Ϸ��� �ݾ��� 1000�� �̻��϶��� �Ա��� ���
 *    �׷��� �ʴٸ� "�Աݾ��� 1000�� �̻��̾����!!"�� ���
 * 2. ����Ϸ��� �ݾ��� �Աݾ��� �ܾ׺��� ũ�� �ȵǵ��� ��
 *    �׷��� �ʴٸ� "~~~" ���
 */


class Account {
	double balance;

	public Account(double balance) {
			this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		if(amount < 1000) {
			System.out.println("===1000���̻� �Ա��ؾ��մϴ�");
		}
		else balance += amount;
		
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("��ݾ��� �ʹ� Ů�ϴ�");
		}
		else balance -= amount;
		//balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
}
