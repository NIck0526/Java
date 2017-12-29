package object.step4.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersonObjectInputTest {

	public static void main(String[] args) throws Exception {
		String fileName="c:\\objFile\\person.obj";
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("1. Stream ����....");
		
		Person returnP =(Person)ois.readObject();
		System.out.println("2. readObject() call....");
		
		System.out.println("3. Person�� ������ ����մϴ�..");
		System.out.println(returnP);
		
	}

}
