package poly.child;

import poly.parent.Employee;

public class Manager extends Employee{
	private String dept;

	public Manager(String empId, String name, String address, int salary, String dept) {
		super(empId, name, address, salary);
		this.dept = dept;
	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Manager [dept="+dept+"]";
		
	}

}
