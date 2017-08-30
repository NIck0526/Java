package thread.step4.test;
/*
 * Thread들이 Process의 자원을 공유할때
 * 발생하는 문제점을 보여주는 간단한 코드
 * ::
 * 
 */

class Calculator{
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		//무슨 이유에서인지 시간이 지연됬다면...
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+" Value :: "+this.memory);
	}
	
}

class User1 extends Thread{
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("Calculator1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread{
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("Calculator2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}

public class SharingDataTest1 {
	public static void main(String[]args) {
		Calculator cal = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
		
		
		
	}

}
