package kosta.service.dice;

import java.util.Random;

public class DiceA {
	private int value;

	public DiceA() {
		System.out.println(":: "+getClass().getName()+"( ) 생성자 호출..");
	}

	//getValue | setValue

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void selectedNumber() {
		value = new Random().nextInt(6)+1; //1~6사이의 정수가
	}
}
		
		
		
		
		
	/*value[] = new value[3];
	for(int i=0; i<value.length; i++) {
		randomIndex = (int)(Math.random()*7);
		value[i] = randomIndex;
		
		} return value[i];
		
	}
	@Override
	public String toString() {
		return "DiceA [value=" + value + "]";
	}
	*/

	

