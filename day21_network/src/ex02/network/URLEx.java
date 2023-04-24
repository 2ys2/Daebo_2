package ex02.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx { // 웹과 통로를 연결할때 URL
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.google.co.kr"); // 에러발생, default 생성자 없어서 꼭 다른걸 넣어줘야함
		
		// System.in : 표준 입력 - 키보드로 부터~~
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); // 에러발생
		
		
		String inputLine;
		while (( inputLine = br.readLine()) != null ) {
			System.out.println(inputLine);
		}
		br.close();
	}

}
