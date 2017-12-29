package chatting.client.step2;
/*
 * 키보드로 입력받은 데이타를 읽어서
 * 서버로 보냄
 * +
 * 다시 서버가 보낸 데이타를 읽어서
 * 자신의 콘솔창으로 출력
 * ::
 * 입력 2개
 * 출력 1개
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
		 * 1. 소캣생성
		 * 2. 스트림생성
		 * 3. 읽어들여서 보내고
		 * 4. 다시 받아서 콘솔로 출력
		 */
		
		//1. 소켓생성
		s = new Socket("192.168.0.102", 60000);
		System.out.println("1. 클라이언트 스트림생성... 서버 연결 완료");
		
		//2. 스트림생성
		br1 = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(),true);
		br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));// 이것의 그림구조
		System.out.println("2. 클라이언트 스트림생성... ");
		
		//3. 읽어들이고 보내고
		String line = null;
		while((line=br1.readLine())!=null) {
			pw.println(line);
			//blocking... 다시 서버로부터 입력받을때까지 대기상태
			
			//4.
			String line2 = br2.readLine(); //String line2 = null;
			
			System.out.println("서버에서 보내온 메세지 : "+line2);
			
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
