package exception.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("========NullPointerException========");
		String str = new String("KOSTA");
		//String str = "KOSTA"; ���� ���̿�
		str = null;
		try {
		System.out.println("str ���ڿ��� ���� ::"+str.length());
		System.out.println("str �ּҰ� :: "+str.toString());//Overriding
		}catch(NullPointerException e) {
			System.out.println("��Ҵ�!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��Ҵ�!2");
		}

	}

}

/*
 * catch�� ������ �����ϴ�.
 * ������ ������ �߿��� �ϳ��� �������� �������� ���� �ȵȴ�.
 */




