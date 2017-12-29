package array.primitive.test1;

public class ArrayBookEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); // Math.random() 은 0 ~ 0.999999... 사이의 실수
		}//for
		
		System.out.println();
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; //자리바꿈이 발생했는지를 체크한다.
			
			for (int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; //자리바꿈이 발생했으니 changed를 true로.
				}//if
			}//for
			
			if(!changed) break; //자리바꿈이 없으면 반복문을 벗어난다.
		}//for
		
	}//main

}//class
