package com.store.test;

import com.store.service.OutletStoreService;
import com.store.util.MyDate;
import com.store.vo.Customer;
import com.store.vo.Product;

/*
 * Scanner ��ü�� ����������� ���� ������ �Է¹����� ���� ������
 * �ϴ� Product, Customer ��ü�� �����ϰ� 
 * Ư�� Customer�� Product���� ���Թ޴� ��Ȳ�� ���⼭ ����� ����
 * ����ǵ��� �Ѵ�.
 */
public class OutletStoreServiceTest {
	public static void main(String[] args) {
		//1. ���� 2���� ����...Store ���� ������ �����ϴ� ��...
		Customer[ ] custs = {
				new Customer(111, "��ȿ��", "�ֿ���"),
				new Customer(222, "�̻��", "�ֿ���")
		};
		
		//2. ��ǰ���� ����...
		Product[ ] pros1 = {
				new Product(123, "CJ", "�˶��", 1200, new MyDate(2016, 4, 5)),
				new Product(900, "����", "������ġ", 3300, new MyDate(2017, 7, 12)),
				new Product(778, "����", "������", 4500, new MyDate(2017, 8, 5)),
				new Product(345, "CJ", "���ƿ伤Ǫ", 11000, new MyDate(2017, 1, 5)),
				new Product(777, "���", "������ ��Ź��", 700000, new MyDate(2017, 1, 15))
		};
		Product[ ] pros2 = {
				new Product(1888, "�ƽ�", "�Ƹ޸�ī��", 7000, new MyDate(2017, 4, 5)),
				new Product(674, "û����", "������", 12000, new MyDate(2017, 6, 8))
				
		};
		
		//���⼭����
		//3. Service ��ü ����
		OutletStoreService service = new OutletStoreService();
		service.printAllProductName(custs[0], pros1);
		service.printAllCustomer(custs);
		service.getAllProduct(custs[0], pros1);
		int max=service.getMaxPriceProduct(custs[0], pros1);
		System.out.println(custs[0].getCustName()+" �Բ��� ������ ��ǰ�� �ְ� �ݾ��� "+max+"���Դϴ�.");
		
		

	}
}































