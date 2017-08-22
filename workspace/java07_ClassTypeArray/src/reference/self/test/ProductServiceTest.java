package reference.self.test;

import reference.self.ProductVOSelf;
import reference.self.ProductVOService;

public class ProductServiceTest {
	public static void main(String[] args) {
		ProductVOSelf [] pros = {
				new ProductVOSelf("���", "������ ��Ź��", 111, 4000000),
				new ProductVOSelf("�Ｚ", "�汸�汸 ��Ź��", 222, 3000000),
				new ProductVOSelf("����", "�巳 ��Ź��", 333, 2000000),
				new ProductVOSelf("�ؼ�", "���ÿ��� ��Ź��", 111, 3500000)
		};
		ProductVOService service = new ProductVOService();
		System.out.println("=================All Product Mode0l Print================");
		service.printAllProduct(pros);
		//end 1
		
		System.out.println("\n=================All Product Total Price================");
		System.out.println(service.getTotalPrice(pros)+" ��");
		//end2
		
	}

}
