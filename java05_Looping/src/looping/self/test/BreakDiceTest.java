package looping.self.test;

import java.util.Scanner;

public class BreakDiceTest {
	public static void main(String[] args) {
		int num = 0;
		
		while(true) {	
			num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) break; //while을 빠져나온다
		}//while
		
		System.out.println("프로그램을 종료합니다!!");
		
	}
}



/*

 * 무작위로 주사의를 돌렸을때, 
			 * 6이라는 숫자를 만나면 반복문을 빠져나오도록 로직을 작성
			 * 이때 무작위로 나오는 숫자들은 다 출력이 되도록...
			 */










