package io.file.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileStreamTest5 {
	//1바이트로 받은 한글을
	//1바이트 ->>>> 스트림->>>> 2바이트로 변형
	//안깨지게 불러와보자!!

	public static void main(String[] args) throws IOException {
		String fileName = "src\\hello.txt";
		String fileName2 = "src\\hello2.txt";
		FileInputStream fis = new FileInputStream(fileName); // 기본
		DataInputStream dis = new DataInputStream(fis); // 보조 (있어도 없어도 ok)
		
		FileOutputStream fos = new FileOutputStream(fileName2);
		DataOutputStream dos = new DataOutputStream(fos);
		
		System.out.println("========Byte Input 기본 Stream========");
		
		//byte단위로 읽어들일때 파일의 끝은 -1로 표시한다. (null이아님)
		int data = 0;
		while((data = dis.read())!=-1) {
			
			dos.write(data);
		}//
		
		
		/*	System.out.println(data);
			System.out.println((char)data);*/
			}
		
		
		
		//
		
		
		
		/*FileReader fr = new FileReader(fileName);
		System.out.println("=========Character Input 기본 Stream============");
			while((data = fr.read())!=-1) {
			System.out.println((char)data);
		}*/
		
	

}
