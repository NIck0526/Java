package user.exception;

class  AmountInputException extends Exception{
	 AmountInputException(String warning){
		super(warning);
	}
	
	 AmountInputException(){
		this("This is a UserException");
	}	
} // �Ա� �����

class InvalidAmountException extends Exception{
	InvalidAmountException(String warning){
		super(warning);
	}
	
	InvalidAmountException(){
		this("This is a UserException");
	}	
}//��� �����



class Account{
	int balance;
	
	Account(int balance){
		this.balance=balance;
		
	}
	
	public void deposit(int amount) throws AmountInputException {
		/*
		 * �Աݾ��� �ݵ�� 1000�� �̻�
		 * �׷��� ������ AmountInputException�� �߻���Ŵ
		 * 
		 * ���� �ܾ׿� amount�� �߰��ϰ� �� ����� �ܾ��� ����
		 * �޼��� ���...�ܾ��� ���
		 */
		if(amount<1000)
			throw new  AmountInputException("�Աݾ��� 1000���̻��Դϴ�.");
		else {
			balance +=amount;			
		}
		System.out.println("�Ա� �� ���� �ܾ��� :: "+balance);
	}
	
	public void withdraw(int amount) throws InvalidAmountException{
		/*
		 * �ܾ׺��� ��� �Ϸ��� �ݾ��� ������ InvaildAmountException�� �߻�
		 * �׷��� �ʴٸ�
		 * �ܾ׿��� ��ݾ��� ������
		 * �޼��� ���... �ܾ� ���...
		 */
		
		if(balance<amount)
			throw new InvalidAmountException("��ݾ��� �ܾ׺��� ũ�� ���մϴ�.");
		
			else {
				balance -= amount;
			}
		System.out.println("��� �� ���� �ܾ��� :: "+balance);
	}
}

public class BankAccountException {
	public static void main(String[] args) {
		//10000 balance ����
		Account acc = new Account(10000);
		//�Ա�
		System.out.println(" �Ա��� �����մϴ�...");
		try {
		acc.deposit(20000);		
		acc.deposit(800);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		//���
		System.out.println("����� �����մϴ�...");
		try {
		acc.withdraw(23000);
		acc.withdraw(7000);
		acc.withdraw(20000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("���� �ܾ��� :: "+acc.balance);
		
		/*
		 * 1. 20000�� �Ա�
		 * 2. 800�� �Ա�(����)
		 * 3. 23000�� ���
		 * 4. 7000���� ���
		 * 5. 20000���� �߸�(����)
		 * ������ ���� �ܾ��� ���
		 */
	}

}