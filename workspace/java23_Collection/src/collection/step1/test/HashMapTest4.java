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
 * Primitive Type Date���� Powerful�ϰ� ��� �� �� ����.
 * �⺻�� Ÿ�� 								Class Type (Wrapper Class)
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
 * Integer score = new Integer(80); �����ڸ� ���� �N��.
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("������1", new Integer(88));
		map.put("������2", new Integer(92));
		map.put("������3", new Integer(58));
		map.put("������4", new Integer(35));
		map.put("������5", 78);  // ���� ���ص� �ڵ����� ��.
		
		System.out.println("1. KeySET()");
		
		Set<String> set = map.keySet();
	    System.out.println(set);
	//1
	
	
		
	//2. set�� ����� �̿��ؼ� �л����� �̸��� ������ ���	
	    System.out.println("=========2. iterator() | get(key)=========");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key+" :: "+value);
	}//while
	
	//3.�л����� ������ ����� �� �ֳ���?
	System.out.println("3. values() ");
	Collection<Integer> scores = map.values()	;
	System.out.print(scores);
	
	
	/* 
	 * score�� �̿��ؼ� �л����� ������ ��������� ���ؼ� ���
	 * �л����� ������ �ְ������� ���
	 * ::
	 * �˰������� ��� x | map�� ����� �˾ƺ��� �ð�
	 */
	 int total = 0; // ���� ���ҋ� ���÷� ������ �����ϰ� �����غ���
	 Iterator<Integer> i = scores.iterator();
	 while(i.hasNext()) {
		 int score = i.next();
		 total += score;
	 }
	 System.out.println("���� :: "+total+ " ��");
	 System.out.println("������� ::"+total/map.size());
	 System.out.println("�ְ����� ::"+Collections.max(scores));
		
				
	}
	
	
				
				
				
				
				
				
				
				
	}
		
