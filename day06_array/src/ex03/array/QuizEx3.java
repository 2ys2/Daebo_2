package ex03.array;

public class QuizEx3 {
	public static void main(String[] args) {
		
//		임의의 2차원 배열에 데이터 입력 받아서, 입력 받은 값 출력하기
		
//		int su = sc.nextInt();
//		String str = sc.next();
//		int[] arr = new int[30];
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();  // for 문으로 
//		
//		for ( int = i ; i < arr.length; i++ ) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for ( int = i ; i < arr.length; i++ ) {
//			for ( int = j ; j < arr[i].length; j++ ) {
//				
//				arr[i][j] = sc.nextInt();
//			}
//		}
		
//		int[][] a = new int[2][3];
//		Scanner sc = new Scanner(System.in);
		
		
	
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
