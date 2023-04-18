package homework;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();


		char[][] ch = new char[n][n];

		for ( int x = 0; x < t; x++ ) {

			for ( int i = 0; i < n; i++ ) {
				char [] temp = sc.nextLine().toCharArray();
				for ( int j = 0; j < n; j++ ) {
					ch[i][j] = temp[j];
					
//					int count = 0;
//
//					while ( ch[i][j] == 'X' ) {
//
//
//						if ( ch[i-1][j] == 'Y' ) {
//							break;
//						} else {
//							if ( ch[i-2][j] == 'H' ) {
//								count++;
//							}
//						}
//
//						if ( ch[i+1][j] == 'Y' ) {
//							break;
//						} else {
//							if ( ch[i+2][j] == 'H' ) {
//								count++;
//							}
//						}
//
//						if ( ch[i][j-1] == 'Y' ) {
//							break;
//						} else {
//							if ( ch[i][j-2] == 'H' ) {
//								count++;
//							}
//						}
//
//						if ( ch[i][j+1] == 'Y' ) {
//							break;
//						} else {
//							if ( ch[i][j+2] == 'H' ) {
//								count++;
//							}
//						}
//
//					} // while
//					System.out.println("#"+t+" "+count);
				} // j
			} // i
			for ( int i = 0; i < ch.length; i++ ) { // 행크기
				for ( int j = 0; j < ch[i].length; j++ ) { // 열크기
					System.out.print(ch[i][j]+" ");}}
		} // x



	} // main
} // class
