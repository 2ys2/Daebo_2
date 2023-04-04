package ex05.While;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, result;
		char op = ' ';
		
		
		do {
			System.out.println("국어 점수 입력 요망 : ");
			kor = sc.nextInt();
			
		} while ( kor < 0 || kor > 101) ;
		
		do {
			System.out.println("영어 점수 입력 요망 : ");
			eng = sc.nextInt();
			
		} while ( eng < 0 || eng > 101) ;
		
//		do {
//			System.out.println("전산 점수 입력 요망 : ");
//			com = sc.nextInt();
//			
//		} while ( com < 0 || com > 101) ;
		
		
		do {
			System.out.println("연산자 입력 요망 (+,-,*,/) : ");
			op  = sc.next().charAt(0);
			
		} while (( op != '+') && ( op != '-') && ( op != '*') && ( op != '/'));
		
		
		if ( op == '+' ) {
			result = kor + eng;
			System.out.println(kor + " + " + eng + " = " + result);
		}else if ( op == '-' ) {
			result = kor - eng;
			System.out.println(kor + " - " + eng + " = " + result);
		}else if ( op == '*' ) {
			result = kor * eng;
			System.out.println(kor + " * " + eng + " = " + result);
		}else if ( op == '/' ) {
				try {
					double result2;
					result2 = (double)kor / eng;
					System.out.print(kor + " / " + eng + " = ");
					System.out.printf("%.2f\n", result2);
					
				} catch (Exception e) {
					//System.out.println(x);
					System.out.println("0으로 나눌 수 없습니다."); //user message
					//System.out.println(e.getMessage());
					// e.printStackTrace(); //
				
				}
			}
		//System.out.println(kor + op + eng + " = " + result);
	} //main end
} // class end


//do ~ while 사용
//3과목 입력 받아서(0~100) 점수만 입력 받는다.
//연산자(+,-,*,/) 입력 받아서 (+,-,*,/) 외의 연산자 들어오면 재입력 받게 한다.
//결과
//100
//100
//100
//+
//>> 100+100+100 = 300
//>> 100-100-100 = -100