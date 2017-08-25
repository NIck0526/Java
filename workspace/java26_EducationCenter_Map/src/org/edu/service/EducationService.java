package org.edu.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.vo.Person;

public class EducationService {
	private HashMap<Integer, Person> map;
	
	
	public EducationService(int size){
		map = new HashMap<Integer, Person>();
	}
	
	public void addPerson(int ssn, Person per)throws DuplicateSSNException{
		if(map.containsKey(ssn)) {//Index������ ���� ������ for����� contains�� ã��
			System.out.println(ssn+"��ȣ�� ���� ����� �̹� �ִٳ�.");
			throw new DuplicateSSNException("addPerson() call....");
		}else {
			map.put(ssn, per);
			System.out.println(per.getName()+"���� ���...");
			
		}
	}
	
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		Person p=map.remove(ssn);
		if(p==null) {
			System.out.println(ssn+"������ ����� ���ٳ�");
			throw new RecordNotFoundException("deletePerson() call...");
		}else {
			System.out.println(ssn+"���� Ż��...");
		}
	}
	
	  //ssn�� �������� �־� Ư���� ����� ã�Ƽ� �����ϴ� ����
	 
	public Person findPerson(int ssn){
		return map.get(ssn);
	}
	
	public ArrayList<Person> findPerson(String address){
		ArrayList<Person> temp = new ArrayList<Person>();
		Collection<Person> c = map.values();
		for(Person p : c) {
			if(p.getAddress().equals(address))
				temp.add(p);
		}
		return temp;
	}	
	
	// * ������ ����� ���ٸ� RecordNotFoubndException�� �Ͷ߸���.
	 //* ssn�� ������ ����� �ƴϴ�.
	 
	/*public void updatePerson(Person person)
			throws RecordNotFoundException{//���ڰ�??
		if(map.containsKey(person.getSsn()))
			map.put(person.getSsn(), person);
		else
			throw new RecordNotFoundException();
		
	}	*/
	 
	public void pritnAllPersonInfo() {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int ssn = it.next();
			System.out.println("key : "+ssn+"\n PersonInfo :"+ map.get(ssn));
		}
	}
}


























