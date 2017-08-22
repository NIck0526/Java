package step4.test;
/*
 * 6 ::
 * 
 */
class Car{
	int serialNumber = 0;// =0 하나 안하나 초기화 0임.
	static int counter;
	
	Car() {
		counter++;
		serialNumber = counter;
	}
	
	
}
public class StaticExamTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("============ non-static Variable ==================");
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println("============ static Variable ==================");
		System.out.println(c1.counter); //3
		System.out.println(c2.counter); //3
		System.out.println(c3.counter); //3
		System.out.println("현재까지 생산된 총 차량의 수 :: "+Car.counter);
		
		
	}

}
