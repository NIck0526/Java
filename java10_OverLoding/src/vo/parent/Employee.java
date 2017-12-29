package vo.parent;
//Super Class
/*
 * 생성자 오버로딩
 * ::
 * OverLoading의 Rule
 * ::
 *  1. 하나의 클래스에서만 적용됨
 *  2. 생성자 이름은 가다.
 *  3. 인자값이 달라야 한다.(순서, 갯수, 타입 중 하나라도 달라야 한다)
 *  하는 일은 같지만 처리하는 데이타를 달리할때 쓰이는 기법이다.
 */
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
	/*
	 * 생성자 앞의 this의 용도
	 * ::
	 * 하나의 클래스에서 다른 생성자를 호출하는데 사용됨.
	 */
	
	public Employee(String ssn) {
		this(ssn,"guest",new MyDate(1900,1,1),10000.0); //ssn 빼고 기본값 설정
	}
	
	public Employee(String ssn, String name, double salary) {
		this(ssn,name,new MyDate(1901,2,2), salary);
	}

	public String getDetails() {
		return ssn+"\t"+name+"\t"+birthDate+"\t"+salary;
	}	
}

/*
 * this 키워드
 * 1. field앞에 사용되는 this
 *  - : 로컬 변수와 필드의 이름이 같을때 이를 구분하기 위해서
 *     field앞에 this를 붙인다.
 *  - 이 클래스 자기자신을 의미
 *  - this.ssn = ssn;
 * 2. 생성자앞의 this
 *  - 생성자 OverLoading에서 필수적이다.
 *  - 같은 클래스 안에있는 또 다른 생성자를 호출할 떄 사용
 *  - this(ssn, "guest", new MyDate(1900,1,1), 10000.0)
 * 3. this 키워드는 반드시 super 아래에서 사용되어야 한다.
 *  - 부모객체가 먼저 메모리에 올라가야
 *    자식객체가 그 후에 올라갈 수 있음을 반증한다.
 */







