package condition.test;
/*
 * step1 �ڵ��� ������ 
 * ::
 * grade�� ���� ���� �ҽ��ڵ忡 �ϵ��ڵ� �Ǿ��� �ִ�.
 * �̷��� �ۼ��� �ڵ�� ���α׷����� ���� �� ����.
 * 
 * step1 �ڵ��� �ذ�å
 * ::
 * ������ ������ ���� �Է¹����� ������ ������ ����� ���ۿ� ����.
 * ���� ������ �׶��׶����� ���ϴ� ���� �Է¹����� �־�� �Ѵ�....������ ���ؼ�
 * �׸��� �Էµ� ���� Local V�� �Ҵ�ǵ��� �ؾ��Ѵ�.
 */
public class IfGradeTest1 {
	public static void main(String[] args) {
		int grade = 89; //Loacl V.(�޼ҵ� ��� �ȿ��� ����)
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





