package car.vo;

public class CarVO {
	private String model;
	private int price;
	private String location;
	private boolean airCon;
	
	public CarVO(String model, int price, String location, boolean airCon) {
		super();
		this.model = model;
		this.price = price;
		this.location = location;
		this.airCon = airCon;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAirCon() {
		return airCon;
	}
	public void setAirCon(boolean airCon) {
		this.airCon = airCon;
	}
	
	public String getCarInfo(CarVO vo){
		return "모델명("+model+"),"+"차량가격("+price+"),"+"차량위치("+location+")";
	}

}
