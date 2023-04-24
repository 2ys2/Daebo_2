package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest { // Socket 2개 필요
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start ~ !");
		
		try {
			ss = new ServerSocket(9000); // 0 ~ 1024 포트 넘버는 예약되어 있음
			s = ss.accept(); // client socket, 응답대기
//		I / O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			byte[] arr = new byte[100];
			is.read(arr); // client 읽어들임
			System.out.println(new String(arr));
			
			String message = "안녕...Client"; // client에게 보냄
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try { s.close(); ss.close(); } catch (IOException e) { e.printStackTrace(); }
			
		} // try end
	}
	

}
