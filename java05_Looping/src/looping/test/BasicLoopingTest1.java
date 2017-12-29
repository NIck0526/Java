package looping.test;

public class BasicLoopingTest1 {
	public static void main(String[] args) {
		//for 얼마나 반복 하는지 알때
		System.out.println("=======for looping=====");
		for(int i=0; i<10; i++) {//괄호 안에있는 i이라 for 혼자만의 것으로 다른 곳에서도 i사용 가능
			System.out.println(i+"Hellooo");
		
		}
		
		//while 얼마나 반복해야할지 모를떄
		System.out.println("======while looping=====");
		int i=10;//괄호 밖에 있는것이라 모두 같이 쓰는 i이어서 다른곳에는 못씀
		while(i>0) {
			System.out.println(i+"Helloooooo");
			i--;
		}
		
		//do~while : 반드시 한번은 실행된다.
		int j=0;
		do {
			System.out.println(j+" Always print....");
			j++;
		}while(j<10);
		
	}

}
