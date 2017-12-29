package conditionswitch.test;

public class SwitchNoBreakTest2 {
	public static void main(String args[]) {
		//time :: 8~11
		
		int dice = (int)(Math.random()*6)+1;
		int time = (int)(Math.random()*4)+8;//random은 double이라 (int)캐스팅을 해줌
		System.out.println("[현재시각 :: "+time+" 시 !!");
		System.out.println("주사위 숫자 :: "+dice);
		switch(time) {
		case 8:
			System.out.println("출근 합니다...");
		case 9:
			System.out.println("근무 시작합니다...");
		case 10:
			System.out.println("오전회의 시작합니다...");
		case 11:
			System.out.println("외근 나갑니다...");
		}
			
	}

}
