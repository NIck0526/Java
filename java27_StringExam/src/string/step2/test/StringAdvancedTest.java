package string.step2.test;

import java.util.HashSet;
import java.util.Scanner;

public class StringAdvancedTest {

	public static void main(String[] args) {
		String[] files = {
				"Begin Again.avi",
				"StringTest1.java",
				"August Rush.mp3",
				"루시.avi",
				"rt.jar"				
		};
		
		String stars = "박보영 박형식 아이유 박보영 클라라 아이유 전도연";
		StringService service = new StringService();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명이 출력되기를 원하는 확장자를 직접 입력하세요...\n");
		String extention = sc.nextLine();
		
		service.printFileName(files, extention);
		System.out.println(service.getUniqueStar(stars));
	}
	

}



class StringService{
	public void printFileName(String[] files, String extention) {
		/*
		 * 구현하세여...
		 * 1. files에 들어있는 파일 중에서 확장자가 입력된 것과 동일한(?)
		 * 것이 있다면 그에 해당하는 파일명을 춫력해야 한다.
		 * (이때 확장자는 제외하고 파일명만)
		 */
		for(String f : files) {
			if(f.endsWith(extention)) {
				System.out.println(f.replace("."+extention, ""));
			}
		}
		
		
	}//
	
	public HashSet<String> getUniqueStar(String stars){
		HashSet<String> set = new HashSet<String>();
		String[ ] starArr=stars.split(" ");
		for(String s : starArr) {
			set.add(s);
		}
		/*
		 * stars를 받아서 공백을 기준으로 자른다.
		 * 이때 중복되는 이름은 제외하고
		 * star들을 Set에 저장하고 Set을 리턴한다.
		 */
		return set;
	}
}


