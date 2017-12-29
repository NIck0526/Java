package reference.service;

import reference.vo.ProductVO;

/*
 * productStore���� �پ��� ��ǰ���� �ٷ�� ��ɸ��� ��Ƴ��� ���� Ŭ����.
 * �ش� Ŭ�������� �ٷ�� ��ǰ�� ��ɵ�...
 * 1) ��� ��ǰ���� �̸��� ����ϴ� ��� ::
 * 2) ��� ��ǰ�� �� �ݾ��� �����ϴ� ��� ::
 * 3) ��� ��ǰ�� ��� �ݾ��� �����ϴ� ��� ::
 * 4) ��հ� �̻��� ��ǰ���� �����ϴ� ��� ::
 * 5) Ư���� �������� ��ǰ ������ ����ϴ� ��� ::
 * 6) ��� ��ǰ�� �߿��� �ְ� ��ǰ�� ã�Ƽ� ���� ::
 * ::
 * ProductVO Ŭ������ has a Relation ����
 * ���ڰ����� Hasing �Ѵ�.
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
	
	public ProductVO[] getProductsOverAvg(ProductVO[] pros) { // ���� ProductVO[]�� ������� ���� �� �ڿ��ִ°� Test�� ���Ե� �� 4��
		ProductVO[] temp = new ProductVO[4]; // �׳� pros ���°Ŷ� ��������?
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
