package access.child;

import access.parent.Parent;

class Child extends Parent{
	public void test() {
		//System.out.println(privateTest); 오류 :: 같은 클래스만 가능한 private
		//System.out.println(defaultTest); 오류 :: 같은 패키지 가능한 default
		System.out.println(protectedTest);
		System.out.println(publicTest);
	}
	@Override
	public void access() {
		super.access();
		System.out.println("상속 받는 필드는 :: "+publicTest);
		System.out.println("상속 받는 필드는 :: "+protectedTest);
	}
	
}

public class ChildTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.test();
		c.access();
	}

}
