package kosta.service.dice.play;

import kosta.service.dice.DiceA;

public class Player01 {
	private DiceA diceA = new DiceA();
	/*
	 * private DiceA diceA = new DiceA();
	 * private DiceB diceB = new DiceB();
	 * private DiceC diceA = new DiceC();
	 * ::
	 * �ʵ尡 �߰� �ɶ����� 
	 * Player01 �� DiceA�� ������ ��� �ֱ⋚���� 
	 * A,B,C�� �Բ� �Ϸ��� �̷��� �� �߰� ������� �������͵鵵......
	 * 
	 * ::
	 * ������
	 * :: 
	 * Player01�� �ϳ��� �ֻ����� ������ �� �� �ִ� �ڵ�� �ۼ�
	 * DiceB, DiceC�� �߰��ϰ� �Ǹ�
	 * �׿� �¹����� setter/getter�� ���ÿ� �����ϹǷ�
	 * ���뼺�� ����Ʈ���� ������ �˴ϴ�.
	 * 
	 * �ذ�å::
	 *  
	 * 	 
	 */
	
	
	private int totalValue;
	public Player01() {
		System.out.println(" :: "+getClass().getName()+"( ) ������ȣ��...");
	}
	
	//getter() | setter() �ʵ尡 �߰��ɶ����� �ʵ��� ������ ���߾ �߰��ؾ���
	
	
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
	
	
	//count ��ŭ �ֻ����� ������ ������ ������ ���ڸ� ���ϴ� ���
	public void playDice(int count) {
		System.out.println(":: "+getClass().getName()+".playDice() is calling...");
		
		for(int i=0; i<count; i++) {
			diceA.selectedNumber();//
			System.out.println(":: ["+diceA.getClass().getName()+"] �� ���õ� ��"+diceA.getValue());
			totalValue += diceA.getValue();
		}//for
		System.out.println(":: "+getClass().getName()+".playDice() was calling...");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * ���� �Ѱ�
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
