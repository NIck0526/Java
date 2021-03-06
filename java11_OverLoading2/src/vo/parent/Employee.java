package vo.parent;
/*
 * 문제점
 * ::
 * this() 를 사용해서 또 다른 생성자를 호출했다.
 * 이때 인자값으로 개발자가 직접 기본값을 입력했다.
 * 
 * 해결책
 * ::
 * 상수값을 사용한다.
 * 상수값 : 변하지 않는값
 * 만약에 변경을 하면 컴파일시 에러 발생
 *  1. 상수값을 지정할 때는 final이라는 키워드를 타입 앞에 붙여준다.
 *  2. final은 "내가 마지막 변수야"라는 의미
 *   ex) final int default_salary = 100000.0;
 *  3. 주로 상수값은 메모리에 미리 올려놓고 사용하는 대표적인 변수
 *   ex) static final int default_salary = 100000.0;
 *  4. 상수값의 이름은 반드시 모두 다 대문자로 지정해야 한다.
 *   ex) static final int DEFAULT_SALARY = 100000.0;
 */
import util.MyDate;

public class Employee {
	private String ssn;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public static final String DEFAULT_NAME = "guestt";
	public static final double DEFAULT_SALARY = 50001.0; // Heap 에 올라가지 않아 식구(필드, 메소드 - Heap올라가는) 가 아님. 
	
	
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
		this(ssn,DEFAULT_NAME,new MyDate(1900,1,1), DEFAULT_SALARY); //ssn 빼고 기본값 설정
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







