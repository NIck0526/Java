package fly.impl;

import fly.Flyer;

//sub class... �ݵ�� ��������� å���� �ִ�.
public class SuperMan implements Flyer {
	
	
	
	
	@Override
	public String fly() {
		return "���۸� ����.";
		
	}

	@Override
	public void take_off() {
		System.out.println("���۸� �̷��Ѵ�.");
		
	}

	@Override
	public void land() {
		System.out.println("���۸� �����Ѵ�.");
		
	}
	//Super man���� ���
	public String stopBullet() {
		return "�Ѿ� ����.";
	}

}