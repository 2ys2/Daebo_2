package Quiz;

import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두개를 입력해주세요.");
			System.out.println("정수 1> ");
			int  num1 = sc.nextInt();
			System.out.println("정수 2> ");
			int  num2 = sc.nextInt();
			System.out.print("num1/num2= " + (num1 / num2));
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
			
		//} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println("프로그램을 종료합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		//} catch (InputMismatchException e) {
			System.out.println("올바른 숫자를 입력하지 않았습니다.");
		}
		}
	}



/*
문제] 정수 2개 입력 받아서 / 연산처리 프로그램 작성 (예외처리 할 것)
		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/
