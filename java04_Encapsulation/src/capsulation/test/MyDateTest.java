package capsulation.test;

import java.util.Scanner;

/*
 * Encapsulation pattern
 * ::
 * 1. field 앞 --> private
 *    (같은 클래스 내에서만 접근을 허용하는 Access Modifier)
 * 2. setXxx() | getXxx() --> public
 *    (어디서든지 접근을 허용하는 Access Modifier)
 * 3. setXxx() { 첫 라인에서 즉, 필드에 값이 할당되기 직전에
 *    제어문을 사용해서 타당한 값만 필드에 할당
 */
class MyDate {
	private int month; //보호하기 위해서 private를 사용
	private int day;
	

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month <= 12){
		this.month = month;// 필드 초기화.  필드 초기화 직전에 검색대(걸러내기위해)를 설치하기 위해서 조건문을 그 앞에넣음.
	    } else {
			System.out.println(" 월은 1~12까지만 있습니다. ");
			System.exit(0); //다시 테스트로 가지 못하고 여기서 끝내게 만듬
			//(0)은 끝나면 정상종료 | -1 비정상종료
		  }
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		switch(month) {
		case 2:
			if(day>=1 && day<=28) {
				this.day = day; //위 조건문에 맞는 값은 통과한다는 뜻
			}else { //이쪽은 조건문 안맞으면 이쪽으로옴
				System.out.println("2월에 타당한 날짜가 아닙니다..");
				System.exit(0);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>=1 && day<=30) {
				this.day = day; //위 조건문에 맞는 값은 통과한다는 뜻
			}else { //이쪽은 조건문 안맞으면 이쪽으로옴
				System.out.println("월에 타당한 날짜가 아닙니다..");
				System.exit(0);
			}
			break;
		default:
			if(day>=1 && day<=31) {
				this.day = day; //위 조건문에 맞는 값은 통과한다는 뜻
		}else { //이쪽은 조건문 안맞으면 이쪽으로옴
			System.out.println("월에 타당한 날짜가 아닙니다..");
			System.exit(0);
	     	}
		}//switch 끝
		
		/*
		 * 1,3,5,7,8,10,12 일떈 1~31
		 * 4,6,9,11 : 1~30
		 * 2 : 1~28
		 * ::
		 */
		
		this.day = day;
	}

}
public class MyDateTest{
	public static void main(String[] args) {
		
		MyDate today = new MyDate(); // 식구 6명 (필드 2+메소드 4) 다 메모리 올라감
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 콘솔창으로 입력하세요...\n");
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		today.setMonth(month);//call month를 괄호안에 넣는 이유 - 숫자를 넣으면 그 숫자만 입력되기때문에
		today.setDay(day);
		
		//if(today.getMonth()!=0 && today.getDay()!=0{}은 null or 0 이된것을 알고 출력이 안되게 하는법
		
		System.out.println("오늘은 "+today.getMonth()+" 월 "+today.getDay()+" 일 입니다.");
				
		//1. MyDate 객체를 생성... today라는 이름으로
		//2. Scanner를 이용해서 month, day값을 받아온다
		//3. 받아온 날짜를 최종적으로 출력
		System.out.println(today);
	}
	
}
