package Quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {

	//puls(+), mul(*) 리턴타입 없이
	public static void plus(int a, int b) {
		int add = a + b;
		System.out.println(add);

	}
	public static void mul(int a, int b) {
		int gop = a * b;
		System.out.println(gop);


	}
	//sub(-), div(/) 리턴타입 있고, 나누기 함수는 예외처리
	public static int sub(int a, int b) {
		return a - b;

	}

	public static double div(double a, double b) {
		if (  b == 0 ) {
			System.out.println("0으로 나눌수 없습니다.");
			System.exit(0);
		}
		return a / b;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("input data = ");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			System.out.println("integer data input(1:+, 2:/, 3:*, 0:exit) = ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : plus(su1, su2); break;
			case 2 : div(su1, su2); break;
			case 3 : mul(su1, su2); break;
			case 0 : 
				System.out.println("종료를 원하시는 군요, 사칙연산 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("없는 번호 선택하셨습니다. 0 ~ 3 중에 선택해주세요");
			} // switch end
		} // while end

			
//		System.out.println("숫자를 2개 입력하세요 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		//함수호출 
//
//		plus(a,b);
//		mul(a,b);
//		System.out.println(sub(a,b));
//		System.out.println((double)div(a,b));

		//		try {
		//		System.out.println("숫자를 2개 입력하세요 : ");
		//		int a = sc.nextInt();
		//		int b = sc.nextInt();
		//			
		//			plus(a,b);
		//			mul(a,b);
		//			System.out.println(sub(a,b));
		//			System.out.println((double)div(a,b));
		//
		//		} catch (Exception e) {
		//			//			System.out.println(x);
		//			System.out.println("0으로 나눌 수 없습니다."); //user messahe
		//			//System.out.println(e.getMessage());
		//			e.printStackTrace(); //
		//		}
	}

}
