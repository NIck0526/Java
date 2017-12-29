package reference.self.test;

import reference.self.ProductVOSelf;
import reference.self.ProductVOService;

public class ProductServiceTest {
	public static void main(String[] args) {
		ProductVOSelf [] pros = {
				new ProductVOSelf("´ë¿ì", "°ø±â¹æ¿ï ¼¼Å¹±â", 111, 4000000),
				new ProductVOSelf("»ï¼º", "¹æ±¸¹æ±¸ ¼¼Å¹±â", 222, 3000000),
				new ProductVOSelf("¿¤Áö", "µå·³ ¼¼Å¹±â", 333, 2000000),
				new ProductVOSelf("³Ø¼¾", "¿ö½Ã¿ö½Ã ¼¼Å¹±â", 111, 3500000)
		};
		ProductVOService service = new ProductVOService();
		System.out.println("=================All Product Mode0l Print================");
		service.printAllProduct(pros);
		//end 1
		
		System.out.println("\n=================All Product Total Price================");
		System.out.println(service.getTotalPrice(pros)+" ¿ø");
		//end2
		
	}

}
