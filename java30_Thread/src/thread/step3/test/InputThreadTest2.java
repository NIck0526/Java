package thread.step3.test;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

/*
 * step2
 * ::
 * ī���� �۾��� ī���� �۾���� / �˾�â�� �Է��ϴ� �۾��� ������..
 * ���� ���������� ���� �ǵ��� ������ �ۼ�
 * �۾������� - CountingThread�� ����
 * 		   - Runnable�� �����ؼ� �ۼ�
 */

class CountingThread implements Runnable{
	
	@Override
	public void run() { 
		for(int i=10; i>0; i--) {
		//������ ī���� �۾�..
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		
		System.out.println(i);
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e) {
		 }
		}
	}	
	
}//



public class InputThreadTest2 {
	public static void main(String[] args) {
		CountingThread t1 = new CountingThread();
		Thread t = new Thread(t1);
		t.start();
		
		
		String passWord =JOptionPane.showInputDialog("Ȳ�ݿ����� ��й�ȣ�� �Է��ϼ���.");
		
		System.out.println("�Է��� ����� "+passWord+"  !!");
		
		
	
		
		
	}

}
