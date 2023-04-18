package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args)
			throws IOException { // 예외처리 위임 JVM
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		// Reader -> abstract class -> 객체생성X -> 자손이용
//		BufferedReader br = new BufferedReader(reader);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("chractor input = ");
		String str = br.readLine(); // 예외발생, 여러개의 데이터 입력 받기
		
		System.out.println(str);
	}

}
