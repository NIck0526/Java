package reference.self;

public class ProductVOSelf {
	
	private String model;
	private String maker;
	private int price;
	private int serialNum;
	public ProductVOSelf(String model, String maker, int price, int serialNum) {
		super();
		this.model = model;
		this.maker = maker;
		this.price = price;
		this.serialNum = serialNum;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	
	

}
