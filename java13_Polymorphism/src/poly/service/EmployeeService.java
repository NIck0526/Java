package poly.service;
/*
 * Employee�� ����Ŭ�������� Handling �ϴ� ���� Ŭ����
 */

import poly.child.Engineer;
import poly.child.Manager;
import poly.parent.Employee;

public class EmployeeService {
	//1. ��ü�� ������ ����ϴ� ����� ����
	//Method Overloading ����� ������.
	public Employee getEmployeeInfo(Employee e) {
		return e;
	}
	/*public Employee getEmployeeInfo(Manager m) {
		return m;
	}
	public Employee getEmployeeInfo(Engineer eg) {
		return eg;
	}*/
	
	
	public void getAllEmployeeInfo(Employee[ ] ea) {
		for(Employee e : ea) 
			System.out.println(e);
		
	}//getAllEmployeeInfo
	/*
	 * instanceof ::
	 * �θ� Ÿ������ ������ �������� �ڽİ�ü�� �����Ҷ� ���� Ű����
	 * ����
	 * if(�θ�ü���� instanceof �ڽ�Ŭ����Ÿ��){
	 * 
	 */
	public void changeEmployeeInfo(Employee[ ] ea) {
		//Manager�� �ѹ��η� �μ��� �����ϰ�
		//Engineer�� ����� javascript�� ����
		for(Employee e : ea) {
			//eŸ������ ������ ��ü�� Manager���
			if(e instanceof Manager) {
				Manager m=(Manager)e;
				m.changeDept("�ѹ���");
			//eŸ������ ������ ��ü�� Engineer���
			}else if(e instanceof Engineer) {
				Engineer eg = (Engineer)e;
				eg.changeTech("Javascript");
			}
			
		}//for
	}//changeEmployeeInfo
	
	//1. �׽�Ʈ Ŭ�������� �Ѱܹ��� empId�� ���� ��ġ�ϴ�
	//Employee��ü�� �����ϴ� ���
	public Employee findEmployeeById(Employee[ ] ea,String id) {
		Employee emp = null;
		for(Employee e : ea) {
			if(e.getEmpId().equals(id)) 
				emp = e;//�ڽ��� �θ𿡰� �ȱ�� �ִ�			
		}
		return emp;
	}//findEmployeeById
	
	//2. �׽�Ʈ Ŭ�������� �Ѱܹ��� adderss�� ���� ��ġ�ϴ�
	//  ��ü�� �����ϴ� ���
	/*public Employee[ ] findEmployeeByAddr(Employee[ ] ea,String addr) {
		Employee[ ] temp = new Employee[ea.length];
		for(int i=0; i<temp.length; i++) {
			if(ea[i].getAddress().equals(addr)) 
				temp[i] = ea[i];			
		}
		return temp;
	}*/
	
	public Employee[ ] findEmployeeByAddr(Employee[ ] ea,String addr) {
		Employee[ ] temp = new Employee[ea.length];
		int count = 0;
		for(int i=0; i<temp.length; i++) {
			if(ea[i].getAddress().equals(addr)) {
				temp[count]=ea[i];
				count++;
			}
		}
		return temp;
	}
	//3. Employee�� ������ �����ϴ� ���
	public int getAnnualSalary(Employee e) {
		int annualSalary = 0;
		
		if(e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary = eg.getSalary()*12 + eg.getBonus();
		}
		
		annualSalary = e.getSalary()*12;
		return annualSalary;
	}
	
	//4. ���� �� �ΰǺ��� �Ѿ��� �����ϴ� ���
	public int getTotalCost(Employee[ ] ea) {
		int totalCoast = 0;
		for(Employee e : ea)
			totalCoast += getAnnualSalary(e);
		
		return totalCoast;
		
	}	
}


























