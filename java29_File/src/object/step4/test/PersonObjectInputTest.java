package object.step4.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersonObjectInputTest {

	public static void main(String[] args) throws Exception {
		String fileName="c:\\objFile\\person.obj";
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("1. Stream 생성....");
		
		Person returnP =(Person)ois.readObject();
		System.out.println("2. readObject() call....");
		
		System.out.println("3. Person의 정보를 출력합니다..");
		System.out.println(returnP);
		
	}

}
