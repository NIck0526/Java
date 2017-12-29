package thread.step3.test;
/*
 * 10초가 진행되는 동안 입력박스에 값이 입력되도록 권장하는 로직
 * ::
 * 1) 10초안에 값을 입력하지 않으면 
 * 		더이상 값을 입력 받지 못하도록 창을 닫는다.
 * 2) 10초안에 값이 입력되었다면
 * 	  카운팅작업을 중지한다.
 * ::
 * 작업 쓰레드 2개 잣겅
 * CountThread | InputThread
 * InputthreadTest3(main 쓰레드가 돌아가는 Java Process라고 보면 됨.)
 */
import java.awt.Toolkit;

import javax.swing.JOptionPane;

class InputThread implements Runnable{
	
	@Override
	public void run() {
		String passWord =JOptionPane.showInputDialog("황금열쇠의 비밀번호를 입력하세요.");
		
		System.out.println("입력한 비번은 "+passWord+"  !!");
		
		InputThreadTest3.inputCheck = true;
		
	}
	
}


class CountThread implements Runnable{
	
	@Override
	public void run() { 
		//일종의 카운팅 작업..
		for(int i=10; i>0; i--) {
		//만약에 팝업창에 숫자가 입력 됬다면 for를 빠져나온다.
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
			System.out.println("카운팅 종료 후 값 입력이 안됩니다.");
			System.exit(0); //종료
	}	
	
}//



public class InputThreadTest3 {
	//Thread 들이 공유하는 데이타를 필드로 지정...
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
