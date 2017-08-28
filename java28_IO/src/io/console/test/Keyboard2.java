package io.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드로 읽어들인 데이타를
 * 콘솔로 출력하는 소스코드의 패턴
 * 1. 스트림 생성(입력 스트림 2개)
 * 2. 읽어들인다. readLine()
 * 3. 콘솔창으로 출력(System.out.println())
 */
public class Keyboard2 {

	public static void main(String[] args) throws IOException{
		//1.
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("1. 스트림이 생성되었음...");
		System.out.println("2. 키보드로 데이타를 입력하세요...");
		
		//2.
		String line = br.readLine();
		while(line !=null) {
		//3.
		System.out.println("Reading Data :: " +line);
		line = br.readLine();
		}
				
	}

}
















