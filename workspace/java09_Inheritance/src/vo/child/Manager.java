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
	 */
	@Override
	public String toString() {
		return super.getDetails()+"\t"+dept;
	}
}







