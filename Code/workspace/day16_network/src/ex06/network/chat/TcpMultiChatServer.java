package ex06.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {  //outer class
	
	HashMap clients ;  // key, value
	
	public TcpMultiChatServer() { //생성자함수 - 멤버변수 초기화담당
		clients = new HashMap(); //HashMap 객체 생성
		Collections.synchronizedMap(clients);  //동기화
	}
	
	public void start() {  //user method
		ServerSocket ss = null;  // server socket 1
		Socket s = null; // client socket 1
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작 되었습니다. 쳇 시작 합시다!!");
			while(true) {
				s = ss.accept(); //응답대기, 클라이언트소켓
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);  // user class
				thread.start();
			} //end while
		} catch (Exception e) { e.printStackTrace(); 	}		
	}//end start()
	
	
	class ServerReceiver extends Thread { //inner class
		Socket s ; //client socket 
		DataInputStream dis;  // readXXX() - XXX : 자료형
		DataOutputStream dos; // writeXXX()
		
		public ServerReceiver(Socket s) { //생성자함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); //네트워크 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); //네트워크 통해서 쓰기
			} catch (Exception e) { e.printStackTrace(); 	}	
		}//end constructor
		
		public void sendToAll(String msg) {
			Iterator it = clients.keySet().iterator();  //key 값 출력
			
			while( it.hasNext() ) { //요소가 있다면,...
				try {
					DataOutputStream dos = (DataOutputStream)clients.get(it.next()); //해당 키 값으로 value 값 출력
					//System.out.println("dos.toString() : "+dos.toString());
					dos.writeUTF(msg);
				} catch (Exception e) { e.printStackTrace(); 	}	
			}
			
		}//end sendToAll()

		@Override
		public void run() { //스레드 실행부(구현부)
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다.");
				
				clients.put(name, dos);  // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : "+ clients.size() + " 입니다."); //접속자 수 확인
				 
				while( dis != null ) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {	e.printStackTrace();
			} finally {
				sendToAll("#"+name+" 님이 나가셨습니다.");
				clients.remove(name); //접속자 수 제거
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료 하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : "+ clients.size() + " 입니다.");
			} //try end
		} //end run()
	}//end ServerReceiver class
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
//		TcpMultiChatServer server = new TcpMultiChatServer();
//		server.start();
	}
} //outer class








