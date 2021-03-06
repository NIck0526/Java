package collection.step2.vo;

import java.util.Collection;
import java.util.HashMap;

public class CustomerMapTest {
	public static void main(String[] args) {
		HashMap<Integer, Customer> map = new HashMap<Integer, Customer>();
		map.put(111, new Customer(111, "이효리", 35));
		map.put(222, new Customer(222, "이상순", 37));
		map.put(333, new Customer(333, "아이유", 39));
		
		System.out.println(map.get(222));
		/*
		 * id값이 111인 객체를 찾아서 그 사람의 이름을 출력
		 */
		
		/*
		1번째방법
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int id = it.next();
			Customer custom = map.get(id);
			if(custom.getCustId()==111)
				System.out.println("ID 가 111인 사람의 이름 : "+custom.getName());
		}*/
		
		//2번쨰 방법
		/*Collection<Customer> collection = map.values();
		for(Customer c : collection)
			if(c.getCustId()==111)
				System.out.println("ID 가 111인 사람의 이름 : "+c.getName());*/
		
		//3번쨰 방법
		
		/*Set<Entry<Integer, Customer>> s = map.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			Map.Entry e = (Entry)i.next();
			Customer custom = (Customer)e.getValue();
			if(custom.getCustId()==111);
			System.out.println("ID가 111인 사람은 : "+custom.getName());*/
		
		//3. 고객들 나이의 총합을 구하고 평균연령을 출력
		
		int custAllAge = 0;
		Collection<Customer> coll = map.values();
		for(Customer c : coll)
			custAllAge += c.getAge();
		System.out.println("평균 연령 : "+custAllAge/map.size());
		
	}
}


