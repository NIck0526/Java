package ch11_30;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String []args) {
		HashMap map = new HashMap();
		map.put("lee26", "1234");
		map.put("mika0526","12345");
		map.put("lee26", "12345"); // 왜 뒤에것이 온거지?
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 비번을 입력해주세요");
			System.out.println("I D : ");
			String id = sc.nextLine().trim();
			
			System.out.println("비 밀 번 호 : ");
			String password = sc.nextLine()	.trim();
			System.out.println();
			
			
			if(!map.containsKey(id)) {
				System.out.println("입력 하신 I D는 존재하지 않아용~"+"\n 다시 입력해줘용~");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치 하지 않아! 다시 입력해");
				}else {
					System.out.println(" 로그인 되었습니다.");
					break;
				}//last else
			}//else
			
		}//while
	}

}
