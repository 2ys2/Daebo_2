package ex04.For;

public class QuizEx1 {
	
	public static void main(String[] args) {
		
		
		//문제 2]
		
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ( i % 3 == 0 ) { 
			count = count + 1;
			sum = sum + i;
			}
		}
			/*
			 * for (int i = 3; i <= 100; i+=3) {
			 * 
			 * count = count + 1; sum = sum + i;
			 */
		System.out.println( "합 : " + sum + " " + "개수 : " + count);
		
		
		
		/* 문제 1]
		 * int i = 0; int sum = 0;
		 * 
		 * for ( i = 1; i < 101; i++ ) { sum = sum + i; }
		 * 
		 * System.out.print( sum );
		 */
	}
}

/*
문제1] 1 ~ 100 까지 합을 구하는 프로그램 작성

		1.변수 선언
		2.메세지 출력 및 입력받기		
		3.처리(계산)
		4.결과출력(화면)
		
문제2] 1 ~ 100 까지 3의 배수의 합과 개수를 구하는 프로그램 작성

		1.변수 선언
		2.메세지 출력 및 입력받기		
		3.처리(계산)
		4.결과출력(화면)
		
*/