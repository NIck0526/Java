package exception.test;

import java.io.IOException;

public class IOExceptionTest3 {

	public static void main(String[] args)throws IOException {
		System.out.println("==================IOException==============");
		byte[] data = new byte[100];
		//Ű����� ����Ÿ�� �о����
		System.out.println("Ű����� �Է� ��Ź�帳�ϴ�....");
		System.in.read(data);
		
		
		/*try {
		System.in.read(data);
		}catch(IOException e){
			System.out.println("read()�� ����ϴ� ���� ���ܰ� �߻�");
		}*/
		System.out.println(new String(data));
	}

}





