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
			if(dice==6) break; // while ����������
			
			
		}//while
		
		System.out.println("=======GAME OVER======");

	}//main

}//class
/*

 * �������� �ֻ��Ǹ� ��������, 
			 * 6�̶�� ���ڸ� ������ �ݺ����� ������������ ������ �ۼ�
			 * �̶� �������� ������ ���ڵ��� �� ����� �ǵ���...
			 */