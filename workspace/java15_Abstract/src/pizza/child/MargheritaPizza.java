package pizza.child;

import pizza.parent.Pizza;
/*
 * Pizza�� abstract method���� �ݵ�� �ڽ� Ŭ�������� ��������� ��
 * �θ� : abstract
 * �ڽ� : ������ �޼ҵ�� ���� �ؾ��� - {}
 */
public class MargheritaPizza extends Pizza{
	
	
	

	public MargheritaPizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void topping() { // void topping();
		System.out.println("Margherita Topping Pizza..........");
		
	}

}
