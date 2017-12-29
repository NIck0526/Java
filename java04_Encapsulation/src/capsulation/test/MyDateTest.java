package capsulation.test;

import java.util.Scanner;

/*
 * Encapsulation pattern
 * ::
 * 1. field �� --> private
 *    (���� Ŭ���� �������� ������ ����ϴ� Access Modifier)
 * 2. setXxx() | getXxx() --> public
 *    (��𼭵��� ������ ����ϴ� Access Modifier)
 * 3. setXxx() { ù ���ο��� ��, �ʵ忡 ���� �Ҵ�Ǳ� ������
 *    ����� ����ؼ� Ÿ���� ���� �ʵ忡 �Ҵ�
 */
class MyDate {
	private int month; //��ȣ�ϱ� ���ؼ� private�� ���
	private int day;
	

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month <= 12){
		this.month = month;// �ʵ� �ʱ�ȭ.  �ʵ� �ʱ�ȭ ������ �˻���(�ɷ���������)�� ��ġ�ϱ� ���ؼ� ���ǹ��� �� �տ�����.
	    } else {
			System.out.println(" ���� 1~12������ �ֽ��ϴ�. ");
			System.exit(0); //�ٽ� �׽�Ʈ�� ���� ���ϰ� ���⼭ ������ ����
			//(0)�� ������ �������� | -1 ����������
		  }
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		switch(month) {
		case 2:
			if(day>=1 && day<=28) {
				this.day = day; //�� ���ǹ��� �´� ���� ����Ѵٴ� ��
			}else { //������ ���ǹ� �ȸ����� �������ο�
				System.out.println("2���� Ÿ���� ��¥�� �ƴմϴ�..");
				System.exit(0);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>=1 && day<=30) {
				this.day = day; //�� ���ǹ��� �´� ���� ����Ѵٴ� ��
			}else { //������ ���ǹ� �ȸ����� �������ο�
				System.out.println("���� Ÿ���� ��¥�� �ƴմϴ�..");
				System.exit(0);
			}
			break;
		default:
			if(day>=1 && day<=31) {
				this.day = day; //�� ���ǹ��� �´� ���� ����Ѵٴ� ��
		}else { //������ ���ǹ� �ȸ����� �������ο�
			System.out.println("���� Ÿ���� ��¥�� �ƴմϴ�..");
			System.exit(0);
	     	}
		}//switch ��
		
		/*
		 * 1,3,5,7,8,10,12 �ϋ� 1~31
		 * 4,6,9,11 : 1~30
		 * 2 : 1~28
		 * ::
		 */
		
		this.day = day;
	}

}
public class MyDateTest{
	public static void main(String[] args) {
		
		MyDate today = new MyDate(); // �ı� 6�� (�ʵ� 2+�޼ҵ� 4) �� �޸� �ö�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �ܼ�â���� �Է��ϼ���...\n");
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		today.setMonth(month);//call month�� ��ȣ�ȿ� �ִ� ���� - ���ڸ� ������ �� ���ڸ� �ԷµǱ⶧����
		today.setDay(day);
		
		//if(today.getMonth()!=0 && today.getDay()!=0{}�� null or 0 �̵Ȱ��� �˰� ����� �ȵǰ� �ϴ¹�
		
		System.out.println("������ "+today.getMonth()+" �� "+today.getDay()+" �� �Դϴ�.");
				
		//1. MyDate ��ü�� ����... today��� �̸�����
		//2. Scanner�� �̿��ؼ� month, day���� �޾ƿ´�
		//3. �޾ƿ� ��¥�� ���������� ���
		System.out.println(today);
	}
	
}
