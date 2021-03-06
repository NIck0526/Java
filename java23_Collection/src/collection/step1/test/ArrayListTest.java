package collection.step1.test;

import java.util.ArrayList;
import java.util.List;

/*
 * List의 자식으로 가장 많이 사용되는 ArrayList
 * 데이타를 저장하고 / 저장된 데이타를 다시 추출하는 기능들을 사용
 * List 저장방법론의 특징으로는
 * 순서를 가지면서 저장 | 중복은 허용
 */
public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("아이유");
		list.add("이효리");
		list.add("김상순");
		list.add("아이유");
		//Collection에서는 toString()이 오버라이딩 되어있다.
		//데이타 출력으로...
		System.out.println(list);//why 주소값???
		System.out.println("1.list에 들어있는 데이타의 갯수 ::" +list.size());
		
		//1. 두번쨰 데이타를 삭제
		list.remove(1);
		System.out.println("remove" +list);
		//2. 마지막 데이타를 효리로 수정
		list.set(2, "효리");
		System.out.println("set"+list);
		//3. list 안에 데이타가 하나라도 있다면 모든 데이타를 삭제
		if(!list.isEmpty())
			list.clear();
		
		System.out.println("clear() "+list);
		//4. 첫번째 저장된 이름을 리턴받아서
		list.add("KOSTA");
		String firstName = (String)list.get(0); //Object로 리턴하기 때문에 String으로 바꿔줘야함
		System.out.println("첫번쨰 이름 get() "+firstName);
		// 첫번째 이름을 출력
	}

}



/*
 * get() | add() | boolean remove(Object), remove(index) | set()
 * isEmpty() | size()
 * 자체적으로 toString()이 데이타를 출력으로 오버라이딩 되어있다.
 */


