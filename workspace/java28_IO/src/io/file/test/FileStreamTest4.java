package io.file.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * ���� ����Ÿ�� �а� ����ϴµ� �־ 
 * Byte�迭 ��Ʈ�� | Character �迭 ��Ʈ��
 */
public class FileStreamTest4 {

	public static void main(String[] args) throws IOException {
		String fileName = "src\\hello.txt";
		
		FileInputStream fis = new FileInputStream(fileName);
		System.out.println("========Byte Input �⺻ Stream========");
		
		//byte������ �о���϶� ������ ���� -1�� ǥ���Ѵ�. (null�̾ƴ�)
		int data = 0;
		while((data = fis.read())!=-1) {
		/*	System.out.println(data);
			System.out.println((char)data);*/
			}
		//
		FileReader fr = new FileReader(fileName);
		System.out.println("=========Character Input �⺻ Stream============");
			while((data = fr.read())!=-1) {
			System.out.println((char)data);
		}
		
	}

}