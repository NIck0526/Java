package looping.self.test;

import java.util.Scanner;

public class BreakDiceTest {
	public static void main(String[] args) {
		int num = 0;
		
		while(true) {	
			num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) break; //while�� �������´�
		}//while
		
		System.out.println("���α׷��� �����մϴ�!!");
		
	}
}



/*

 * �������� �ֻ��Ǹ� ��������, 
			 * 6�̶�� ���ڸ� ������ �ݺ����� ������������ ������ �ۼ�
			 * �̶� �������� ������ ���ڵ��� �� ����� �ǵ���...
			 */










