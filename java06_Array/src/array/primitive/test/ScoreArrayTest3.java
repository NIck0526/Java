package array.primitive.test;

public class ScoreArrayTest3 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] score = {90,50,46,88,79};
		
		// 1. for���� �̿��ؼ� ������ ������ ���ϼ���.
		// i<score.length  <-- �乮���� �迭�� ��������. == i<5;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}//for
		System.out.println(" TOTAL SCORE :: "+sum+" ��");
		
		// 2. ������ �̿��ؼ� ��������� ����ϼ���.
		
		avg = sum/score.length; // /5 �� 5������
		System.out.println(" AVG SCORE :: "+avg+" ��");
		
		// 3. ��� ���������� ����ϰ�, ���� ���������� ����
		// ����� �ο����� �Բ� ���
		int count = 0;
		for(int i=0; i<score.length; i++) {
			
			if(score[i]<=avg) {
				count++;
			System.out.println(score[i]);
			}
		}//for
		System.out.println(" ��� ���� ������ �ο��� ::"+count);
		System.out.println(score);
		
	}//main

}//class
