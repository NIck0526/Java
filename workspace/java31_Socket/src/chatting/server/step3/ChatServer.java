package chatting.server.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//process
public class ChatServer {
	
	private ServerSocket server;
	private ArrayList<ServerThread> list;
	private Socket s;
	
	public ChatServer() {
		list = new ArrayList<ServerThread>();
		System.out.println("1. Process 생성... ArrayList 저장소 생성...");
	}
	
	
	

	public void addThread(ServerThread st) {
		list.add(st);
	}

	public void removeThread(ServerThread st) {
		list.remove(st);
	}

	public void broadCast(String message) {
		for(ServerThread st : list) {
			st.sendMessage(message);
		}
	}
	
	public void net() throws Exception{
		//통신 알고리즘
		server = new ServerSocket(60000);
		System.out.println("Server Ready......");
		/*
		 * 1. 무한루핑 돌리면서 클라이언트의 접속을 맞아 들인다.
		 * 2. 소켓을 리턴받자마자 | Thread를 생성하고 인자값으로 주입
		 * 3. start()
		 */
		while(true) {//waiting for...
			s = server.accept();
			ServerThread st = new ServerThread(s,this); // Q . 생성자의 필요.(?)
			this.addThread(st);
			st.start();
		}
	}
	
	public static void main(String[] args) throws Exception {
		ChatServer chatServer = new ChatServer();
		chatServer.net();
	}
}
class ServerThread extends Thread{
	private Socket s;
	private BufferedReader br;
	private PrintWriter pw;
	ChatServer chatServer;
	ServerThread(Socket s,ChatServer chatServer ){
		System.out.println("2.Thread Creating....");
		try {
		this.s = s;
		System.out.println(s.getInetAddress()+" 님이 접속하셨습니다...");
		chatServer.broadCast(s.getInetAddress()+" 님이 들어왔습니다...");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
		} catch (Exception e) {
		}
	
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	
	public void run() {
		String line = null;
		try {
		while((line = br.readLine())!=null) {
		chatServer.broadCast(line);
		}	
		}catch(Exception e) {
			chatServer.removeThread(this);
			chatServer.broadCast(s.getInetAddress()+" 님이 나가셨습니당....");
			System.out.println(s.getInetAddress()+" 님이 나가셨습니당....");
			chatServer.removeThread(this);
		}
		
		
	}
}