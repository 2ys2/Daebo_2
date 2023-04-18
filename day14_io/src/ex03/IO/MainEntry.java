package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준입력
		
		
		try {
		System.out.println("단일 문자 입력 : ");
		int num = is.read()-48; // 예외발생, '0' ~ '9' : 48 ~ 57 (AACII code)
//		System.out.println((char)num); // read 함수의 return타입은 int이다.
		is.read(); is.read(); // java -> 2byte 라서 두번 써줌
		
		int num2 = is.read()-48;
		System.out.println(num+num2);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
