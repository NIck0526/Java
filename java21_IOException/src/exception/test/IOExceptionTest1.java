package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExceptionTest2 {
	public static void main(String[] args) {
		String FileName = "c:\\kosta\\test\\poem.text"; //file 경로도 file이 된다. 즉, 디렉토리+파일정보
		try {
			FileReader fr = new FileReader(FileName);
			
			fr.read();
			System.out.println("파일 읽어줌.");
		}/*catch(FileNotFoundException e) {
			
		}*/catch(IOException e) {
			
		}

	}

}



/*
 * 								IOException
 * 									 |
 * 							FileNotFoundException
 * 
 */




