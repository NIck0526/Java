package chatting.server.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ============== Socket 통신을 위한 서버측 로직 ==================== 
 *
 *클라이언트에서 보내온 데이타를 받아서 처리하는	side
 *
 *<서버측 핵심 로직>
 *1. ServerSocket 생성
 *	ServerSocket server = new ServerSocket(port);
 *  port
 *  ::
 *  1025~65535 사이의 가상의 포트를 사용할 수 있다.
 *  
 *  2. 서버측으로 접속해 들어오는 클라이언트를 받는다
 *  Socket s server.accept()
 *  s를 이용하면 접속한 클라이언트의 ipAdress를 알 수 있다.
 *  ===========================================
 *  "클라이언트가 보낸 데이타를 받아서 자신의 콘솔창으로 데이타를 출력"
 *  ::
 *	입력스트림(외부 장치 스트림)
 *
 *
 */

public class ChatServer {

	ServerSocket server;
	Socket s;
	BufferedReader br;
	
		public void net() throws Exception { // 메인이 처리
		//1. 5500
		server = new ServerSocket(5500);
		System.out.println("Server Ready.......");
		
		//2.
		s=server.accept();
		System.out.println("Client Connection......");
		
		//3.클라이언트가 보낸 데이타를 읽어서 자신의 콘솔로 출력
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = null;
		while((line=br.readLine())!=null) {
		      System.out.println("Client Message :: "+line);
		      
		}
		br.close();
				
	}
	public static void main(String[] args) throws Exception { //JVM처리
		ChatServer chatServer = new ChatServer();
		chatServer.net();
		
		
	}

}
