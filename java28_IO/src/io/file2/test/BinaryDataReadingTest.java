package io.file2.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * DataOutStream은 데이타 변환
 * byte 계열을 character계열로 변환
 * 
 * DataInputStream::
 * 바이너리 데이타를 읽어서 (readInt())자바 기본형으로(int) 변환한다.
 * wrapping(겹쳐진) 되어진 buffering공간에서 가능하다.
 * 이러한 데이타 조작부분은 보조 계열 스트림에서 가능.
 * 
 */
public class BinaryDataReadingTest {

	public static void main(String[] args)  {
		String fileName = "src/io/file2/test/watermelon.png";
		String outFileName = "src/io/file2/test/melon.png";	
		try {
		
		//1.스트림 생성(4개)
		DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
	
		
		DataOutputStream dos = new DataOutputStream (new FileOutputStream(outFileName));
		
		System.out.println("DataInputStream Creating....");
		System.out.println("DataOutputStream Creating....");
		
		//2.읽어들인다. readInt()-1
		
		int data = 0;
		while((data=dis.readInt())!= -1) {
			//3.outFileName으로 출력 WriteInt()
			dos.writeInt(data);
			
		}
			
		dos.close();
		}catch(EOFException e) { // Exception 은 부모가 젤
			
		}catch(Exception e) {
			
		}
	}

}
