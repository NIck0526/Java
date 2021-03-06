package thread.step2.test;
/*
 * step2
 * ::
 * Beep 경고음과 "띵" 출력이
 * 동시에 진행되도록 별도의 작업쓰레드를 작성
 * ::
 * main 쓰레드와 작업 쓰레드가 병행적으로 처리되는 현상을 확인
 * 
 */
import java.awt.Toolkit;

/*
 * step1
 * ::
 * 경고음을 5번 발생 / 동시에 띵띵띵띵띵 문자를 5번 출력
 * 이때 별도의 쓰레드를 사용하지 않고
 * 그저 main으로 처리 
 * ::
 * main 메소드가 사실은 스레드라는 사실을 알고 있다.
 * BeepThreadTest1라는 하나의 프로세스가 동작한다는 것은
 * 그안에 반드시 하나의 쓰레드가 돌고 있다는 것이다.
 * 단지 별도의 작업쓰레드를 만들지 않을 것이다.
 * 
 */

class BeepThread extends Thread{
	public void run() {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
		}
		
		
	}// for
	}
}
public class BeepThreadTest2 {
	public static void main(String[] args) {
		BeepThread beep = new BeepThread();
		beep.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}//
	}

}
