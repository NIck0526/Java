package array.primitive.test1;

public class ArrayBookEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); // Math.random() �� 0 ~ 0.999999... ������ �Ǽ�
		}//for
		
		System.out.println();
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
			
			for (int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; //�ڸ��ٲ��� �߻������� changed�� true��.
				}//if
			}//for
			
			if(!changed) break; //�ڸ��ٲ��� ������ �ݺ����� �����.
		}//for
		
	}//main

}//class
