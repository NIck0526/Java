package collection.step1.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * ArrayList
 * 30,40,50 20,50,100
 * ::
 * Primitive Type Date들은 Powerful하게 사용 될 수 없다.
 * 기본형 타입 								Class Type (Wrapper Class)
 * byte									Byte
 * short								Short
 * int									Integer 
 * long									Long
 * float								Float
 * double								Double		
 * char									Character
 * boolean								Boolean
 * 
 * (ex)
 * int score = 80;
 * Integer score = new Integer(80); 생성자를 통해 랲핑.
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("아이유1", new Integer(88));
		map.put("아이유2", new Integer(92));
		map.put("아이유3", new Integer(58));
		map.put("아이유4", new Integer(35));
		map.put("아이유5", 78);  // 굳이 안해도 자동으로 됨.
		
		System.out.println("1. KeySET()");
		
		Set<String> set = map.keySet();
	    System.out.println(set);
	//1
	
	
		
	//2. set의 기능을 이용해서 학생들의 이름과 점수를 출력	
	    System.out.println("=========2. iterator() | get(key)=========");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key+" :: "+value);
	}//while
	
	//3.학생들의 점수만 출력할 수 있나요?
	System.out.println("3. values() ");
	Collection<Integer> scores = map.values()	;
	System.out.print(scores);
	
	
	/* 
	 * score를 이용해서 학생들의 총점과 평균점수를 구해서 출력
	 * 학생들의 점수중 최고점수를 출력
	 * ::
	 * 알고리즘을 사용 x | map의 기능을 알아보는 시간
	 */
	 int total = 0; // 총점 구할떈 로컬로 무조건 선언하고 시작해보자
	 Iterator<Integer> i = scores.iterator();
	 while(i.hasNext()) {
		 int score = i.next();
		 total += score;
	 }
	 System.out.println("총점 :: "+total+ " 점");
	 System.out.println("평균점수 ::"+total/map.size());
	 System.out.println("최고점수 ::"+Collections.max(scores));
		
				
	}
	
	
				
				
				
				
				
				
				
				
	}
		

