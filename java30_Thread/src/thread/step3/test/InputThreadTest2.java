package thread.step3.test;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

/*
 * step2
 * ::
 * 카운팅 작업은 카운팅 작업대로 / 팝업창에 입력하는 작업은 별도로..
 * 각각 병행적으로 진행 되도록 로직을 작성
 * 작업쓰레드 - CountingThread로 구현
 * 		   - Runnable을 구현해서 작성
 */

class CountingThread implements Runnable{
	
	@Override
	public void run() { 
		for(int i=10; i>0; i--) {
		//일종의 카운팅 작업..
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
		
		
		String passWord =JOptionPane.showInputDialog("황금열쇠의 비밀번호를 입력하세요.");
		
		System.out.println("입력한 비번은 "+passWord+"  !!");
		
		
	
		
		
	}

}
