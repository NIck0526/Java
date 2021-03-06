package user.exception;
class Zero extends Exception{
	//super, this() 둘다 사용해서 완변학 사용자 정의 예외 클래스 작성
	//오버로딩
	Zero(String message){
		super(message);
	}
	
	Zero(){
		this("This is a UserException");
	}	
}
class User{
	public void go() throws Zero{
		int i=10; int j = 0; int z =0;
		//저 아래 부분에서 j가 분모인 연산이 진행된다는 가정아래...
		
		System.out.println("2. 폭탄 터트리기 직전...");//2.
		//j가 0이면 예외를 터뜨리겠다는 말(예외 객체를 내가 직접 생성)
		if(j==0) throw new Zero("분모가 0 이면 안되요!!!");
		System.out.println("폭탄 터진 직후	...");
		z= i /j;
	}
}

public class UserExceptionTest1 {

	public static void main(String[] args) {
		User u = new User();
		System.out.println("1.go () calling...");//1.
		try {
		u.go();
		}catch(Zero e) {
			System.out.println(e.getMessage());//3.
		}
	}

}
