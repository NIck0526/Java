package array.primitive.test;
/*
 * Array
 * ::
 * 같은 데이타 타입을 가지는 여러개의 다른 값들이
 * 하나의 변수를 통해서 한방에 처리되는 것
 */

public class IntArrayTest1 {

	public static void main(String[] args) {
	//1. 배열선언
	int[]i;
	
	//2.배열 생성 : (new 생성 | size 명시)
	i = new int[3];
	
	System.out.println("====묵시적 초기화 진행 ====");
	for(int arr=0; arr<3; arr++) 
		System.out.print(i[arr]+" ");
	//for
	
	//3. 초기화
	i[0] = 11;
	i[1] = 22;
	i[2] = 33;
	
	System.out.println("\n ====명시적 초기화 진행====");
	for(int arr=0; arr<3; arr++)
		System.out.print(i[arr]+" ");
	
	System.out.println("\n Array 객체 ::"+i);//왜 오류나요??

	}//main

}//class
