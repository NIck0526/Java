package thread.step4.test;

class CGVUser implements Runnable {
	static boolean seat =false;
	
	@Override
	public void run() {
		//�¼��� �����ϴ� ������ �������� ������� �ۼ�
		//�� �κп��� �ٷ� �ۼ� | �ٸ� ���� ����, ������ ������
		try{
			reserve();
		}catch(InterruptedException e){
			
		}
		
	}
	/*
	 *  ����ȭ ó���ϴ� ���
	 *  1) �޼ҵ� ����ο� synchronized Ű���带 �ɾ��ش�.
	 *  2) ��ü ��ü�� ����ȭ ó���� �ϴ� ���
	 *  	:synchronized ����� ����
	 */
	
	private synchronized void reserve() throws InterruptedException{
		//1. �����ϴ� ����� �ϴ� �������� �̸��� ���� ����
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" , �����Ϸ� �Ծ...");
		
		//2. �¼��� ����ִٸ�..���Ÿ� ����
		if(seat==false) {
			Thread.sleep(2000);
			System.out.println(threadName+", �¼� ���� ����!");
			seat = true;
		}else {
			System.out.println("�̹� ���ŵ� �¼��̿���..");
		}
	}
	
}




public class CGVProcessTest2 {

	public static void main(String[] args) {
		CGVUser user = new CGVUser();
		Thread t1 = new Thread(user,"����");
		Thread t2 = new Thread(user,"�躸��");
		
		t1.start();
		t2.start();
	}

}
