package poly.arg.step3;

import java.util.Vector;

public class ProductBuyerTest {
	public static void main(String[] args) {
	/*	TV tv= new TV();
		Computer com = new Computer();*/
		
		//객체생성 
		Product tv = new TV();
		Product com = new Computer();
		Product audio1 = new Audio();
		Product audio2 = new Audio();
		
		
		ProductBuyer buyer = new ProductBuyer();
		
		// 넘버
		tv.setpNumber(111);
		com.setpNumber(222);
		audio1.setpNumber(333);
		audio2.setpNumber(444);
		
		//상품을 4개 구입한다
		buyer.buyProduct(tv);
		buyer.buyProduct(com);
		buyer.buyProduct(audio1);
		buyer.buyProduct(audio2);
		
		buyer.summary();
		System.out.println(" 현재 잔액: "+buyer.money+" 만원");
		System.out.println(" 현재 포인트: "+buyer.bonusPoint+" 점");
		
		//환불
		buyer.refund(audio1);
		System.out.println(" 현재 잔액: "+buyer.money+" 만원");
		System.out.println(" 현재 포인트: "+buyer.bonusPoint+" 점");
	}

}
//super class
abstract class Product{
	int price;
	int bonusPoint;
	int pNumber; // 상품을 구분하는 유니크한 값.
	
	//상품이 만들어질때 그떄 가격도 함께 정해짐.
	//이때 보너스도 함께 지정됨.(상품가의 10%)
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
		
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
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

class Audio extends Product{
	Audio(){
		super(80);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}//Audio

//service Class
class ProductBuyer{
	int money = 1000; // 일천만원을 가지고 있음.
	int bonusPoint = 0; //현재 포인트는 0 (구입한 물건이 없다.)
	
	Vector<Product> items = new Vector<Product>(); // 구입한 상품들을 저장하는 일종의보관서 (창고 or 카트)
	int index = 0; //배열 사용시 유용한 index라서 미리 선언한것임.
	
	public void buyProduct(Product p) { //물건 하나사고 계산하고 하나 사고 계산하고, or 물건 통채 한번에 계산하려면 Product[] p 인자값을 넣으면됨
		//items에 상품을 담는다.
		if(money<p.price) {
			System.out.println("돈이 없넴ㅜㅜㅜㅜㅜㅜㅜㅜ?");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		items.add(p); //items[index++] = p;  노트 연습장 부분에 있음.
		System.out.println(p+"를 구입하셨습니다.");
		
	}
	
	public void refund(Product p) {
		//환불 하고자 하는 pNumber와 같다면 해당 p를 제거
		if(items.remove(p)) {
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을(를) 환불처리 하셨습니다.");
		} else {
			System.out.println(p+" 에 해당하는 물건이 없어서 환불 ㄴㄴㄴㄴㄴㄴㄴㄴ");
		}
	}
	
	public void summary() { // Vector안의 내용을 출력
		if(items.isEmpty()) {
			System.out.println("구입하신 물건이 없습니다.....");
		}
		int sum = 0;
		String itemList = " ";
		
		for(int i=0; i<items.size(); i++) { // 
			Product pro = items.get(i);
			sum +=pro.price; // 총합
			itemList += pro+" ";
		}//for
		System.out.println("구입한 상품의 총 금액  : "+sum+" 만원");
		System.out.println("구입한 상품의 총 목록 : "+itemList+" ...");
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

















