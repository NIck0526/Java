package collection.step2.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collection.step2.vo.Person;

public class PersonListTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person ("아이유1",24,"여의도"));
		list.add(new Person ("이상순1",26,"북한"));
		list.add(new Person ("이효리1",74,"여의도"));
		list.add(new Person ("유재석1",41,"부산"));
		list.add(new Person ("강호동1",53,"당진"));
		
		//1. list에 저장된 사람의 수는?
		System.out.println("===1. 사람의 수는 ? :: "+ list.size());
		
		//2. 첫번째 저장된 사람을 찾아서 그 사람의 주소를 출력
		System.out.println("===2. 첫번쨰 사람의 주소 :: "+list.get(0).getAddress());
		
		//3. 모든 사람의 나이의 합
		int total=0;
		for(Person p : list)
			total += p.getAge();
			
		System.out.println("===3. 나이의 합 :: "+total);
		
		//4. 평균연령
		System.out.println("===4. 평균 연령 :: "+total/list.size());
		
		//5. 동일한 주소(여의도)에 사는 사람이 몇명인지를 구하고 
		//해당 주소에 사는 사람의 정보를 출력
		int count = 0 ;
		for(Person p : list)
			if(p.getAddress().equals("여의도")) {
				count++;
				System.out.println(p);
			}
		
		System.out.println("여의도에 거주하는 사람은 "+count+" 명");
    }

}
