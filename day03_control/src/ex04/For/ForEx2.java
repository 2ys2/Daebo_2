package ex04.For;

public class ForEx2 {
	public static void main(String[] args) {
		
		int a = 1, b = 1;
//		// 초기값, 증감식 생략가능 (단, 조건식 생략하면 무한루프가 된다)
//		for ( ; a < 4;  ) {  // a = 1 ; 생략 가능 ; 생략 불가능
//			System.out.println(a);
//			a++;
//	}
			
//			for ( ; ; ) { //무한 루프
//				System.out.println(a);
//				a++;
//				
//				//탈출 구문
//				if ( a == 7 ) break;
		
		
		for ( a = 1, b = 5 ; a < 11 ; a++, b =+ 2) { // 초기값, 증감식 2개 이상 가능 (단, 조건은 오직 1개)
			System.out.println(a);
			System.out.println(b);
			}

		}
	}
