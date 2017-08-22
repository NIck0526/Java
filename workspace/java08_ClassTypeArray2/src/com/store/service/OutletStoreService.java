package com.store.service;

import com.store.vo.Customer;
import com.store.vo.Product;

/*
 * �ش� Store���� �������� ��ǰ���� �ٷ�� ��ɵ鸸�� ��Ƴ��� ���� Ŭ����
 */
public class OutletStoreService {
	//1. � ������ ������ ��� ��ǰ���� �̸��� �ܼ�â���� ����ϴ� ���
	public void printAllProductName(Customer c, Product[ ] pros) {
		System.out.println("==========="+c.getCustName()+" ���� �����Ͻ� ��ǰ���Դϴ�==========");
		for(Product p : pros) 
			System.out.print(p.getModel()+" ");		
		System.out.println(" ");
		
	}
	
	//2. ���� Store�� ������ �����ϱ� ���� ��� ������ ������ �ַܼ� ���
	//ssn, name, address
	public void printAllCustomer(Customer[ ] custs) {
		System.out.println("\n=========�������� �����Դϴ�..===========");
		for(Customer c : custs) 
			System.out.println(c.getSsn()+", "+c.getCustName()+", "+c.getAddress());
		
	}
	
	//���⼭���� �ذ��غ���
	//3. Ư�� ������ ������ ��� ��ǰ�� ���Ϲ޾Ƽ� 
	// �� �߿��� 1������ �Ѵ� ��ǰ���� ������ ���.
	public Product[ ] getAllProduct(Customer c, Product[ ] pros) {
		System.out.println("������ 1���� �̻��� ���� ��ǰ�� �Դϴ�. ");
		System.out.println(c.getCustName()+" �Բ��� ������ �����Դϴ�");
		for(Product p : pros) {
			if(p.getPrice()>=10000) 
				System.out.print(p.getPrice()+" "+p.getModel()); 
			// ��������ؼ� ��ȿ�� �׸���  ù��° �迭�̳����°ǰ�? �ι�°�� ������ �Ϸ��� ����ؾ��ϴ°�?
			
			
		}
		return pros;
	}
	
	
	//4. Ư�������� ������ ������ ���� ������ ��ǰ�� �ݾ��� �����ϴ� ���
	public int getMaxPriceProduct(Customer c, Product[ ] pros) {
		int maxPrice = pros[0].getPrice();
		System.out.println("\n========= �������� ������ ��ǰ�� �ְ��� ��ǰ�Դϴ� ====");
		for(Product p : pros) 
			maxPrice = p.getPrice();
		
		return maxPrice;
	}
	
	
}














