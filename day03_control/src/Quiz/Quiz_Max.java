package Quiz;

import java.util.Scanner;

public class Quiz_Max {
	public static void main(String[] args) {
		
		System.out.println("정수 2개를 입력하세요 : ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		if ( a > b ) {
			System.out.println(a + "가 더 큽니다.");
		} else if ( a == b) {
			System.out.println("입력하신 두 수가 같습니다.");
		} else {
			System.out.println(b + "가 더 큽니다.");
		}
	}
}


/*
문제3] 정수 2개 입력 받아서 큰 수 출력하는 프로그램 작성
		
		
		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/
