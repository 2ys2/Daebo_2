//*


package ex05.While;

public class DoWhileMain {
	
	public static void main(String[] args) {
		
		int a = 1, b = 1; // 변수초기화
		
		do {
			
			b=1; // 다중 while, do-while문에서는 안쪽에 있는 변수의 초기화가 있어야 한다. while
			do {
				
				System.out.print(b + "\t");
				b++; // 증감식
				
			} while ( b <= 3 );
			// b = 1;  초기화
			a++; // 증감식
			System.out.println();
			
		} while( a <= 2 ); // 조건, 문장종결기호
		
	} // main end
} // class end

//*/


/*
package ex05.While;

public class DoWhileMain {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		do {
			
			System.out.println(a);
			a++; // 증감식
			
		} while( a < 11); //문장종결기호
		
	} // main end
} // class end
*/