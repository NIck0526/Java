package user.exception;
class Zero extends Exception{
	//super, this() �Ѵ� ����ؼ� �Ϻ��� ����� ���� ���� Ŭ���� �ۼ�
	//�����ε�
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
		//�� �Ʒ� �κп��� j�� �и��� ������ ����ȴٴ� �����Ʒ�...
		
		System.out.println("2. ��ź ��Ʈ���� ����...");//2.
		//j�� 0�̸� ���ܸ� �Ͷ߸��ڴٴ� ��(���� ��ü�� ���� ���� ����)
		if(j==0) throw new Zero("�и� 0 �̸� �ȵǿ�!!!");
		System.out.println("��ź ���� ����	...");
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