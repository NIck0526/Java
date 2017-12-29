package looping.self.test;

import java.util.Scanner;

public class BreakDiceTest2 {

	public static void main(String[] args) {
		int dice = 0;
		String inputString;
		System.out.println("======IF YOU GET 6, YOU LOST======");
		System.out.println("===========Let's DICE===========");
		System.out.println("===========PRESS ANY BUTTON===========");
		
		Scanner sc = new Scanner(System.in);
		inputString = sc.nextLine();
		
		
		while(true) {
			dice=(int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice==6) break; // while 빠져나오기
			
			
		}//while
		
		System.out.println("=======GAME OVER======");

	}//main

}//class
/*

 * 무작위로 주사의를 돌렸을때, 
			 * 6이라는 숫자를 만나면 반복문을 빠져나오도록 로직을 작성
			 * 이때 무작위로 나오는 숫자들은 다 출력이 되도록...
			 */