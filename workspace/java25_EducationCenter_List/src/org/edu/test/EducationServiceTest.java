package org.edu.test;

import java.util.ArrayList;
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
		
		Person s1 = new Student(111, "������", "������", new MyDate(1993, 1, 1), "st11");
		Person s2 = new Student(222, "��ȿ��", "������", new MyDate(1993, 2, 2), "st22");
		Person s3 = new Student(333, "����", "���ǵ�", new MyDate(1990, 1, 11), "st33");
		Person e1 = new Employee(444, "Ŭ���", "����", new MyDate(1980,3,3), "��ȹ��");
		Person t1 = new Teacher(555, "�����", "�Ż絿",  new MyDate(1969,5,3), "������");
		Person t2 = new Teacher(666, "������", "��ȭ��",  new MyDate(1978,6,3), "����");
		
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
		try {
			service.deletePerson(3333);
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
			
			
		System.out.println("==============finePerson()==================");
			System.out.println(service.findPerson(111));
			
			System.out.println("==============finePerson()2==================");
			ArrayList<Person> returnList=service.findPerson("������");
			System.out.println(returnList);
		System.out.println("==============updatePerson()==================");
		try {
			service.updatePerson(new Employee(444, "Ŭ���", "����22", new MyDate(1980,3,3), "�繫��"));
			service.getPersons();
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}















