package conditionswitch.test;

public class SwitchGradeTest1 {

	public static void main(String[] args) {
		int grade = 89;
		//byte, short, int, char, String ����Ÿ Ÿ�� ����
		//�Ǽ����� �Ұ����ϴ�.
		switch(grade) {
			case 95:
			case 90:
			case 85:
				System.out.println("A Grade....");
				break;
			case 80:
			case 75:
				System.out.println("B Grade....");
				break;
			default:
				System.out.println("Go Home....");
		}//switch


	}//main

}//class
