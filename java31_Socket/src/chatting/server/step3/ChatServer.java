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
		System.out.println("1. Process ����... ArrayList ����� ����...");
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
		//��� �˰���
		server = new ServerSocket(60000);
		System.out.println("Server Ready......");
		/*
		 * 1. ���ѷ��� �����鼭 Ŭ���̾�Ʈ�� ������ �¾� ���δ�.
		 * 2. ������ ���Ϲ��ڸ��� | Thread�� �����ϰ� ���ڰ����� ����
		 * 3. start()
		 */
		while(true) {//waiting for...
			s = server.accept();
			ServerThread st = new ServerThread(s,this); // Q . �������� �ʿ�.(?)
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
		System.out.println(s.getInetAddress()+" ���� �����ϼ̽��ϴ�...");
		chatServer.broadCast(s.getInetAddress()+" ���� ���Խ��ϴ�...");
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
			chatServer.broadCast(s.getInetAddress()+" ���� �����̽��ϴ�....");
			System.out.println(s.getInetAddress()+" ���� �����̽��ϴ�....");
			chatServer.removeThread(this);
		}
		
		
	}
}