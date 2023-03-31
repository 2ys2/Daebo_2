package ex04.For;


public class QuizGuGuDan {
	public static void main(String[] args) {
		
		
		
			for ( int c = 2; c < 10; c++ ) {
				System.out.print("*** " + c + "단 ***\t");
			} // c end
		
			for ( int a = 1, n = 1; a < 10; a++, n++ ) {
				for ( int b = 2; b < 10; b++) {
					System.out.print( b + " * " + n + " = " + b*n+"\t" );
				} // b end
				System.out.println();
		} // a end
			
			
			
	} // main edn
} // class end
