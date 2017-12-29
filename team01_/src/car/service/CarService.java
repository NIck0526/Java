package car.service;

import car.vo.CarVO;
import car.vo.CustomerVO;

public class CarService {

	public void totalRentDay(CustomerVO cus){
		int result=cus.getReturnDate()-cus.getLentDate();
		System.out.println("총렌트일수:"+result+"일");
	}


	public void printAbleCar(CarVO[] car, CustomerVO cus){

		for(CarVO c: car){

			if(c.getLocation().equals(cus.getAddress())){
				System.out.println("렌트가능차량:"+c.getModel()+"차량 렌트가능합니다");
			}

		}
	}

	public void printMinPriceCar(CarVO[] car){
		int min =car[0].getPrice();
		String model = car[0].getModel();

		for(int i=1;i<car.length;i++){

			if(car[i].getPrice()<min){

				min=car[i].getPrice();
				model=new String(car[i].getModel());
			}



		}
		System.out.println("최저가 모델명:"+model+" "+"최처가:"+min+"원입니다.");

	}

	public void printPoint(CustomerVO cus){
		System.out.println(cus.getName()+"님의 현재 포인트는"+" "+cus.getPoint()+"원입니다.");

	}

	public void printInfoCar(CarVO car){
		System.out.println("차량정보조회:"+car.getCarInfo(car));
	}

}
