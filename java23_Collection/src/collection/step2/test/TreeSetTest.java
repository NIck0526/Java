package collection.step2.test;

import java.util.TreeSet;

/*
 * TreeSet
 * ::
 * HashSet + Sorting(정령) 기능
 * Unique + 순서없음 (저장되는 순서)
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("James");
		set.add("Gosling");
		set.add("Mike");
		set.add("Tomas");
		System.out.println(set);
		System.out.println("=============");
		
		TreeSet set2 = new TreeSet();
		set2.add(new Integer(10));
		set2.add(new Integer(100));
		set2.add(10);
		set2.add(50);
		set2.add(11);
		System.out.println(set2);
		System.out.println("=============");
		
	}

}
