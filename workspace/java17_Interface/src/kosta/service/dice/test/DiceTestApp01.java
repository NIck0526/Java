package kosta.service.dice.test;

import kosta.service.dice.play.Player01;

public class DiceTestApp01 {

	public static void main(String[] args) {

		Player01 player01 = new Player01();
		player01.playDice(3);
		System.out.println("+================================");
		System.out.println("���õ� �ֻ��� �� �� :: "+player01.getTotalValue());
		
		

	}

}