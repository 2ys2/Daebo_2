package ex03.array;

public class QuixEx4 {
	public static void main(String[] args) {
		
		int [][] a = {{1,2,0},{5,7,0}};
		
		for ( int i = 0; i < a.length; i++ ) {
			a[i][2] = a[i][0] * a[i][1] ;
			
		} // end for
		
		for ( int i = 0; i < a.length; i++ ) {
			for ( int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		} 
		
		//System.out.println(a[0][2] + " " + a[1][2]);

	} // end main
} // end class
