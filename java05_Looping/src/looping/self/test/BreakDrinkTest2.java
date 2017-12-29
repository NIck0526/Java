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
		
		inputString = sc.nextLine();{ // 만약에 키를 눌러야지만 출력이 진행되게 하려면 어케하지??
		
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
	 * for문의 지역변수를 beer로 하나 선언한다.
	 * 맥주는 50잔까지 무한 반복으로 마실수 있다...
	 * 그런데 치사량은 맥주 10잔이다...
	 * 맥주 10잔을 마셨을때 break를 사용해서 반복문을 빠져나온다.
	 * 집으로 간다(메세지 출력)..
	 */
