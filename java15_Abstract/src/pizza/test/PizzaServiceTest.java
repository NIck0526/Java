package pizza.test;

import java.util.Vector;

import pizza.child.MargheritaPizza;
import pizza.child.PepperoniPizza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceTest {
	public static void main(String[] args) {
		PizzaService service = new PizzaService();
		//객체 생성의 방법을 확인하려면...
		//api documentation ㅡ이 Constructor Summary 확인
		Vector<Pizza> v = new Vector<Pizza>(20,1); // 20개 만들고 늘어날떄마다 1하니씩 증가
		
		//
		v.add(new PotatoPizza(15000, "PizzaHut"));
		v.add(new MargheritaPizza(16000, "Mr Pizza"));
		v.add(new PepperoniPizza(17000, "PaPaJohn's"));
		v.add(new PotatoPizza(10000, "PizzaSchool"));
		
				
		System.out.println(v.size());//벡터에 4개 추가되어서 4
		System.out.println(v.capacity());// 벡터는 기본적으로 10칸
		
		//벡터는 사이즈만큼만 반복이 되기때문에 1만 출력후 null이 발생되지 않음
		service.allindMakePizza(v);
		
	}

}
