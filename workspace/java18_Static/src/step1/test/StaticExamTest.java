package step1.test;
/*
 * 1.2::
 * static한 멤버는 객체생성 과정없이 바로 쓸수 있다
 */
class Member{
	static String name = "고길똥";
	static int age = 50;
	
	public static void member() {
		System.out.println("우 / 유 / 빞 / 깔 "+name);
	}
	
}

public class StaticExamTest {

	public static void main(String[] args) {
		/*System.out.println("아무개씨의 나이는 "+Member.name+", 나이는 "+Member.age);
		Member.member();
		*/
		
		//m이라는 이름으로 Member객체를 생성한 후 m으로 멤버ㅔ 접근
		
		Member m = new Member();
		System.out.println("아무개씨의 나이는 "+m.name+", 나이는 "+m.age);
	}

}
