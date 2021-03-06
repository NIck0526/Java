package thread.step1.test;

/*
 * Thread를 작성하는 방법
 * 1. extends Thread
 * 2. implements Runnable
 * 
 */


class GoThread extends Thread{
	int i = 0;
	
	public void run() {
		//이 안에서 쓰레드가 동작하는 로직을 작성.....
		while(true) {
			System.out.println("Go :: "+i++);
			if(i==20) break;
		}
	}
	
}

class ComeThread extends Thread{
	int i = 0;
	
	public void run() {
		//이 안에서 쓰레드가 동작하는 로직을 작성.....
		while(true) {
			System.out.println("Come :: "+i++);
			if(i==20) break;
		}
	}
	
}


public class GoComeThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GoThread go = new GoThread ();
			ComeThread come = new ComeThread();
			
			System.out.println(go.getPriority());
			System.out.println(come.getPriority());
			
			go.start();
			come.start();
			
	}

}
