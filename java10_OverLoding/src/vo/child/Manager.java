package vo.child;
import util.MyDate;
/*
 * super::
 * 상위클래스를 지칭하는 키워드
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
	//생성자 추가..
	public Manager(String ssn, String name, MyDate birthDate, double salary,
			String dept){
		/*this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		*/
		
		super(ssn,name,birthDate,salary); // 생성자를 통해 접근
		this.dept = dept;
		
	}
	
	/*
	 * Method Overriding
	 * ::
	 * step.1 부모에게 물려받은 것을 그대로 물려 받았다.
	 * step.2 받은걸 고쳤다.
	 */
	@Override
	public String toString() {
		return super.getDetails()+"\t"+dept;
	}
}








