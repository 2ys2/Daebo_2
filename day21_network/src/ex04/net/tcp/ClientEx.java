package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) throws UnknownHostException, IOException {

		BufferedReader br = null, stin = null; // 읽을 그릇
		BufferedWriter bw = null; // 쓸 그릇
		Socket s = null; // socket 1

		int port = 9999;
//		int port = 9000;
		String ip;
		

		try {
			stin = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 입력 받는 부분
			System.out.println(" 접속할 서버 ip ====> "); ip = stin.readLine();
			s = new Socket(ip, port);
//			s = new Socket("192.168.0.50", 9999); // "127.0.01", "localhost"
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); // 소켓으로 입력 받는 부분
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); 

			String outputMessage; // 메세지 담을 그릇
			
			while ( true ) {
				System.out.println("message input : ");
				outputMessage = stin.readLine();
				
				if ( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + " 클라이언트> " + outputMessage + "\n");
//				bw.write("doyeon client> " + outputMessage);
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
				
				
			} // end while
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			
			try {
				s.close(); // 클라이언트 소켓 종료
				
			} catch (Exception e) {
				System.out.println("Server 채팅 중 오류 발생.....");
			}

		} // end try

	}

}
