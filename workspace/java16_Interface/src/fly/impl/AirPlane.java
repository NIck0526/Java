package fly.impl;

import fly.Flyer;

//sub class... �ݵ�� ��������� å���� �ִ�.
public class AirPlane implements Flyer {
	
	
	
	
	@Override
	public String fly() {
		return "����� ����.";
		
	}

	@Override
	public void take_off() {
		System.out.println("����� �̷��Ѵ�.");
		
	}

	@Override
	public void land() {
		System.out.println("����� �����Ѵ�.");
		
	}


}
