package step2.test;
/*
 * 4.5 ::
 * 변수는 선언된 위치로 다르게 정의된다.
 * filed, static V 는 클래스 바로 밑, 메소드 바깥에 선언됨
 * (기본값이 있다... 초기화 안하고 바로 사용해도 됨)
 * 
 * local V는 메소드 안에서 선언
 * (기본값이 없다... 초기화 안하고 사용하면 컴파일 시 에러남)
 */

public class StaticExamTest {
	
	int i=10;  //field, Member Variable 로 불러주셈
	static int j = 20; //class 변수, static 변수, 전역 변수
	
	public void test() {
		System.out.println("member Variable :: "+i);
		System.out.println("member Variable :: "+j);
	}
	
	/*
	 * static block안에서 non-static memeber를 사용할 수 없다.
	 * ::
	 * 메모리에 올라가 있지 않은 i를 사용할 수 없다.
	 * 하지만 j는 이미 메모리에 올라가 있어서 사용할 수 있다.
	 * :static은 static끼리 통한다."
	 * 메모리에 올라가 있는 애들끼리 사용할 수 있다. (객체생성없이 메모리를 사용할 수 있어서 가능한 것.)
	 */
	
	public static void test2() {
		//System.out.println("member Variable :: "+i);
		System.out.println("member Variable :: "+j);
	}
	
	public static void main(String[] args) {
		
		int k =  0; // local 변수, 지역 변수, Temporary V, automatically V
		test2();
		StaticExamTest test = new StaticExamTest();
		test.test();
		
		
		
		
	}

}












