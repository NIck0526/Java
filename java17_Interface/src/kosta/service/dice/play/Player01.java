package kosta.service.dice.play;

import kosta.service.dice.DiceA;

public class Player01 {
	private DiceA diceA = new DiceA();
	/*
	 * private DiceA diceA = new DiceA();
	 * private DiceB diceB = new DiceB();
	 * private DiceC diceA = new DiceC();
	 * ::
	 * 필드가 추가 될때마다 
	 * Player01 은 DiceA만 가지고 놀수 있기떄문에 
	 * A,B,C를 함께 하려면 이렇게 다 추가 해줘야함 나머지것들도......
	 * 
	 * ::
	 * 문제점
	 * :: 
	 * Player01은 하나의 주사위만 가지고 놀 수 있는 코드로 작성
	 * DiceB, DiceC를 추가하게 되면
	 * 그에 맞물려서 setter/getter가 동시에 증가하므로
	 * 재사용성을 떨어트리는 요인이 됩니다.
	 * 
	 * 해결책::
	 *  
	 * 	 
	 */
	
	
	private int totalValue;
	public Player01() {
		System.out.println(" :: "+getClass().getName()+"( ) 생성자호출...");
	}
	
	//getter() | setter() 필드가 추가될때마다 필드의 갯수와 맞추어서 추가해야함
	
	
	public DiceA getDiceA() {
		return diceA;
	}
	public void setDiceA(DiceA diceA) {
		this.diceA = diceA;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	
	//count 만큼 주사위를 굴려서 나오는 랜덤한 숫자를 합하는 기능
	public void playDice(int count) {
		System.out.println(":: "+getClass().getName()+".playDice() is calling...");
		
		for(int i=0; i<count; i++) {
			diceA.selectedNumber();//
			System.out.println(":: ["+diceA.getClass().getName()+"] 의 선택된 수"+diceA.getValue());
			totalValue += diceA.getValue();
		}//for
		System.out.println(":: "+getClass().getName()+".playDice() was calling...");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 내가 한것
	 * 
	 * 
	 * DiceA diceA; 
	int totalvaule;
	
	public DiceA getDiceA() {
		return diceA;
	}
	public void setDiceA(DiceA diceA) {
		this.diceA = diceA;
	}
	public int getTotalvaule() {
		return totalvaule;
	}
	public void setTotalvaule(int totalvaule) {
		this.totalvaule = totalvaule;
	}
	*/
	
	

}
