package car.test;



import java.util.Scanner;

import car.service.CarService;
import car.vo.CarVO;
import car.vo.CustomerVO;

public class CarTest {
	public static void main(String[] args) {
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		int index = 0;
		CustomerVO[] cus= new CustomerVO[10];
		String keepGoing="";
		while(true){
			System.out.print("\n고객 추가 하시겠습니까 ? (Y/N) :  "); 
			keepGoing = scanner.nextLine();

			if( keepGoing.toLowerCase().equals("y") ){
				count++;
				System.out.println("이름을 입력해주세요");
				String name=scanner.nextLine();
				

				System.out.println("주소를 입력해주세요");
				String location=scanner.nextLine();
				

				System.out.println("전화번호를 입력해주세요");
				int tel=scanner.nextInt();
				

				System.out.println("대여일을 입력해주세요");
				int lentDate=scanner.nextInt();
				

				System.out.println("반환일을 입력해주세요");
				int returnDate=scanner.nextInt();

				cus[index] =new CustomerVO(name, tel, location, 1000, null, lentDate, returnDate);
				index++;
				keepGoing = "";
				scanner.nextLine();
			} else break;

		}

		System.out.println("종료되었습니다.");





		CarVO[] car = {
				new CarVO("avante", 3000, "seoul", false),
				new CarVO("i30", 3500, "daegu", true),
				new CarVO("sonata", 4000, "busan", true),
				new CarVO("granduer", 5000, "busan", true),	
				new CarVO("genesis", 6000, "seoul", true),	
				new CarVO("equs", 7000, "ulsan", true),
				new CarVO("eq900", 10000, "incheon", false),	
				new CarVO("g80 Sport", 8000, "pankyo", true)

		};

		CarService service =new CarService();
		//count ++;
		System.out.println("Total Customer : " + count);
		for(int i = 0; i < count; i++){
			System.out.println(i + ". " + cus[i].getName());
		}

		for(int i = 0; i < count; i++){
			System.out.print("고객 선택 : ");
			int temp = scanner.nextInt();
			System.out.println("===" + cus[temp].getName() + " 고객님의 정보 ===" );

			service.totalRentDay(cus[temp]);
			service.printAbleCar(car, cus[temp]);
			service.printMinPriceCar(car);
			service.printPoint(cus[temp]);
			service.printInfoCar(car[0]);
		}

	}

}
