package reference.vo;
/*
 * VO Class
 * ::
 * Value Object
 * 디비 테이블의 하나의 row를 Instance화 시킨 클래스
 * 디비 테이블의 컬럼은 vo클래스에의 field로 매핑된다.
 */
public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
