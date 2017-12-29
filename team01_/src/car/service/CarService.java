package car.service;

import car.vo.CarVO;
import car.vo.CustomerVO;

public class CarService {

	public void totalRentDay(CustomerVO cus){
		int result=cus.getReturnDate()-cus.getLentDate();
		System.out.println("�ѷ�Ʈ�ϼ�:"+result+"��");
	}


	public void printAbleCar(CarVO[] car, CustomerVO cus){

		for(CarVO c: car){

			if(c.getLocation().equals(cus.getAddress())){
				System.out.println("��Ʈ��������:"+c.getModel()+"���� ��Ʈ�����մϴ�");
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
		System.out.println("������ �𵨸�:"+model+" "+"��ó��:"+min+"���Դϴ�.");

	}

	public void printPoint(CustomerVO cus){
		System.out.println(cus.getName()+"���� ���� ����Ʈ��"+" "+cus.getPoint()+"���Դϴ�.");

	}

	public void printInfoCar(CarVO car){
		System.out.println("����������ȸ:"+car.getCarInfo(car));
	}

}
