package looping.self.test;

import java.util.Scanner;

public class BreakDrinkTest2 {
	public static void main(String[] args) {
		
		int beer = 0;	
		int balance = 0;
		String inputString;
		
		
		System.out.println("=====WOOOOOOOWWWWWW!!!=====");
		
		System.out.println("=====GET 10000$ ON THE WAY=====");
		System.out.println("=====TODAY BEER IS ONLY 1$!!=====");
		System.out.println("=====LET's DIE TONIGHT!!!=====");
		
		Scanner sc = new Scanner(System.in);
		
		inputString = sc.nextLine();{ // ���࿡ Ű�� ���������� ����� ����ǰ� �Ϸ��� ��������??
		
		for(beer=0; beer<50; beer++) {
			balance = 10000;
			balance -= beer;
			System.out.println("===KILL THE BEER === ::"+beer);
			if(beer==10)
				break;
			
		}//for
		}
		System.out.println("=====PASS AWAY......====");
		System.out.println("=====YOU LOST YOUR MONEY :: "+balance);
	}//main
				
}//class

	
	/*
	 * for���� ���������� beer�� �ϳ� �����Ѵ�.
	 * ���ִ� 50�ܱ��� ���� �ݺ����� ���Ǽ� �ִ�...
	 * �׷��� ġ�緮�� ���� 10���̴�...
	 * ���� 10���� �������� break�� ����ؼ� �ݺ����� �������´�.
	 * ������ ����(�޼��� ���)..
	 */
