
package com.store.vo;
/*
 * 상품을 구입하는 고객에 대한 정보를 담는  vo 클래스
 * ::
 * ssn : int
 * name : String
 * address : String
 * -------------------
 * product : Product
 */

/*
 * ssn, custName, address는 생성자로 주입
 * Product[ ] 은 setter로 주입
 * address는 setter주입을 하나 더 추가
 * 모든 필드에 대한 getter를 정의한다.
 */
public class Customer {
	private int ssn;
	private String custName;
	private String address; // setter로 주입 생성자로하면 이사갈수도있는 변동을 잡지 못함
	
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

