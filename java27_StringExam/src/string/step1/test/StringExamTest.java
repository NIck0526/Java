package string.step1.test;

import java.util.StringTokenizer;

/*
 *  String Class
 *  ::
 *  변하지 않는(immutable) 문자열 상수를 다루는 클래스
 *  스트링 클래스에서 제공하는 메소드를 이용해서 문자열이
 *  변경될 때마다 계속해서 문자열 객체가 생성됨.
 *  문자열이 생성 될 때마다 Heap에 객체가 계속 만들어지기 때문에
 *  문자열 조작, 변경이 빈번할 경우 String을 사용하면
 *  메모리 효율성을 떨어뜨리는 결과를 초래한다.
 *  ::
 *  StringBuffer 혹은(StringBuilder)사용을 권장.
 */
public class StringExamTest {

	public static void main(String[] args) {
		System.out.println("========length(), replace(), substring()==========");
		String str1="아이유     ";//5
		String str2="아이유 ";//1
		String str="아이유";//0
		System.out.println("1. str객체의 문자열 길이 : "+str.length());
		
		String str3 = str.replace('유','리');
		System.out.println("2. 아이유의 '유'--> '리'로 변경 : "+str);
		System.out.println("2. 아이유의 '유'-->'리'로 변경 : "+str3);

		//'이유'만 출력 되도록
		String str4 = str.substring(1,3);// 시작하는 인덱스포함 But, 끝나는 인덱스는 포함하지 않음!!!!!!!
		System.out.println("3. 이유만 출력 :: "+str4);
		
		System.out.println(str);//문자열 상수이기에 아무리 바꿔도 처음 그대로.
		
		System.out.println("========trim() :: (앞,뒤 공백만 제거, 중간은 x) 공백을 제거 =========");
		String s1 ="제임스고슬링";
		String s2 =" 제임스 고슬링";
		String s3 ="제임스 고슬링 ";
		if(s1.equals(s2))
			System.out.println("Same Data1??");
		if(s1.equals(s2.trim()))
			System.out.println("Same Data2..");
		if(s2.trim().equals(s3.trim()))//(앞,뒤 공백만 제거, 중간은 x)
			System.out.println("Same Data3..");
		
		
		
		System.out.println("==========s1.equals(s2)========");
		if(s1.equals(s2.replace(" ", "")))
			System.out.println("공백 제거!!!!!!!!!!");
		
		
		System.out.println("\n==== indexOf(), charAt()=====");
		System.out.println("\n==== s1에서 '고'에 해당하는 index를 리턴받아 출력 ::");
		int temp = s1.indexOf("고");
		System.out.println(temp);
		
		System.out.println("\n==== s1에서 index 3에 해당하는 char를 출력 ::");
		char c1 = s1.charAt(3);
		System.out.println(c1);
		
		/*
		 *  이번에는 공백을 기준으로 문자를 나누는 것이 아니라
		 *  , / 이런 것들을 기준으로 문자열을 나누는 방법을 알아야 한다.
		 */
		System.out.println("============ split() ============");
		String star = "아이유, 이효리, 김상순, 빅뱅, 아이유, 태양";
		
		String [] starArr = star.split(","); // , 를 기준으로 나열
		for(String s : starArr) {
			System.out.println(s);
		}
		
		System.out.println("\n=========== StringTokenizer ===========");
		StringTokenizer st = new StringTokenizer(star, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("\n============Self Test===========");
		String ss="돌고래 팬더 나무늘보 미어캣 톰슨카젤     코모도";
		/*
		 * split() - space를 모두 인식한다.
		 *  
		 * |
		 * 
		 *  StringTokenizer() - space를 아무리 많이줘도 하나로 인식.
		 */
		
		String [] ssArr = ss.split(" ");
		for(String sss : ssArr) {
			System.out.println("==Split=="+sss);
		}
		StringTokenizer sst = new StringTokenizer(ss);
		while(sst.hasMoreTokens()) {
			System.out.println("==StringTokenizer=="+sst.nextToken());
		}
		
		System.out.println(" ");
		System.out.println("=============starsWith(), endsWith()===========");
		String start ="오늘 점심 메뉴는 뭘로 하실 건가요?";
		System.out.println("startsWith() :: "+start.startsWith("점심"));
		System.out.println("startsWith():: "+start.startsWith("오늘 점심"));
		System.out.println("endsWith() :: "+start.endsWith("요?"));
		
		System.out.println(" ");
		System.out.println("============toUpperCase(), toLowerCase()===========");
		String lower = "james gosling";
		String upper = "JAMES GOSLING";
		
		System.out.println("JAMES GOSLING 으로 변경 :: "+lower.toUpperCase());
		System.out.println(lower.equalsIgnoreCase(upper));
		
	}

}
