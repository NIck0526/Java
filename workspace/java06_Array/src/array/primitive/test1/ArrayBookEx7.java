package array.primitive.test1;

public class ArrayBookEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // 배열을 초기화 한다.
			System.out.print(numArr[i]);
		}//for
		System.out.println();
		
		for(int i =0; i<100; i++) {//100번 반복하든 천번 반복하든 상관없음?
			int n = (int)(Math.random()*10); // 0~9의 한 값을 임의로 얻는다. 10 은 곱하기가아니고 0~9의 값을 지칭?
			int tmp = numArr[0];
			numArr [0] = numArr[n];
			numArr [n] = tmp;
		}//for
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	
	}//main

}
