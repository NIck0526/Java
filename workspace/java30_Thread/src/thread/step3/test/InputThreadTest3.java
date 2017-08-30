package thread.step3.test;
/*
 * 10�ʰ� ����Ǵ� ���� �Է¹ڽ��� ���� �Էµǵ��� �����ϴ� ����
 * ::
 * 1) 10�ʾȿ� ���� �Է����� ������ 
 * 		���̻� ���� �Է� ���� ���ϵ��� â�� �ݴ´�.
 * 2) 10�ʾȿ� ���� �ԷµǾ��ٸ�
 * 	  ī�����۾��� �����Ѵ�.
 * ::
 * �۾� ������ 2�� ���
 * CountThread | InputThread
 * InputthreadTest3(main �����尡 ���ư��� Java Process��� ���� ��.)
 */
import java.awt.Toolkit;

import javax.swing.JOptionPane;

class InputThread implements Runnable{
	
	@Override
	public void run() {
		String passWord =JOptionPane.showInputDialog("Ȳ�ݿ����� ��й�ȣ�� �Է��ϼ���.");
		
		System.out.println("�Է��� ����� "+passWord+"  !!");
		
		InputThreadTest3.inputCheck = true;
		
	}
	
}


class CountThread implements Runnable{
	
	@Override
	public void run() { 
		//������ ī���� �۾�..
		for(int i=10; i>0; i--) {
		//���࿡ �˾�â�� ���ڰ� �Է� ��ٸ� for�� �������´�.
		if(InputThreadTest3.inputCheck)break;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		
		System.out.println(i);
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e) {
		 }
		}//for
		if(!InputThreadTest3.inputCheck)
			System.out.println("ī���� ���� �� �� �Է��� �ȵ˴ϴ�.");
			System.exit(0); //����
	}	
	
}//



public class InputThreadTest3 {
	//Thread ���� �����ϴ� ����Ÿ�� �ʵ�� ����...
	static boolean inputCheck = false;
	
	
	public static void main(String[] args) {
		CountThread ct = new CountThread();
		InputThread it = new InputThread();
		
		Thread t = new Thread(ct);
		Thread t2 = new Thread(it);
		t.start();
		t2.start();

		
		
			
		
		
		
	
		
		
	}

}
