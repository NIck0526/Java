package looping.self.test;

public class BreakTotal100Test {
	public static void main(String[] args) {
		
		System.out.println(" ���� 1 �������� 100���� ���� ���� ���ô�.");
		int ship = 0;
		int sum = 0;//�ջ��� ���Ҷ��� �� (�ϳ��� �� �ٸ�)������ �ʿ��ϴ�.
		while(true) {
			ship++;
			System.out.println(ship+" ���� �ſ��������������� ");
			sum +=ship;
			if(sum>100)break;
		}
		System.out.println("�ŸŸŸŸŸŸŸŸɤ��ŸŸɸŸɸžָ� \n �ŸŸŸŸŸŸŸŸɤ��ŸŸɸŸɸžָ�"
				+ "\n �ò������� �Ͼ��!!!?");//���� ����������
		
		System.out.println("�ջ��� �� ::"+sum);
	}
}






/*
 * while�� �̿�
 * ���ѷ����� ���鼭 1�� �����ȴ�...
 * ������ ���� ��� �ջ��� �����µ�...�ջ��� ����100�� �Ѿ�� �ݺ����� ������������ ������ �ۼ�
 * ���������� �׶��� �ջ�� ���� ���.
 */










