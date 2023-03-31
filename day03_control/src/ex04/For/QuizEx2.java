package ex04.For;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("출력하고 싶은 단을 입력하세요 : ");
		int num = sc.nextInt();
		
		
	if ( num < 0 ) {
		System.out.println("0보다 큰 수를 입력하세요");
		}
	else {
			for ( int a = 1; a < 10; a++ ) {
		
			System.out.println( num + " * " + a + " = " + num*a);
		}
		}
		
	
		
		
		
		
		
		
//		문제1]
//		for ( int a = 1 ; a <= 100; a++) {
//	
//			if ( a % 2 == 0 ) {
//			System.out.print(a + " ");
//		}
//			if ( a % 20 == 0 ) {
//				System.out.println();
//			}
//		}
		
		
		
	}
}

/*
문제1] 1 ~ 100 까지 중에서 짝수 출력(열)하고, 한 행에 10개씩 출력하는 프로그램 작성
문제2] 원하는 단을 입력 받아서 구구단 출력하기 
		1.변수 선언
		1.변수 선언
		2.메세지 출력 및 입력받기		
		3.처리(계산)
		4.결과출력(화면)
		
*/