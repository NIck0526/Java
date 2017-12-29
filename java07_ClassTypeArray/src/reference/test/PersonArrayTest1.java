package reference.test;

import reference.vo.Person;

public class PersonArrayTest1 {
	public static void main(String[] args) {
		// 1. Person Ÿ���� �迭�� ����...������� 3  �迭 �̸��� p
		
		Person[] p = new Person[3];
		
		// 2. for���� ������ ������ elements ��Ұ��� ���
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i]+" ' ");
		}//for

		// 3 . Array ������ �ּҰ��� Ȯ��
		System.out.println("\n �ּҰ� ::"+p);
		
		// 4. �ʱ�ȭ
		p[0] = new Person("��ȿ��", 37);
		p[1] = new Person("�̻���", 25);
		p[2] = new Person("���̷�", 27);
		for(Person person : p)
			System.out.println(person.getName()+" , "+person.getAge());
	}//main

}//class
