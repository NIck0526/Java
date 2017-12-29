package looping.test;

import java.util.Scanner;

public class LoopingScannerConditionTest {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {// true 랑 run 바꾼거 이해 안됨..
			System.out.println("----------------------------------------");
			System.out.println("1.  예금  | 2.  출금  | 3. 잔고  | 4. 종료  ");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			
			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("예금액 > ");
				balance += sc.nextInt();
				break;
				
			case 2:
				System.out.println("출금액 > ");
				balance -= sc.nextInt();
				break;
				
			case 3:
				System.out.println("잔액 > ");
				System.out.println(balance+" 원");
				break;
			
			case 4:
				run = false;// boolean 이 꼭 필요한건가 요 부분 떄문에??????
				break;
				
			default:
				System.out.println("정확한 값을 입력해 주십시오.");
			
			}//switch
			
		}//while
		System.out.println(" 고맙습니다 ");

	}//main

}//class
