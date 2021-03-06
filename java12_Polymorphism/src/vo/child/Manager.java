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
	 * 
	 * Method OverLoding
	 * ::
	 * 1. 하나의 클래스에서만 발생하는 성질
	 * 2. 메소드 이름은 반드시 같아야 한다.
	 * 3. 메소드 인자 값은 반드시 달라야 한다.
	 * 4. 메소드 리턴타입은 상관없어!!!
	 */
	@Override
	public String getDetails() {
		return super.getDetails()+"\t"+dept;
	}
	/*public void getDetails(String dept) {
		System.out.println("당신의 부서는 "+dept+" 입니다.");
	}
	public void getDetails(double salary) {
		System.out.println("당신의 월급은 "+salary+" 입니다.");
	}*/
	
	/*public String getBaseDepartment(String dept) {
		return dept;		
	}
	
	public void printDefaultSalary(double salary) {
		System.out.println("당신의 월급은 "+salary+" 입니다.");
	}
	
	public void printDefaultName(String name) {
		System.out.println("당신의 이름은 "+name+" 입니다.");
	}*/
	
	// 2. Method Overloading 기법을 적용한 예
	public String getDefaultInfo(String dept) {
		return dept;		
		
	}
	
	public double getDefaultInfo(double salary) {
		return salary;
	}
	
	public void getDefaultInfo(String name, String dept) {
		System.out.println(" 이름 : "+Employee.DEFAULT_NAME+" , 부서 : "+dept);
	}
	
	//메소드를 추가...
	public void changeDept(String dept) {
		this.dept = dept;
	}
}








