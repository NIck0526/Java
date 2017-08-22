package fly.test;

import fly.Flyer;
import fly.impl.AirPlane;
import fly.impl.Bird;
import fly.impl.Eagle;
import fly.impl.SuperMan;

public class FlyerAppTest {
	public static void main(String[] args) {
		Flyer f1 = new Bird();
		Flyer f2 = new SuperMan();
		Flyer f3 = new AirPlane();
		Bird f4 = new Eagle();
		//Virtual Method Invocation	
		f1.fly();
		f2.fly();
		f3.fly();
		System.out.println(f4.fly());
		if(f1 instanceof Bird) {
			Bird b = (Bird)f1;
			System.out.println(b.layEggs("����"));
			System.out.println(b.color);
		}
			
		
	}//main

}//class
