package chatting.client.step2;
/*
 * Ű����� �Է¹��� ����Ÿ�� �о
 * ������ ����
 * +
 * �ٽ� ������ ���� ����Ÿ�� �о
 * �ڽ��� �ܼ�â���� ���
 * ::
 * �Է� 2��
 * ��� 1��
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	Socket s;
	BufferedReader br1, br2;
	PrintWriter pw;
	
	public void net() throws Exception {
		/*
		 * 1. ��Ĺ����
		 * 2. ��Ʈ������
		 * 3. �о�鿩�� ������
		 * 4. �ٽ� �޾Ƽ� �ַܼ� ���
		 */
		
		//1. ���ϻ���
		s = new Socket("192.168.0.102", 60000);
		System.out.println("1. Ŭ���̾�Ʈ ��Ʈ������... ���� ���� �Ϸ�");
		
		//2. ��Ʈ������
		br1 = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(),true);
		br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));// �̰��� �׸�����
		System.out.println("2. Ŭ���̾�Ʈ ��Ʈ������... ");
		
		//3. �о���̰� ������
		String line = null;
		while((line=br1.readLine())!=null) {
			pw.println(line);
			//blocking... �ٽ� �����κ��� �Է¹��������� ������
			
			//4.
			String line2 = br2.readLine(); //String line2 = null;
			
			System.out.println("�������� ������ �޼��� : "+line2);
			
		}
		br1.close();
		br2.close();
		pw.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		ChatClient chatClient = new ChatClient();
		chatClient.net();

	}

}
