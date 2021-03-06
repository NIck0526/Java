package poly.arg.step1;

public class ProductBuyerTest {
	public static void main(String[] args) {
		TV tv= new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();
		
		buyer.buyTV(tv);
		buyer.buyComputer(com);
		System.out.println("현재 남은 금액은 "+buyer.money);
		System.out.println("현재 적립된 포인트는 "+buyer.bonusPoint);

	}

}
//super class
class Product{
	int price;
	int bounsPoint;
	
	//상품이 만들어질때 그떄 가격도 함께 정해짐.
	//이때 보너스도 함께 지정됨.(상품가의 10%)
	Product(int price){
		this.price = price;
		bounsPoint = (int)(price/10);
		
	}
}//product

//sub class
class TV extends Product{
	TV(){
		super(150);
	}
	@Override
	public String toString() {
		return "TV";
	}
}//TV

//sub class
class Computer extends Product{
	Computer(){
		super(100);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}//computer

//service Class
class ProductBuyer{
	int money = 1000; // 일천만원을 가지고 있음.
	int bonusPoint = 0; //현재 포인트는 0 (구입한 물건이 없다.)
	
	public void buyTV(TV tv) {
		/*
		 * 가진 돈보다 물건의 가격이 작거나, 같을때만 살수있다.
		 * 상품의 가격만큼 돈은 빠지고 / 
		 * 상품가에 10%만큼 보너스포인트는 올라가고
		 * 최종적으로 구입한 물건의 정보를 출력
		 */
		if(money<=tv.price) {
			System.out.println("잔액이 부족해서 물건구입이 안됩니다.");
			return;//buyTV를 호출한 곳으로 되돌린다.
		}
		//상품 사는 로직을 전개
		money -=tv.price;
		bonusPoint +=tv.bounsPoint;
		System.out.println(tv+"를(을) 구입하셨습니다. ㅊㅋㅊㅋ");
	}//buyTV
	
	public void buyComputer(Computer com) {
		/*
		 * 가진 돈보다 물건의 가격이 작거나, 같을때만 살수있다.
		 * 상품의 가격만큼 돈은 빠지고 / 
		 * 상품가에 10%만큼 보너스포인트는 올라가고
		 * 최종적으로 구입한 물건의 정보를 출력
		 */
		if(money<=com.price) {
			System.out.println("잔액이 부족해서 물건구입이 안됩니다.");
			return;//buyComputer를 호출한 곳으로 되돌린다.
		}
		//상품 사는 로직을 전개
		money -=com.price;
		bonusPoint +=com.bounsPoint;
		System.out.println(com+"를(을) 구입하셨습니다. ㅊㅋㅊㅋ");
	}
	
}

/*
 * 문제점
 * ::
 * 1. buyTV(tv), buyComputer(com)
 *  해결방안->
 *  buyProduct(tv), buyProduct(com) - Overloading 적용한것임 이것이. 그러나 계속 인자값은 바꿔줘야함.
 *  해결방안 2->
 *  buyProduct(Product p){
 *   if(p instanceof TV)
 *   if(p instanceof Computer)
 *   -Polymorphic argument 적용한 것.
 */

















