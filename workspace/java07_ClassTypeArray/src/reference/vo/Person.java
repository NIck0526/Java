package reference.vo;
/*
 * VO Class
 * ::
 * Value Object
 * ��� ���̺��� �ϳ��� row�� Instanceȭ ��Ų Ŭ����
 * ��� ���̺��� �÷��� voŬ�������� field�� ���εȴ�.
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
