package collection.step1.test;
/*
 * Set은 유니크한 데이타만 저장하는 특징을 가짐
 * 순서는 없다
 * ::
 * add() | boolean remove(object) |
 * ::
 * set() | get() 이없다 . 순서가 없어서 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest3 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("이효리");
		set.add("이상순");
		set.add("아이유");
		set.add("이상순");
		
		System.out.println(set); // 순서가없는걸 확인 할 수 있음. 중복이 없음.
		System.out.println("1. set안에 들어있는 데이타의 갯수 ::"+set.size());
		
		//1. set안에 아이유가 들어있는지의 여부
		
		System.out.println("2. 아이유가 있나염"+set.contains("아이유"));
		
		//2. 효리를 삭제하세요.
		System.out.println("3. 효리 삭제 :"+set.remove("효리"));
		
		//set.clear()
		//System.out.println(set);
		
		//3. 뽑아보자 ... iterator()
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			}
	}
}
