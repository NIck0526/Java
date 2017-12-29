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
		if(map.containsKey(ssn)) {//Index개념이 없기 때문에 for문대신 contains로 찾음
			System.out.println(ssn+"번호를 가진 사람이 이미 있다네.");
			throw new DuplicateSSNException("addPerson() call....");
		}else {
			map.put(ssn, per);
			System.out.println(per.getName()+"님이 등록...");
			
		}
	}
	
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		Person p=map.remove(ssn);
		if(p==null) {
			System.out.println(ssn+"삭제할 대상이 없다네");
			throw new RecordNotFoundException("deletePerson() call...");
		}else {
			System.out.println(ssn+"님이 탈퇴...");
		}
	}
	
	  //ssn을 조건으로 주어 특정한 사람을 찾아서 리턴하는 로직
	 
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
	
	// * 수정할 사람이 없다면 RecordNotFoubndException을 터뜨린다.
	 //* ssn은 수정의 대상이 아니다.
	 
	/*public void updatePerson(Person person)
			throws RecordNotFoundException{//인자값??
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


























