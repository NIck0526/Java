package test;

import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

public class EmployeeAppTest1 {
	
	public static void main(String[] args) {
		// Polymorphism 방식으로 객체를 생성
		// 부모타입으로 자식 객체를 생성
		
		Employee e1 = 
				new Manager("111-111", "James", new MyDate(1900,1,1), 45000.0, "it");
		/*
		 * 	Virtual Method Invocation 원리가 적용됨 (자식의 메소드가 결과적으로 실행되었다.)
		 * ::
		 * Compile Time Type - 부모메소드가 호출 됨.
		 * Runtime Type - 자식의 메소가 호출됨.
		 * ::
		 * 결론적으로, 상속관계에 있는 자식 클래스에서 
		 * 부모타입으로 자식객체를 생성했을때
		 * 오버라이딩 되어져 있는 메소드에서 발생한다.
		 */
		System.out.println(e1.getDetails()); // e1.getDetails(); 은 Employee의 메소드를 호출한것임
		                                     // But, Manager의getDetails()가 실행됨.
		//e1.dept = "교육부";
		//Object Casting을 사용한다.
		/*
		 * dept가 Employee에 없는 필드이기 때문이지,
		 * 메모리에 올라가 있지 않는것은 아니다.
		 * Manager로 불러서 찾아야 한다.
		 * ::
		 * Object Casitng 
		 */
		
		Manager m = (Manager)e1; // Manager로 캐스팅한다
				m.changeDept("교육부");
		
		System.out.println(e1.getDetails());
	}
	
}
		

/*
 * Polymorphism 적인 방식으로 객체를 생성할때
 * ::
 * 1. Virtual Method Invocation
 * 2. Object Casting
 */





