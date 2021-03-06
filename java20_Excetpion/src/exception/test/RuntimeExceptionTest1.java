package exception.test;
/*
 * 1. 컴파일은 된다.( 컴파일러가 예외를 인식하지 못한다)
 * 2. ArrayIndexOutOfBoundsException이 발생 --> RuntimeException
 * 3. method block{ 안에서 예외는 줄 단위로 발생한다.(실행 되는건 실행)
 * 4. 지금의 경우 4 번째 줄에서 버그가 발생했으므로 비정상 종료가 되었다.
 * 5. 해결책 ::
 *    예외처리를 명시적으로 해주면 된다.
 *    try, catch, throws 같은 키워드가 있다.
 *    단, Runtime 계열일 경우는 굳이 그럴 필요가 없고,
 *    소스 코드를 바로 수정하면 된다.
 */
public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = {
			"Hello Java", 
			"No I mean it",
			"Nice to meet u"
		};
		
		int i = 0;   //메인 메소드 안이라서 이것도 로컬로 되는거??
		while(i<=3) {
			try {
				System.out.println(str[i]);//예외 발생가능성 코드 넣어줌, try안에
			}catch(ArrayIndexOutOfBoundsException e)  {// ArrayIndexOutOfBoundsException코드를 잡겠다라는뜻
			}
				i++;
		}
		
		
	}
	
	

}
