package looping.self.test;

public class BreakDrinkTest {
	public static void main(String[] args) {
		
		int beer = 0;
		System.out.println("맥주집에왔습니다");
		for(beer=0; beer<=50;beer++) {
		    System.out.println(beer+" 잔 마셨습니다...\n 벌컥 벌컥");
			if(beer==10)
				break;
			
		}//for
		
		System.out.println(" YOU ARE DIED BY YOUR WIFE......");
		
	}//main
}//class


/*
 * for문의 지역변수를 beer로 하나 선언한다.
 * 맥주는 50잔까지 무한 반복으로 마실수 있다...
 * 그런데 치사량은 맥주 10잔이다...
 * 맥주 10잔을 마셨을때 break를 사용해서 반복문을 빠져나온다.
 * 집으로 간다(메세지 출력)..
 */










