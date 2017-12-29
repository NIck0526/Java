package chatting.server.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 키보드로 입력한 데이타를 읽어서
 * 서버로 보내고
 * 서버가 보낸 데이타를 받아서
 * 자신의 콘솔창으로 출력
 */
public class ChatClient {
	Socket s;
	BufferedReader br1;
	PrintWriter pw;
	
	
	
	
	public void net() throws Exception{
		s = new Socket("192.168.0.102", 60000);
		System.out.println("1. Client Socket Creating...");
		
		br1 = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(), true);
		System.out.println("2.Client Stream Creating...");
		
		ClientThread ct = new ClientThread(s);
		ct.start();
		
		String line = null;
		while((line=br1.readLine())!=null);
		pw.println(line);
	}
	public static void main(String [] args)throws Exception {
		ChatClient chatClient = new ChatClient();
		chatClient.net();
	}

}


class ClientThread extends Thread{
	Socket s;
	
	BufferedReader br2;
	
	ClientThread(Socket s){
		System.out.println("3. Client THread Creating.....");
		this.s = s;
		try {
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			
		}
	}// 생성자
	
	public void run() {
		try {
			while(true) {
				System.out.println("Message :: "+br2.readLine());  
			}
		}catch(Exception e) {
			
		}
	
	}
}