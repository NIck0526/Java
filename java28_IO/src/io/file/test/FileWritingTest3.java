package io.file.test;
/*
 * PrintWriter를 Node계열로
 * 이때 프로그램이 어떻게 달라지는지 직접 확인하기
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class FileWritingTest3 {

	public static void main(String[] args)throws IOException {
		//1.
		String inputFile = "src\\poem.txt";
		String outputFile = "src\\result.txt";
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		PrintWriter pw = new PrintWriter(outputFile);
		System.out.println("result.txt 파일이 생성되었다..");
		System.out.println("파일을 열어서 출력하시오.");
		//2.
		String line = null;
		while((line = br.readLine())!=null) {
		//System.out.println(line);
			pw.println(line);
		}
		/*br.close();
		pw.close();*/
		//즉각적으로 capacity에 들어있는 데이타를 뿌리게....
		//pw.flush();//auto flushing기능
		pw.close();
		 //Node계열 이어쓰기 (기본스트림)
	}

}
