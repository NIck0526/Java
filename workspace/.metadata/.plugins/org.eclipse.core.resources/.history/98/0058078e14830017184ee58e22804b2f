package test;

import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

public class EmployeeAppTest1 {
	public static void main(String[] args) {
		//1. Employee 클래스를 생성...e...인자값 4
		Employee e = new Employee("111-111", "아이유", new MyDate(1980,1,3), 300000.0);
		Employee e1 = new Employee("777-777");
		//2. Manager 클래스를 생성...m...인자값 5
		Manager m = new Manager("222-222", "이상순", new MyDate(1980,3,4), 550000, "관리인");
		
		//3. e의 정보를 출력...getDetails()
		System.out.println(e.getDetails());
		System.out.println(e1.getDetails());
		//4. m의 정보를 출력...getDetails()
		System.out.println(m.getDetails());
		
		/*m.getDetails("기획부");
		
		m.getDetails(Employee.DEFAULT_SALARY);
		*/


	}
}
