package reference.test;

import reference.vo.Person;

public class PersonArrayTest2 {
	public static void main(String[] args) {
		//����+����+�ʱ�ȭ�� �ѹ���
		
		Person[] persons = {
				new Person("��ȿ��", 37),
				new Person("�̻��", 39),
				new Person("�̼���", 76)
		};
		
		//���� for���� �̿��ؼ� ��ü���� ������ �ַܼ� ���
		
		for(Person p : persons) {
		System.out.print(p.getName()+p.getAge());
		}
		
			
	}//main

}//class
