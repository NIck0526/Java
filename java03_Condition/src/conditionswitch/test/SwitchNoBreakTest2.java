package conditionswitch.test;

public class SwitchNoBreakTest2 {
	public static void main(String args[]) {
		//time :: 8~11
		
		int dice = (int)(Math.random()*6)+1;
		int time = (int)(Math.random()*4)+8;//random�� double�̶� (int)ĳ������ ����
		System.out.println("[����ð� :: "+time+" �� !!");
		System.out.println("�ֻ��� ���� :: "+dice);
		switch(time) {
		case 8:
			System.out.println("��� �մϴ�...");
		case 9:
			System.out.println("�ٹ� �����մϴ�...");
		case 10:
			System.out.println("����ȸ�� �����մϴ�...");
		case 11:
			System.out.println("�ܱ� �����ϴ�...");
		}
			
	}

}
