package poly.test;

import poly.child.Engineer;
import poly.child.Manager;
import poly.parent.Employee;
import poly.service.EmployeeService;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. ��ü����...m = 
		Employee e = new Employee("e123", "������", "��赿", 450);
		Manager m = new Manager("m777", "�̻��", "����", 500, "������");
		Engineer eg1 = new Engineer("eg112", "ȿ��1", "�Ż絿", 400, "Jquery", 230);
		Engineer eg2 = new Engineer("eg999", "ȿ��2", "����", 500, "Driver", 50);
		
		//2. Service Class ��ü ����
		EmployeeService service = new EmployeeService();
		
		//3. ��ü���� ��� ������ ����ϴ� ���..
		System.out.println("=======1. Print Informarion ::getEmployeeInfo() ========= ");
		Employee emp=service.getEmployeeInfo(e);
		System.out.println(emp);
		System.out.println(service.getEmployeeInfo(m));
		System.out.println(service.getEmployeeInfo(eg1));
		System.out.println("***************************************");
		System.out.println("=======2. Print All Informarion ::getAllEmployeeInfo() ========= ");
		Employee[ ] arr = {e, m, eg1, eg2};
		service.getAllEmployeeInfo(arr);
		System.out.println("***************************************");
		System.out.println("=======3. Print Change Informarion ::changeEmployeeInfo() ========= ");
		service.changeEmployeeInfo(arr);
		
		System.out.println("***************************************");
		service.getAllEmployeeInfo(arr);
		System.out.println("\n=======3. Find Employee By Id ::findEmployeeById() ========= ");
		Employee returnEmp=service.findEmployeeById(arr, "eg999");
		System.out.println(returnEmp);
		System.out.println("***************************************");
		
		/*Employee[ ] returnEmp1=service.findEmployeeByAddr(arr, "����");
		for(Employee e1 : returnEmp1) {
			if(e1==null) continue;
			System.out.println(e1);
		}*/
		
		Employee[ ] returnEmp1=service.findEmployeeByAddr(arr, "����");
		for(Employee e1 : returnEmp1) {
			if(e1==null) break;
			System.out.println(e1);
		}
		
		System.out.println("***************************************");
		System.out.println("\n=======4. getAnnualSalary() ========= ");
		System.out.println(service.getAnnualSalary(m));
	}
}












