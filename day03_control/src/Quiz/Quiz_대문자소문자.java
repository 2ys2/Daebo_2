package Quiz;

import java.util.Scanner;

public class Quiz_대문자소문자 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if (c <= 90) c += 32;
		else c -= 32;
		
		System.out.println(c);
		
	}
}

/*
문제] 대문자 ---> 소문자, 소문자 ---> 대문자 (차이값 32)
'A' : 65 ~ 'Z' : 90 
'a' : 97 ~ 'z' : 122
ASCII Code
		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/