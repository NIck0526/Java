package looping.test;

import java.util.Scanner;

public class LoopingScannerConditionTest {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {// true �� run �ٲ۰� ���� �ȵ�..
			System.out.println("----------------------------------------");
			System.out.println("1.  ����  | 2.  ���  | 3. �ܰ�  | 4. ����  ");
			System.out.println("----------------------------------------");
			System.out.print("���� > ");
			
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("���ݾ� > ");
				balance += sc.nextInt();
				break;
				
			case 2:
				System.out.println("��ݾ� > ");
				balance -= sc.nextInt();
				break;
				
			case 3:
				System.out.println("�ܾ� > ");
				System.out.println(balance+" ��");
				break;
			
			case 4:
				run = false;// boolean �� �� �ʿ��Ѱǰ� �� �κ� ������??????
				break;
				
			default:
				System.out.println("��Ȯ�� ���� �Է��� �ֽʽÿ�.");
			
			}//switch
			
		}//while
		System.out.println(" �����ϴ� ");

	}//main

}//class
