package looping.test;
/*
 * 1~10������ ������ �ݺ��� ����...
 */
public class summaryLoopingTest2 {
	public static void main(String[] args) {
		//Local V. ����� ��ġ�� ����(�޼ҵ� �ȿ�����)
		//Local V�� �ݵ�� �ʱ�ȭ �ϰ� ����ؾ� �Ѵ�.
		//Heap�� �ö��� �ʱ� ������ �⺻���� ����.
		int sum = 0;// �ʱ�ȭ��
		System.out.println("======= for ���� �̿��� ���� ���ϱ�======");
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.println("1~10�������� ���� ::"+sum);
		
		System.out.println("======= while ���� �̿��� ���� ���ϱ� ========");
		int i=1;
		int sum2 = 0;
		while(i<=10) {
			i += i;
			System.out.println("1~10�� ������ ���� :: "+ sum2);
		}
	}
}
