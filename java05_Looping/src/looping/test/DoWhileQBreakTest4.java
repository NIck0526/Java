package looping.test;

import java.util.Scanner;

public class DoWhileQBreakTest4 {
	public static void main(String[] args) {
		System.out.println("�޼����� �ܼ�â���� �Է��ϼ���...");
		System.out.println("���࿡ ���Ḧ ���Ͻø� q�� �����ּ���...");//���� �����ڴٿ�.
		
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		do {
			System.out.print(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));//�ƴҋ� ���� �� !�־��� equals�� String �Ͻÿ� ���ϴ°�.
			
			System.out.println("\n �����մϴ�...");
	}

}
//�� �ϳ��� �ݺ��Ǵ� ����? do-while�� ���ǽ��� �ƴϴ��� �ѹ� �ݺ��� ���־