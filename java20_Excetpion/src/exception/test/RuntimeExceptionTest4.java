package exception.test;

public class RuntimeExceptionTest4 {

	public static void main(String[] args) {
		System.out.println("========NullPointerException========");
		String str = new String("KOSTA");
		//String str = "KOSTA"; 같은 것이여
		str = null;
		try {
		System.out.println("str 문자열의 길이 ::"+str.length());
		System.out.println("str 주소값 :: "+str.toString());//Overriding
		}catch(Exception e) {
			//System.out.println("잡았다!2"); 
			e.printStackTrace();                  //왜 문제가 생겼는지 출력해주는 것
			//System.out.println(e.getMessage()); 이건 잘 안씀 왜 오류가 낫는지 자세히 안 알려줌.
		}	
			
			// Exception이 부모여서 모든것을 잡았는데
		    //그 뒤 작은 단위인 Nullpointer가 와서 잡을게 없어서 에러가남.
		
		
		/*catch(NullPointerException e) {
			System.out.println("잡았다!");
		}*/

	}

}

/*
 * catch는 여러번 가능하다.
 * 하지만 여러개 중에서 하나가 잡혔으면 나머지는 수행 안된다.
 * e.printStackTrace() | e.getMessage()
 */





