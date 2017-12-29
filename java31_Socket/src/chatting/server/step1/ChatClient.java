package chatting.server.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * =========== Socket ����� ���� Ŭ���̾�Ʈ �� ���� ==================
 * ���������� ����Ÿ�� ������ ���̵�
 * ���������� ����Ÿ�� ������ ���ؼ���
 * 1)������ �ּ� (id address) 2) port*(������ �������� ��Ʈ)
 * 
 * >Ŭ���̾�Ʈ �� �ٽ� ����>
 * 1. ���� ����
 * (������ �����ϴ� �� ������ ������ ������ �̷�� ����)
 * Socket s = new Socket("server ip", port); //���� ����
 * ===================================================
 * "Ű����� �Է¹��� ����Ÿ�� �о ������ ���� ����Ÿ�� �Ѹ��� "
 * ===============================================
 * ::
 *  �Է½�Ʈ��(���� ��ġ ���� ��Ʈ��)
 *  ��½�Ʈ��(�ܺ� ��ġ ���� ��Ʈ��)
 *  2. ��Ʈ�� ����
 *  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *  	PrintWriter pw = new PrintWriter(s.getOutputStream());
 * 
 */
public class ChatClient {
	Socket s ;
	BufferedReader br;
	PrintWriter pw;
	public  void net()throws Exception{ 
		//1. 127.0.0.1(192.168.0.102)
				s = new Socket("127.0.0.1", 5500);
				System.out.println("Socket Client.....Creating...");
				
		//2. ��Ʈ�� ����
		br = new BufferedReader( new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(),true); //��Ƽ� ����ϱ⿡ Ŭ���̾�Ʈ���� auto flushing�ؾ��� (�ݴ���)
		System.out.println("Client Stream Creating.....");
		//3. �о���� ����Ÿ�� ������ �Ѹ�
		String line = null;
		while((line=br.readLine())!=null) {
			pw.println(line);
		}
		br.close();
		pw.close();
		
	}
	public static void main(String[] args) throws Exception {
		ChatClient chatClient = new ChatClient();
		chatClient.net();
						
	}

}
