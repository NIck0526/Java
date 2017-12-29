package reference.test;

import reference.vo.Person;

public class PersonArrayTest2 {
	public static void main(String[] args) {
		//선언+생성+초기화를 한번에
		
		Person[] persons = {
				new Person("이효리", 37),
				new Person("이상순", 39),
				new Person("이순재", 76)
		};
		
		//향상된 for문을 이용해서 객체들의 내용을 콘솔로 출력
		
		for(Person p : persons) {
		System.out.print(p.getName()+p.getAge());
		}
		
			
	}//main

}//class
