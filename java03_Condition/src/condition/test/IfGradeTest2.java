package condition.test;
/*
 * step2 �� ������
 * ::
 * ���� �ܼ�â���� �Է¹޴°� ȿ�����̴�.
 * 
 * step2 �� �ذ�å
 * ::
 * Scanner ��ü�� �̿��Ѵ�.
 */
public class IfGradeTest2 {
	public static void main(String[] args) {
		//String���� int�� ��ȯ�ϴ� ����� �̿��ؾ� �Ѵ�.
		//Integer Ŭ���� ���� ã�ƺ��ô�.
		
		int grade = Integer.parseInt(args[0]);
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





