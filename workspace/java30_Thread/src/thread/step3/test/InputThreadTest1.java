package thread.step3.test;

import javax.swing.JOptionPane;

/*
 * step1
 * ::
 * �۾� �����带 ������� �ʴ´�.
 * main �����常���� �۵�
 * :
 * �Է� �ڽ��� ������� �Է��� �޴´� / �Է¹��� ���ڸ� �ַܼ� ���
 * 
 */
public class InputThreadTest1 {
	public static void main(String[] args) {
		String passWord =JOptionPane.showInputDialog("Ȳ�ݿ����� ��й�ȣ�� �Է��ϼ���.");
		
		System.out.println("�Է��� ����� "+passWord+"  !!");
		
		//������ ī���� �۾�..
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
			 }
		}
	}

}
