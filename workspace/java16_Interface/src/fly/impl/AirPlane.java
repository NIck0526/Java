package fly.impl;

import fly.Flyer;

//sub class... 반드시 오버라딩의 책임이 있다.
public class AirPlane implements Flyer {
	
	
	
	
	@Override
	public String fly() {
		return "비행기 난다.";
		
	}

	@Override
	public void take_off() {
		System.out.println("비행기 이륙한다.");
		
	}

	@Override
	public void land() {
		System.out.println("비행기 착륙한다.");
		
	}


}
