package array.primitive.test1;

public class ArrayBookEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // �迭�� �ʱ�ȭ �Ѵ�.
			System.out.print(numArr[i]);
		}//for
		System.out.println();
		
		for(int i =0; i<100; i++) {//100�� �ݺ��ϵ� õ�� �ݺ��ϵ� �������?
			int n = (int)(Math.random()*10); // 0~9�� �� ���� ���Ƿ� ��´�. 10 �� ���ϱⰡ�ƴϰ� 0~9�� ���� ��Ī?
			int tmp = numArr[0];
			numArr [0] = numArr[n];
			numArr [n] = tmp;
		}//for
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	
	}//main

}
