package ex05.While;

public class MainEntry {
	
	public static void main(String[] args) {
		
		// 1부터 100까지 출력
		
//		int a = 0;
//		
//		while ( a < 100 ) { // 조건
//			a++; // 증감식
//			System.out.print(a + " ");
//
//			if ( a % 10 == 0 ) {
//				System.out.println();
//			} // if end
//		} // while end
//		
		
// 이렇게도 표현 가능!
		
//		int a = 0;		
//		while ( a++ < 100 ) { // 조건
//			System.out.print(a + " ");
//
//			if ( a % 10 == 0 ) {
//				System.out.println();
//			} // if end
//		} // while end
		
		
		// 다중 while문 이용해서 구구단 전체 출력
		
		int a = 1, b = 1;
		
		while ( a < 10 ) {
			b = 1;
			while ( b < 10 ) {
				b++;
				System.out.print(b + " * " + a + " = " + b*a + "\t");
			}
			a++;
			System.out.println();
		}
		
		
		
		
		
		
		
		
	} // main end
} // class end
