package thread.step5;

public class AccountThread implements Runnable{
	Account  acc = new Account();
	
	@Override
	public void run() {				
		while(acc.balance>0){
			//100,200, 300���� ���� �ϳ��� ���� ��ݵǵ��� ������ �ۼ�...
			int money = (int)(Math.random()*3 +1)*100;
			//���࿡�� ����ϴ� ���....withdraw()�� ȣ��..			
			try{
				acc.withdraw(money);
				System.out.println("����� ������ �ܾ��� "+ acc.balance+" �����Դϴ�.");
			}catch(InterruptedException e){
				e.printStackTrace();
			}//catch	
			
			try{
				acc.deposit(money);
				System.out.println("����� ������ �ܾ��� "+ acc.balance+" �����Դϴ�.");
			}catch(InterruptedException e){
				e.printStackTrace();
			}//catch		
	}//while

	}//run
}//class
class Account{
	int balance = 1000; //��������
	
	public synchronized void withdraw(int money)throws InterruptedException{
		if(balance >= money){
			//�̷� ��쿡�� ����� �̷����� �Ѵ�...�׷���...�ð��� �� �������..ġ��..
			Thread.sleep(2000);
			
			balance -= money;	
		}else {
			wait();
		}
	}
	
	public synchronized void deposit(int money) throws InterruptedException{
		balance += money;
		notify();
	}
	
}














