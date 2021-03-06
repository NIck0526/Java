package user.exception;

class UnderAgeException extends Exception{
	UnderAgeException(String cut){
		super(cut);
	}
	
	UnderAgeException(){
		this("This is a UserException");
	}	
}





 class AdultMovie {
	public void enter(int age) throws UnderAgeException{
		/*
		 * 제어문
		 * 만약에 나이가 19세 이상이면 입장...
		 * 그렇지 않다면 폭탄터트린다(UnderAgeException)
		 */
		if(age>=19) {
			System.out.println("매표소에서 표를 검사합니다.");
			System.out.println("들어가세용~~~");
		}else {
			throw new UnderAgeException("나이가 어려용");
		}
		
		
	}

}


public class AdultMovieTest2{
	public static void main(String[] args) {
		
		AdultMovie movie = new AdultMovie();
		System.out.println("극장에 들어가다.");
		try {
		movie.enter(18);
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

