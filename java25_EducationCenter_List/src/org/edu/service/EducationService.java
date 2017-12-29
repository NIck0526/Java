package org.edu.service;

import java.util.ArrayList;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationService {
	private ArrayList<Person> list;
	
	public EducationService(int size){
		list = new ArrayList<Person>();
	}
	
	public void addPerson(Person per)throws DuplicateSSNException{
		boolean found = false; //�߰��� ����� �߰ߵ��� ����
		for(Person p : list) {
			if(p.getSsn()==per.getSsn()) { //�̹� ����� �ִ�
				found = true;
				throw new DuplicateSSNException(per.getName()+" :: �׷� ��� �̹� �־��..");
			}
		}//for
		
		if(found==false) list.add(per);
		System.out.println(per.getName()+" ���� ȸ������ ��ϵǾ����ϴ�..");

	}
	
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		boolean found = false;
		for(Person p : list) {
			if(ssn==p.getSsn()) {
				found = true;
				System.out.println(p.getName()+" ���� Ż���ϼ̽��ϴ�");
				list.remove(p);
				break; //				
			}
		}//
		
		if(found==false) throw new RecordNotFoundException("������ ����� �����");
		
	}
	/*
	 * ssn�� �������� �־� Ư���� ����� ã�Ƽ� �����ϴ� ����
	 */
	public Person findPerson(int ssn){
		Person person = null;	
		for(Person p : list) {
			if(ssn==p.getSsn())
				person = p;
		}
		return person;
	}
	
	public ArrayList<Person> findPerson(String address){
		ArrayList<Person> temp = new ArrayList<Person>();
		
		for(Person p : list) {
			if(address.equals(p.getAddress()))
				temp.add(p);			
		}
		System.out.println(address+" �� ��� ����� "+temp.size()+" ���Դϴ�.");
		return temp;
	}
	/*
	 * ������ ����� ���ٸ� RecordNotFoubndException�� �Ͷ߸���.
	 * ssn�� ������ ����� �ƴϴ�.
	 */
	public void updatePerson(Person person)
			throws RecordNotFoundException{//���ڰ�??
		boolean found = false;
		
		for(Person p : list) {
			if(person.getSsn()==p.getSsn()) {
				
				p.setAddress(person.getAddress());
				if(p instanceof Employee) {
					Employee e1=(Employee)p;
					e1.setDept(((Employee)person).getDept());
				}
				if(p instanceof Student) {
					Student s1=(Student)p;
					s1.setStuId(s1.getStuId());
				}
				if(p instanceof Teacher) {
					Teacher t1=(Teacher)p;
					t1.setSubject(t1.getSubject());
				}
			}//if
		}//for
	}	
	public void getPersons(){
		for(Person p : list) {
			System.out.println(p);
		}
	}
}


























