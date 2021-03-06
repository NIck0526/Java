package org.edu.test;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.service.EducationService;
import org.edu.util.MyDate;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationServiceTest {
	public static void main(String[] args) {
		EducationService service = new EducationService(10);
		/*
		 * Student3, Employee1, Teacher2
		 */
		Student s1 = new Student(111, "������", "������", new MyDate(1993, 1, 1), "st11");
		Student s2 = new Student(222, "�α���", "������", new MyDate(1993, 2, 2), "st22");
		Student s3 = new Student(333, "������", "���ǵ�", new MyDate(1990, 1, 11), "st33");
		Employee e1 = new Employee(444, "���ӽ�", "����", new MyDate(1980,3,3), "��ȹ��");
		Teacher t1 = new Teacher(555, "Ŭ���", "�Ż絿",  new MyDate(1983,5,3), "������");
		Teacher t2 = new Teacher(666, "������", "��ȭ��",  new MyDate(1978,6,3), "����");
		
		System.out.println("==============addPerson()==================");
		try{
			service.addPerson(s1);
			service.addPerson(s2);
			service.addPerson(s3);
			service.addPerson(e1);
			service.addPerson(t1);
			service.addPerson(t2);
			service.addPerson(s1);
		}catch(DuplicateSSNException e){
			System.out.println(e.getMessage());
		}
		service.getPersons();
		
		System.out.println("==============deletePerson()==================");
		try{
			service.deletePerson(555);
		}catch(RecordNotFoundException e){
			System.out.println(e.getMessage());
		}
		service.getPersons();
		
		
		System.out.println("==============finePerson()==================");
			System.out.println(service.findPerson(222));
		
			
		System.out.println("==============finePerson()==================");
			Person[ ] parr = service.findPerson("������");
			for(Person p : parr){
				if(p==null) continue;
				System.out.println(p);
			}
		System.out.println("==============updatePerson()==================");

	}
}















