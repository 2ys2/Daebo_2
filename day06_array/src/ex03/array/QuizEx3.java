package ex03.array;

public class QuizEx3 {
	public static void main(String[] args) {
	
		int [][] a = {{3,8,5,10}, {7,1,2,3},{0,0,0,0}};
		
		for ( int i = 0; i < a.length; i++) {
			a[2][i] = a[0][i] + a[1][i];
		}
		
		for ( int i = 0; i < a.length; i++ ) { //배열명.length <--행의 길이
			for ( int j = 0; j < a[i].length; j++) { //배열명[행크기] <-- 열의 길이
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	} // end main
} // end class
