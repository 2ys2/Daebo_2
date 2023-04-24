package ex01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEcntry {
	public static void main(String[] args) {
		String host = "192.168.0.50";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host); // 예외처리 必
			
			for(InetAddress item : address ) {
				System.out.println(item.getCanonicalHostName()); // DESKTOP-5LOTM5T
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
