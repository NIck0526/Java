package io.file2.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * DataOutStream�� ����Ÿ ��ȯ
 * byte �迭�� character�迭�� ��ȯ
 * 
 * DataInputStream::
 * ���̳ʸ� ����Ÿ�� �о (readInt())�ڹ� �⺻������(int) ��ȯ�Ѵ�.
 * wrapping(������) �Ǿ��� buffering�������� �����ϴ�.
 * �̷��� ����Ÿ ���ۺκ��� ���� �迭 ��Ʈ������ ����.
 * 
 */
public class BinaryDataReadingTest {

	public static void main(String[] args)  {
		String fileName = "src/io/file2/test/watermelon.png";
		String outFileName = "src/io/file2/test/melon.png";	
		try {
		
		//1.��Ʈ�� ����(4��)
		DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
	
		
		DataOutputStream dos = new DataOutputStream (new FileOutputStream(outFileName));
		
		System.out.println("DataInputStream Creating....");
		System.out.println("DataOutputStream Creating....");
		
		//2.�о���δ�. readInt()-1
		
		int data = 0;
		while((data=dis.readInt())!= -1) {
			//3.outFileName���� ��� WriteInt()
			dos.writeInt(data);
			
		}
			
		dos.close();
		}catch(EOFException e) { // Exception �� �θ� ��
			
		}catch(Exception e) {
			
		}
	}

}