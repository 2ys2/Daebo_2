package Quiz;

import java.util.Scanner;

public class Quiz_윤년판정프로그램 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if (( year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}


/*
문제] 윤년/평년 판정 프로그램 작성
if year % 4 == 0 {
if ( year % 100 != 0 || year % 400 == 0 )
"윤년";
}
		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/