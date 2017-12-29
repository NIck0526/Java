
package com.store.vo;
/*
 * ��ǰ�� �����ϴ� ���� ���� ������ ���  vo Ŭ����
 * ::
 * ssn : int
 * name : String
 * address : String
 * -------------------
 * product : Product
 */

/*
 * ssn, custName, address�� �����ڷ� ����
 * Product[ ] �� setter�� ����
 * address�� setter������ �ϳ� �� �߰�
 * ��� �ʵ忡 ���� getter�� �����Ѵ�.
 */
public class Customer {
	private int ssn;
	private String custName;
	private String address; // setter�� ���� �����ڷ��ϸ� �̻簥�����ִ� ������ ���� ����
	
	private Product[] products;

	public Customer(int ssn, String custName, String address) {
		super();
		this.ssn = ssn;
		this.custName = custName;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void changeAddress(String address) {//setter()
		this.address = address;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getSsn() {
		return ssn;
	}

	public String getCustName() {
		return custName;
	}
	



}

