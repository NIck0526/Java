package io.file.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileStreamTest5 {
	//1����Ʈ�� ���� �ѱ���
	//1����Ʈ ->>>> ��Ʈ��->>>> 2����Ʈ�� ����
	//�ȱ����� �ҷ��ͺ���!!

	public static void main(String[] args) throws IOException {
		String fileName = "src\\hello.txt";
		String fileName2 = "src\\hello2.txt";
		FileInputStream fis = new FileInputStream(fileName); // �⺻
		DataInputStream dis = new DataInputStream(fis); // ���� (�־ ��� ok)
		
		FileOutputStream fos = new FileOutputStream(fileName2);
		DataOutputStream dos = new DataOutputStream(fos);
		
		System.out.println("========Byte Input �⺻ Stream========");
		
		//byte������ �о���϶� ������ ���� -1�� ǥ���Ѵ�. (null�̾ƴ�)
		int data = 0;
		while((data = dis.read())!=-1) {
			
			dos.write(data);
		}//
		
		
		/*	System.out.println(data);
			System.out.println((char)data);*/
			}
		
		
		
		//
		
		
		
		/*FileReader fr = new FileReader(fileName);
		System.out.println("=========Character Input �⺻ Stream============");
			while((data = fr.read())!=-1) {
			System.out.println((char)data);
		}*/
		
	

}