package access.child;

import access.parent.Parent;

class Child extends Parent{
	public void test() {
		//System.out.println(privateTest); ���� :: ���� Ŭ������ ������ private
		//System.out.println(defaultTest); ���� :: ���� ��Ű�� ������ default
		System.out.println(protectedTest);
		System.out.println(publicTest);
	}
	@Override
	public void access() {
		super.access();
		System.out.println("��� �޴� �ʵ�� :: "+publicTest);
		System.out.println("��� �޴� �ʵ�� :: "+protectedTest);
	}
	
}

public class ChildTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.test();
		c.access();
	}

}
