package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExceptionTest2 {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		String fileName = "c:\\kosta\\test\\poem.txt";
		
			FileReader fr = new FileReader(fileName);
			
			fr.read();
			System.out.println("������ �о�鿴���ϴ�..");

	}
}
/*
 * 				IOException
 *                   |
 *          FileNotFoundException
 */







