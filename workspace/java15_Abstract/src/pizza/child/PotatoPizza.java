package pizza.child;

import pizza.parent.Pizza;
/*
 * Pizza�� abstract method���� �ݵ�� �ڽ� Ŭ�������� ��������� ��
 * �θ� : abstract
 * �ڽ� : ������ �޼ҵ�� ���� �ؾ��� - {}
 */
public class PotatoPizza extends Pizza{
	
	
	

	public PotatoPizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void topping() { // void topping();
		System.out.println("Potato Topping Pizza..........");
		
	}

}
