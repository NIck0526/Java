package vo.child;
import util.MyDate;
/*
 * super::
 * ����Ŭ������ ��Ī�ϴ� Ű����
 * super();
 * super.name;
 * super.getDetails();
 * 
 * Sub Class
 * ::
 * Engineer - String tech
 * Secretary - isBoss boolean
 */
import vo.parent.Employee;

public class Manager extends Employee{
	private String dept;
	//������ �߰�..
	public Manager(String ssn, String name, MyDate birthDate, double salary,
			String dept){
		/*this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		*/
		
		super(ssn,name,birthDate,salary); // �����ڸ� ���� ����
		this.dept = dept;
		
	}
	
	/*
	 * Method Overriding
	 * ::
	 * step.1 �θ𿡰� �������� ���� �״�� ���� �޾Ҵ�.
	 * step.2 ������ ���ƴ�.
	 * 
	 * Method OverLoding
	 * ::
	 * 1. �ϳ��� Ŭ���������� �߻��ϴ� ����
	 * 2. �޼ҵ� �̸��� �ݵ�� ���ƾ� �Ѵ�.
	 * 3. �޼ҵ� ���� ���� �ݵ�� �޶�� �Ѵ�.
	 * 4. �޼ҵ� ����Ÿ���� �������!!!
	 */
	@Override
	public String getDetails() {
		return super.getDetails()+"\t"+dept;
	}
	/*public void getDetails(String dept) {
		System.out.println("����� �μ��� "+dept+" �Դϴ�.");
	}
	public void getDetails(double salary) {
		System.out.println("����� ������ "+salary+" �Դϴ�.");
	}*/
	
	/*public String getBaseDepartment(String dept) {
		return dept;		
	}
	
	public void printDefaultSalary(double salary) {
		System.out.println("����� ������ "+salary+" �Դϴ�.");
	}
	
	public void printDefaultName(String name) {
		System.out.println("����� �̸��� "+name+" �Դϴ�.");
	}*/
	
	// 2. Method Overloading ����� ������ ��
	public String getDefaultInfo(String dept) {
		return dept;		
		
	}
	
	public double getDefaultInfo(double salary) {
		return salary;
	}
	
	public void getDefaultInfo(String name, String dept) {
		System.out.println(" �̸� : "+Employee.DEFAULT_NAME+" , �μ� : "+dept);
	}
	
	//�޼ҵ带 �߰�...
	public void changeDept(String dept) {
		this.dept = dept;
	}
}








