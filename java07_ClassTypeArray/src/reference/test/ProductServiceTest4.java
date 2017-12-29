package reference.test;

import reference.service.ProductStoreService;
import reference.vo.ProductVO;

public class ProductServiceTest4 {
	public static void main(String[] args) {
		
		ProductVO [] pros = {
				new ProductVO(111, "공기방울 세탁기", "대우", 400000),
				new ProductVO(222, "방구방구 세탁기", "삼성", 300000),
				new ProductVO(333, "드럼 세탁기", "엘지", 500000),
				new ProductVO(111, "워시워시 세탁기", "넥센", 500000)
		};
		ProductStoreService service = new ProductStoreService();
		System.out.println("=================All Product Model Print================");
		service.printAllProduct(pros);// 1) calling 값을 주입
		
		System.out.println("\n=================All Product Total Price================");
		System.out.println(service.getTotalPrice(pros)+" 원");
		
		System.out.println("\n=================All Product Average Price================");
		System.out.println(service.getAvgPrice(pros)+" 원");
		
		System.out.println("\n=================Products' Over the Average Price================");
		ProductVO[] reProducts = service.getProductsOverAvg(pros);
			for(ProductVO v : reProducts) {
				if(v==null) continue;			
		System.out.println(v.getMaker()+" "+v.getModel()+" "+v.getPrice());
			}
			
	    System.out.println("==============Print Product By Maker===================");
	    service.printProductByMaker("대우", pros);

	    System.out.println("==============The Lowest Product============");
	    System.out.println(service.getLowPrice(pros)+"mmm");
	    
	
	}

}
