package condition.test;

import java.util.Scanner;

/*
 * step3
 * ::
 * Ű����� �Է¹��� ����Ÿ�� �ַܼ� ����� �� �ֵ��� �Ѵ�.
 */
public class IfGradeTest3 {
	public static void main(String[] args) {
		//String���� int�� ��ȯ�ϴ� ����� �̿��ؾ� �Ѵ�.
		//Integer Ŭ���� ���� ã�ƺ��ô�.
		
		//int grade = Integer.parseInt(args[0]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� ������ �Է��ϼ���....\n");
		
		String name = sc.nextLine();
		int grade=sc.nextInt();
		
		System.out.println(name+" :: ");
		if(grade>=90 && grade<=100) 
			System.out.println("A Grade....");
		else if(grade>= 80 && grade<90) 
			System.out.println("B Grade....");
		else if(grade>=70 && grade <80) 
			System.out.println("C Grade....");
		else 
			System.out.println("Try Again!!");		
	}
}





