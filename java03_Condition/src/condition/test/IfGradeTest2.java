package condition.test;
/*
 * step2 의 문제점
 * ::
 * 값을 콘솔창으로 입력받는게 효율적이다.
 * 
 * step2 의 해결책
 * ::
 * Scanner 객체를 이용한다.
 */
public class IfGradeTest2 {
	public static void main(String[] args) {
		//String값을 int로 변환하는 기능을 이용해야 한다.
		//Integer 클래스 에서 찾아봅시다.
		
		int grade = Integer.parseInt(args[0]);
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





