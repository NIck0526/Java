package reference.service;

import reference.vo.ProductVO;

/*
 * productStore에서 다양한 상품들을 다루는 기능만을 모아놓은 서비스 클래스.
 * 해당 클래스에서 다루는 상품의 기능들...
 * 1) 모든 상품들의 이름을 출력하는 기능 ::
 * 2) 모든 상품의 총 금액을 리턴하는 기능 ::
 * 3) 모든 상품의 평균 금액을 리턴하는 기능 ::
 * 4) 평균가 이상의 상품들을 리턴하는 기능 ::
 * 5) 특정한 제조사의 상품 정보를 출력하는 기능 ::
 * 6) 모든 상품들 중에서 최고가 사품을 찾아서 리턴 ::
 * ::
 * ProductVO 클래스와 has a Relation 관계
 * 인자값으로 Hasing 한다.
 * ProductServiceTest4
 */
public class ProductStoreService {
	//1)
	public void printAllProduct(ProductVO[] pros) {
		for(ProductVO v : pros) 
			System.out.println(v.getModel());
		
	}//printAllproduct
	
	//2)
	
		public int getTotalPrice(ProductVO[] pros) {
		int total =0;
		
		for(ProductVO v : pros)
			total += v.getPrice();
		
		return total;
		
	}//getTotalPrice
	
	//3
	public int getAvgPrice(ProductVO[] pros) {
		return getTotalPrice(pros)/pros.length;
		
	}//getAvgPrice
	
	public ProductVO[] getProductsOverAvg(ProductVO[] pros) { // 앞의 ProductVO[]의 사이즈는 아직 모름 뒤에있는건 Test에 주입된 값 4개
		ProductVO[] temp = new ProductVO[4]; // 그냥 pros 쓰는거랑 무슨차이?
		for(int i =0; i<temp.length; i++) {
			if(pros[i].getPrice() >= getAvgPrice(pros)) {
				temp[i] = pros[i];
			}
			
		}return temp;
	}
	
	//printProductByMaker
	
	public void printProductByMaker(String maker, ProductVO[] pros) {
		for(ProductVO v : pros) {
			if(v.getMaker().equals(maker))
				System.out.println(v.getMaker()+" ");
		}
	}
	
	public int getLowPrice(ProductVO[] pros) {
			for(ProductVO v : pros) {
			int min = v.getPrice();
			if(min<v.getPrice())
				min = v.getPrice();
		}return getLowPrice;
	}

}
