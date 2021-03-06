package step5.test;
/*
 * 싱글톤 패턴
 * ::
 * 하나의 클래스 타입을 오직 하나의 객체만을 생성하도록 하는 패턴
 * 1. 일단 객체 하나를 생성한다
 *    private static으로 지정해서 생성
 * 2. 다른 곳에서는 그 클래스 타입으로 객체를 생성하지 못하도록 막아둔다
 * 	  private 을 생성자 앞에 붙인다.
 * 3. 만들어 놓은 객체를 여기저기서 빌어다 사용할 수 있도록 열어둔다
 *    public static
 */


class SunCompany{ //Java Instructor를 배출하는 회사
	private String companyName;
	//1. sun
	private static SunCompany sun = new SunCompany();	
	
	//2. 
	
	private SunCompany(){
		companyName = "Sun Microsystems";
		System.out.println("Company ::"  + companyName);
	}
	
	//3.
	public static SunCompany getCompany() {
		return sun;
	}
	
}
public class SingletoneTest {

	public static void main(String[] args) {
		
		SunCompany com1 = SunCompany.getCompany();
		SunCompany com2 = SunCompany.getCompany();
		SunCompany com3 = SunCompany.getCompany();
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}

}
