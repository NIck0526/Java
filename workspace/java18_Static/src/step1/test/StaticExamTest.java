package step1.test;
/*
 * 1.2::
 * static�� ����� ��ü���� �������� �ٷ� ���� �ִ�
 */
class Member{
	static String name = "�����";
	static int age = 50;
	
	public static void member() {
		System.out.println("�� / �� / �� / �� "+name);
	}
	
}

public class StaticExamTest {

	public static void main(String[] args) {
		/*System.out.println("�ƹ������� ���̴� "+Member.name+", ���̴� "+Member.age);
		Member.member();
		*/
		
		//m�̶�� �̸����� Member��ü�� ������ �� m���� ����� ����
		
		Member m = new Member();
		System.out.println("�ƹ������� ���̴� "+m.name+", ���̴� "+m.age);
	}

}