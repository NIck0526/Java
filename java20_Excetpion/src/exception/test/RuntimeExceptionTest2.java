package exception.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("========NullPointerException========");
		String str = new String("KOSTA");
		//String str = "KOSTA"; 같은 것이여
		str = null;
		try {
		System.out.println("str 문자열의 길이 ::"+str.length());
		System.out.println("str 주소값 :: "+str.toString());//Overriding
		}catch(NullPointerException e) {
			System.out.println("잡았다!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잡았다!2");
		}

	}

}

/*
 * catch는 여러번 가능하다.
 * 하지만 여러개 중에서 하나가 잡혔으면 나머지는 수행 안된다.
 */





