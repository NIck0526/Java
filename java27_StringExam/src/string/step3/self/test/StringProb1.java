package string.step3.self.test;

import java.util.StringTokenizer;

/*
 * 출력결과가
 * JDBC
 * JSP
 * EJB
 */
public class StringProb1 {
	public static void main(String[] args) {
		System.out.println(makeInitial("Java Data Base Conectivity"));
		System.out.println(makeInitial("Java Server Pages"));
		System.out.println(makeInitial("Enterprise Java Beans"));
		
		
		
	}

	private static String makeInitial(String fullName) {
		String[] Arr = fullName.split(" ");
		String result= "";
//		for(int i =0; i<Arr.length; i++) {
//			result += Arr[i].substring(0,1);
//			
//		}
		for(String ss : Arr) {
			result += ss.substring(0, 1);
		}
		
		return result;
		}
}

