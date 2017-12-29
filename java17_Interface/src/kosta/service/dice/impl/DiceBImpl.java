package kosta.service.dice.impl;

import java.util.Random;

import kosta.service.dice.Dice;

public class DiceBImpl implements Dice{
	private int value;	
	
	public DiceBImpl() {
		System.out.println("::"+getClass().getName()+"( ) ������ calling..");
	}
	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6)+1; //1~6������ ������		
	}
	@Override
	public int getValue() {
		return value;
	}

}
