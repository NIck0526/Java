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
 * 클라이언트가 보낸메세지를 받아서 
 * 다시 클라이언트 측으로 메세지를 뿌리는 로직
 * ::
 * 입력스트림 - 소켓으로부터 리턴받아서 생성
 * 출력스트림 - 소켓으로부터 리턴받아서 생성
 */
public class ChatServer {
	ServerSocket sserver;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	public void net() throws Exception{
		/*
		 *  1. 서버 소켓 생성  
		 *  2. 소켓 리턴 받은
		 *  3. 스트림생성
		 *  4. 클라이언트가 보낸 메세지 받아서
		 *  5. 다시 클라이언트로 보냄
		 */
		
		//1.
		sserver = new ServerSocket(60000);
		System.out.println("Server Ready.......");
		
		//2.
		s = sserver.accept();
		System.out.println("Client Connection......"+s.getInetAddress()+" 님이 왔더용.");
		
		//3.
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		pw = new PrintWriter(s.getOutputStream(),true);
		System.out.println("3. Stream 생성...");
		
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
