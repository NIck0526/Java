package pizza.child;

import pizza.parent.Pizza;
/*
 * Pizza의 abstract method에는 반드시 자식 클래스에서 구현해줘야 함
 * 부모 : abstract
 * 자식 : 완전한 메소드로 정의 해야함 - {}
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
