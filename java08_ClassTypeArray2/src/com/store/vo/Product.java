package com.store.vo;

import com.store.util.MyDate;

/*
 * ������ �԰�Ǵ� ��ǰ�� ���� ������ ��� �ִ� voŬ����
 * ::
 * maker : String
 * model : String
 * serialNo : int
 * price : int
 * startDate : MyDate
 * 
 */
public class Product {
	private int serialNo;
	private String maker;
	private String model;
	private int price;
	private MyDate startDate;
	public Product(int serialNo, String maker, String model, int price, MyDate startDate) {
		super();
		this.serialNo = serialNo;
		this.maker = maker;
		this.model = model;
		this.price = price;
		this.startDate = startDate;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public String getMaker() {
		return maker;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public MyDate getStartDate() {
		return startDate;
	}

}













