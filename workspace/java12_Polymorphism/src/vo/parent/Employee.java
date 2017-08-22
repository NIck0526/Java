package vo.parent;
import util.MyDate;

public class Employee {
	private String ssn;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public static final String DEFAULT_NAME = "guestt";
	public static final double DEFAULT_SALARY = 50001.0; // Heap �� �ö��� �ʾ� �ı�(�ʵ�, �޼ҵ� - Heap�ö󰡴�) �� �ƴ�. 
	
	
	public Employee(String ssn, String name, MyDate birthDate, double salary) {
		// super(); �θ��� �⺻ �����ڴ� ������ ȣ���.
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	
	public Employee(String ssn) {
		this(ssn,DEFAULT_NAME,new MyDate(1900,1,1), DEFAULT_SALARY); //ssn ���� �⺻�� ����
	}
	
	public Employee(String ssn, String name, double salary) {
		this(ssn,name,new MyDate(1901,2,2), salary);
	}

	public String getDetails() {
		return ssn+"\t"+name+"\t"+birthDate+"\t"+salary;
	}	
}

/*
 * this Ű����
 * 1. field�տ� ���Ǵ� this
 *  - : ���� ������ �ʵ��� �̸��� ������ �̸� �����ϱ� ���ؼ�
 *     field�տ� this�� ���δ�.
 *  - �� Ŭ���� �ڱ��ڽ��� �ǹ�
 *  - this.ssn = ssn;
 * 2. �����ھ��� this
 *  - ������ OverLoading���� �ʼ����̴�.
 *  - ���� Ŭ���� �ȿ��ִ� �� �ٸ� �����ڸ� ȣ���� �� ���
 *  - this(ssn, "guest", new MyDate(1900,1,1), 10000.0)
 * 3. this Ű����� �ݵ�� super �Ʒ����� ���Ǿ�� �Ѵ�.
 *  - �θ�ü�� ���� �޸𸮿� �ö󰡾�
 *    �ڽİ�ü�� �� �Ŀ� �ö� �� ������ �����Ѵ�.
 */







