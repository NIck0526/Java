package chatting.server.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ============== Socket ����� ���� ������ ���� ==================== 
 *
 *Ŭ���̾�Ʈ���� ������ ����Ÿ�� �޾Ƽ� ó���ϴ�	side
 *
 *<������ �ٽ� ����>
 *1. ServerSocket ����
 *	ServerSocket server = new ServerSocket(port);
 *  port
 *  ::
 *  1025~65535 ������ ������ ��Ʈ�� ����� �� �ִ�.
 *  
 *  2. ���������� ������ ������ Ŭ���̾�Ʈ�� �޴´�
 *  Socket s server.accept()
 *  s�� �̿��ϸ� ������ Ŭ���̾�Ʈ�� ipAdress�� �� �� �ִ�.
 *  ===========================================
 *  "Ŭ���̾�Ʈ�� ���� ����Ÿ�� �޾Ƽ� �ڽ��� �ܼ�â���� ����Ÿ�� ���"
 *  ::
 *	�Է½�Ʈ��(�ܺ� ��ġ ��Ʈ��)
 *
 *
 */

public class ChatServer {

	ServerSocket server;
	Socket s;
	BufferedReader br;
	
		public void net() throws Exception { // ������ ó��
		//1. 5500
		server = new ServerSocket(5500);
		System.out.println("Server Ready.......");
		
		//2.
		s=server.accept();
		System.out.println("Client Connection......");
		
		//3.Ŭ���̾�Ʈ�� ���� ����Ÿ�� �о �ڽ��� �ַܼ� ���
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = null;
		while((line=br.readLine())!=null) {
		      System.out.println("Client Message :: "+line);
		      
		}
		br.close();
				
	}
	public static void main(String[] args) throws Exception { //JVMó��
		ChatServer chatServer = new ChatServer();
		chatServer.net();
		
		
	}

}
