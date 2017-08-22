package kosta.service.dice.play;

import kosta.service.dice.Dice;

public class Player02 {

	private int totalValue;
	private Dice dice;
	
	public Player02(Dice dice) {
		this.dice = dice;
		System.out.println("::"+getClass().getName()+"( )생성자 호출...");
	}
	
	//getter() | setter() 도 필드의 갯수와 맞추어서 추가
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	
	public int getTotalValue() {
		return totalValue;
	}

	//count 만큼 주사위를 굴려서 나오는 랜덤한 숫자를 합하는 기능.
	public void playDice(int count) {
		System.out.println("::"+getClass().getName()+".playDice() is calling....");
		
		for(int i=0; i<count; i++) {
			dice.selectedNumber();//
			System.out.println("::["+dice.getClass().getName()+" ]의 선택된 수 :: "+dice.getValue());
			totalValue += dice.getValue();
		}//for
		System.out.println("::"+getClass().getName()+".playDice() was called...");
	}	
}//class










