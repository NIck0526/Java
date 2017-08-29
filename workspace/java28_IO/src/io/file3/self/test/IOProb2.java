/*
 * src/data/data.txt
 * 문제1.docx를 참조
 */
package io.file3.self.test;

import java.io.FileReader;
import java.io.LineNumberReader;

public class IOProb2 {
	public static void main(String[] args) throws Exception {
		String fileName = "src\\data\\data.txt";
		System.out.println("<< world 가 들어있는 라인 >>");
		searchWord(fileName, "world");
		System.out.println("<< you 가 들어있는 라인 >>");
		searchWord(fileName, "you");
	}

	private static void searchWord(String fileName, String searchKeyword) throws Exception{
		//구현하세여...
		
		LineNumberReader nlr = new LineNumberReader(new FileReader(fileName));
		
		String line = null;
		while((line=nlr.readLine())!=null) {
			if(line.contains(searchKeyword))
				System.out.println(nlr.getLineNumber()+"==Line"+ line);
			
		}
		
		



	}
}


/*if(line.contains(searchKeyword)){
	System.out.println
	(lnr.getLineNumber()+"-Line  " + line);				
}
line = lnr.readLine();*/