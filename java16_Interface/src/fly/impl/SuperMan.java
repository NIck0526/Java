package fly.impl;

import fly.Flyer;

//sub class... 반드시 오버라딩의 책임이 있다.
public class SuperMan implements Flyer {
	
	
	
	
	@Override
	public String fly() {
		return "수퍼맨 난다.";
		
	}

	@Override
	public void take_off() {
		System.out.println("수퍼맨 이륙한다.");
		
	}

	@Override
	public void land() {
		System.out.println("수퍼맨 착륙한다.");
		
	}
	//Super man만의 기능
	public String stopBullet() {
		return "총알 따윈.";
	}

}
