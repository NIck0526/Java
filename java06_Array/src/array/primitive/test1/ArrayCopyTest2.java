package array.primitive.test1;
/*
 * Array는 Resizing 은 안되지만
 * size가 다른 Array의 데이타는 복사해 올 수 있다.
 * ::
 * 1,2,3,99,88,77,66,55,44,33
 * System.arraycopy() --> 배열의 내용을 복사해 올 수 있다.
 * for 이용해서 target을 출력하면 데이타의 내용이 복제된 걸로 나와야한다. 
 */

public class ArrayCopyTest2 {
	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6,7,8,9,10};
		int[] source = {99,88,77,66,55,44,33};
		
		//system.arraycopy(카피대상, 시작지점, 
		// 불러오는 대상, 불러오는대상의 변환 시점, 
		// 카피대상의 끝나는지점)
		
		System.arraycopy(source, 0, target, 3, 5);
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ,");
		}
		
	}//main

}//class
