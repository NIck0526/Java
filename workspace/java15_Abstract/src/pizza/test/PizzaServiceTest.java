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
		//��ü ������ ����� Ȯ���Ϸ���...
		//api documentation ���� Constructor Summary Ȯ��
		Vector<Pizza> v = new Vector<Pizza>(20,1); // 20�� ����� �þ������ 1�ϴϾ� ����
		
		//
		v.add(new PotatoPizza(15000, "PizzaHut"));
		v.add(new MargheritaPizza(16000, "Mr Pizza"));
		v.add(new PepperoniPizza(17000, "PaPaJohn's"));
		v.add(new PotatoPizza(10000, "PizzaSchool"));
		
				
		System.out.println(v.size());//���Ϳ� 4�� �߰��Ǿ 4
		System.out.println(v.capacity());// ���ʹ� �⺻������ 10ĭ
		
		//���ʹ� �����ŭ�� �ݺ��� �Ǳ⶧���� 1�� ����� null�� �߻����� ����
		service.allindMakePizza(v);
		
	}

}
