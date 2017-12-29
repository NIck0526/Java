package reference.test;

import reference.service.ProductStoreService;
import reference.vo.ProductVO;

public class ProductServiceTest4 {
	public static void main(String[] args) {
		
		ProductVO [] pros = {
				new ProductVO(111, "������ ��Ź��", "���", 400000),
				new ProductVO(222, "�汸�汸 ��Ź��", "�Ｚ", 300000),
				new ProductVO(333, "�巳 ��Ź��", "����", 500000),
				new ProductVO(111, "���ÿ��� ��Ź��", "�ؼ�", 500000)
		};
		ProductStoreService service = new ProductStoreService();
		System.out.println("=================All Product Model Print================");
		service.printAllProduct(pros);// 1) calling ���� ����
		
		System.out.println("\n=================All Product Total Price================");
		System.out.println(service.getTotalPrice(pros)+" ��");
		
		System.out.println("\n=================All Product Average Price================");
		System.out.println(service.getAvgPrice(pros)+" ��");
		
		System.out.println("\n=================Products' Over the Average Price================");
		ProductVO[] reProducts = service.getProductsOverAvg(pros);
			for(ProductVO v : reProducts) {
				if(v==null) continue;			
		System.out.println(v.getMaker()+" "+v.getModel()+" "+v.getPrice());
			}
			
	    System.out.println("==============Print Product By Maker===================");
	    service.printProductByMaker("���", pros);

	    System.out.println("==============The Lowest Product============");
	    System.out.println(service.getLowPrice(pros)+"mmm");
	    
	
	}

}
