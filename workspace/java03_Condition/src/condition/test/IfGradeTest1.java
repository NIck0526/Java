package condition.test;
/*
 * step1 코드의 문제점 
 * ::
 * grade에 대한 값이 소스코드에 하드코딩 되어져 있다.
 * 이렇게 작성된 코드는 프로그램으로 사용될 수 없다.
 * 
 * step1 코드의 해결책
 * ::
 * 컴파일 시점에 값을 입력받으면 고정된 값만을 사용할 수밖에 없다.
 * 실행 시점에 그때그때마다 변하는 값을 입력받을수 있어야 한다....변수를 통해서
 * 그리고 입력된 값이 Local V에 할당되도록 해야한다.
 */
public class IfGradeTest1 {
	public static void main(String[] args) {
		int grade = 89; //Loacl V.(메소드 블락 안에서 선언)
		if(grade>=90 && grade<=100) 
			System.out.println("A Grade....");
		else if(grade>= 80 && grade<90) 
			System.out.println("B Grade....");
		else if(grade>=70 && grade <80) 
			System.out.println("C Grade....");
		else 
			System.out.println("Try Again!!");
		
	}
}





