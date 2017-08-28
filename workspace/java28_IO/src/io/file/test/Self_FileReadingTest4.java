package io.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Self_FileReadingTest4 {
	public static void main(String[] args) throws IOException{
		String in = "src/result.txt";
		String out = "src/comebackhome.txt";
		BufferedReader br = new BufferedReader(new FileReader(in));
		PrintWriter pw = new PrintWriter(new FileWriter(out),true);
		
		//
		
		String sss = null;
		while((sss=br.readLine())!=null) {
			pw.println(sss);
		}
		
		
		
	}
		

}
