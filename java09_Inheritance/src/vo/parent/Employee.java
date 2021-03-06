package vo.parent;
//Super Class
import util.MyDate;

public class Employee {
	private String ssn;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	
	
	public Employee(String ssn, String name, MyDate birthDate, double salary) {
		// super(); 부모의 기본 생성자는 무조건 호출됨.
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}



	public String getDetails() {
		return ssn+"\t"+name+"\t"+birthDate+"\t"+salary;
	}	
}
