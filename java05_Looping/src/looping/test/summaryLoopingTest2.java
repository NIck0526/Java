package looping.test;
/*
 * 1~10까지의 총합을 반복문 로직...
 */
public class summaryLoopingTest2 {
	public static void main(String[] args) {
		//Local V. 선언된 위치로 구분(메소드 안에있음)
		//Local V는 반드시 초기화 하고 사용해야 한다.
		//Heap에 올라가지 않기 때문에 기본값이 없다.
		int sum = 0;// 초기화함
		System.out.println("======= for 문을 이요한 총합 구하기======");
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.println("1~10개까지의 총합 ::"+sum);
		
		System.out.println("======= while 문을 이요한 종합 구하기 ========");
		int i=1;
		int sum2 = 0;
		while(i<=10) {
			i += i;
			System.out.println("1~10개 까지의 총합 :: "+ sum2);
		}
	}
}
