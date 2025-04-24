package ex07.network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        
        try {
            // 서버 소켓 생성, 포트 9876으로 수신 대기
            socket = new DatagramSocket(9876);
            byte[] receiveData = new byte[65536];
            
            System.out.println("서버가 시작되었습니다. 메시지를 기다리는 중...");

            while (true) {
                // 클라이언트로부터 데이터 수신
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                
                // 받은 데이터 출력
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("클라이언트로부터 받은 메시지: " + message);
                
                // 클라이언트의 IP와 포트 정보를 사용하여 응답 메시지 전송
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String responseMessage = "서버에서 응답: " + message;
                DatagramPacket sendPacket = new DatagramPacket(responseMessage.getBytes(), responseMessage.length(), clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}