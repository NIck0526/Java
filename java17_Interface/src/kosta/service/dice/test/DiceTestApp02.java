package kosta.service.dice.test;

import kosta.service.dice.impl.DiceAImpl;
import kosta.service.dice.impl.DiceBImpl;
import kosta.service.dice.impl.DiceCImpl;
import kosta.service.dice.play.Player01;
import kosta.service.dice.play.Player02;

public class DiceTestApp02 {

	public static void main(String[] args) {

		Player02 player01 = new Player02(new DiceAImpl());
		player01.playDice(3);
		System.out.println("+================================");
		System.out.println("선택된 주사위 총 합 :: "+player01.getTotalValue());
		
		Player02 player02 = new Player02(new DiceBImpl());
		player02.playDice(3);
		System.out.println("+================================");
		System.out.println("선택된 주사위 총 합 :: "+player02.getTotalValue());
		
		Player02 player03 = new Player02(new DiceCImpl());
		player03.playDice(3);
		System.out.println("+================================");
		System.out.println("선택된 주사위 총 합 :: "+player03.getTotalValue());
		
		
		
		

	}

}
