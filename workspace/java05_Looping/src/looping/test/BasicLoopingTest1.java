package looping.test;

public class BasicLoopingTest1 {
	public static void main(String[] args) {
		//for �󸶳� �ݺ� �ϴ��� �˶�
		System.out.println("=======for looping=====");
		for(int i=0; i<10; i++) {//��ȣ �ȿ��ִ� i�̶� for ȥ�ڸ��� ������ �ٸ� �������� i��� ����
			System.out.println(i+"Hellooo");
		
		}
		
		//while �󸶳� �ݺ��ؾ����� �𸦋�
		System.out.println("======while looping=====");
		int i=10;//��ȣ �ۿ� �ִ°��̶� ��� ���� ���� i�̾ �ٸ������� ����
		while(i>0) {
			System.out.println(i+"Helloooooo");
			i--;
		}
		
		//do~while : �ݵ�� �ѹ��� ����ȴ�.
		int j=0;
		do {
			System.out.println(j+" Always print....");
			j++;
		}while(j<10);
		
	}

}
