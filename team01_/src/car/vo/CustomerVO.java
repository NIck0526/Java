package car.vo;

public class CustomerVO {
	
	private String name;
	private int tel;
	private String address;
	private int point;
	private CarVO[] car;
	private int lentDate;
	private int returnDate;
	
	public CustomerVO(String name, int tel, String address, int point, CarVO[] car, int lentDate, int returnDate) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.point = point;
		this.car = car;
		this.lentDate = lentDate;
		this.returnDate = returnDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public CarVO[] getCar() {
		return car;
	}
	public void setCar(CarVO[] car) {
		this.car = car;
	}
	public int getLentDate() {
		return lentDate;
	}
	public void setLentDate(int lentDate) {
		this.lentDate = lentDate;
	}
	public int getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
	}
	
	

}
