package chatting.server.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Ŭ���̾�Ʈ�� �����޼����� �޾Ƽ� 
 * �ٽ� Ŭ���̾�Ʈ ������ �޼����� �Ѹ��� ����
 * ::
 * �Է½�Ʈ�� - �������κ��� ���Ϲ޾Ƽ� ����
 * ��½�Ʈ�� - �������κ��� ���Ϲ޾Ƽ� ����
 */
public class ChatServer {
	ServerSocket sserver;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	public void net() throws Exception{
		/*
		 *  1. ���� ���� ����  
		 *  2. ���� ���� ����
		 *  3. ��Ʈ������
		 *  4. Ŭ���̾�Ʈ�� ���� �޼��� �޾Ƽ�
		 *  5. �ٽ� Ŭ���̾�Ʈ�� ����
		 */
		
		//1.
		sserver = new ServerSocket(60000);
		System.out.println("Server Ready.......");
		
		//2.
		s = sserver.accept();
		System.out.println("Client Connection......"+s.getInetAddress()+" ���� �Դ���.");
		
		//3.
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		pw = new PrintWriter(s.getOutputStream(),true);
		System.out.println("3. Stream ����...");
		
		String line = null;
		while((line=br.readLine())!=null) {
		      pw.println(line);
		      
		}
		br.close();
		pw.close();
		
		
		
	}
	public static void main(String[] args) throws Exception {
		ChatServer chatServer = new ChatServer();
			chatServer.net();

	}

}
