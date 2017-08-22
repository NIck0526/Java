package looping.test;

import java.util.Scanner;

public class DoWhileQBreakTest4 {
	public static void main(String[] args) {
		System.out.println("메세지를 콘솔창으로 입력하세요...");
		System.out.println("만약에 종료를 원하시면 q를 눌러주세요...");//루핑 빠지겠다요.
		
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		do {
			System.out.print(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));//아닐떄 까지 라서 !넣었음 equals는 String 일시에 비교하는것.
			
			System.out.println("\n 종료합니다...");
	}

}
//왜 하나가 반복되는 이유? do-while은 조건식이 아니더라도 한번 반복을 해주어서