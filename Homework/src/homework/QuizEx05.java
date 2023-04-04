package homework;

import java.util.Scanner;

public class QuizEx05 {
	public static void main(String[] args) {
		
//		임의의 2차원 배열에 데이터 입력 받아서, 입력 받은 값 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		String str = sc.next();
		
			
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();  // for 문으로 
		
//		배열
//		int[] arr = new int[30];
//		for ( int = i ; i < arr.length; i++ ) {
//			arr[i] = sc.nextInt();
//		}
		
//		이중배열
		int[][] arr = new int[][];
		for ( int i = 0 ; i < arr.length; i++ ) {
			for ( int = j ; j < arr[i].length; j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}

	

		for ( int i = 0; i < a.length; i++ ) { //배열명.length <--행의 길이
			for ( int j = 0; j < a[i].length; j++) { //배열명[행크기] <-- 열의 길이
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	} // end main
} // end class
