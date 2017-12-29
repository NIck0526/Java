package looping.self.test;

public class BreakTotal100Test {
	public static void main(String[] args) {
		
		System.out.println(" 양을 1 마리부터 100마리 까지 세어 봅시다.");
		int ship = 0;
		int sum = 0;//합산을 구할때는 이 (하나의 또 다른)변수가 필요하다.
		while(true) {
			ship++;
			System.out.println(ship+" 마리 매에에에에에에에엠 ");
			sum +=ship;
			if(sum>100)break;
		}
		System.out.println("매매매매매매매매맴ㅁ매매맴매맴매애맴 \n 매매매매매매매매맴ㅁ매매맴매맴매애맴"
				+ "\n 시끄러워서 일어났다!!!?");//합을 가져오는일
		
		System.out.println("합산한 값 ::"+sum);
	}
}






/*
 * while문 이용
 * 무한루핑을 돌면서 1씩 증가된다...
 * 증가된 값을 계속 합산해 나가는데...합산한 값이100을 넘어설때 반복문을 빠져나오도록 로직을 작성
 * 최종적으로 그때의 합산된 값을 출력.
 */










