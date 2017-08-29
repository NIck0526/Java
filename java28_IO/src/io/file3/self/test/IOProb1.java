package io.file3.self.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


//src/data/score.txt를 참조...
//문제2.docx를 참조
public class IOProb1{
	public static void main(String[] args)throws Exception{
		//구현하세여...
		String fileName = "src/data/score.txt";
		String outFileName = "src/data/score.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		PrintWriter bw = new PrintWriter(new FileWriter(outFileName,true));
		
		String line = null;
		ArrayList<Integer> scores = new ArrayList<Integer>();
		while((line = br.readLine())!= null) {
			String[ ] temp = line.split(":");
			scores.add(Integer.parseInt(temp[1])); //질문
						
		}
		
		int total = 0;
		for(int i : scores) {
			total += i;
		}
		bw.println();
		bw.println(total);
		bw.print(total/scores.size());
		bw.close();
			
		
		}
		


	}
