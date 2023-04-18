package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String T = br.readLine();
		int t = Integer.parseInt(T); // test case

		for ( int x = 0; x < t; x++ ) {
			int count = 0;
			
			String N = br.readLine();
			int n = Integer.parseInt(N); // 바둑판 크기 n

			char[][] ch = new char[n][n];

			for ( int i = 0; i < n; i++ ) {
				String[] temp = br.readLine().split(" ");
				for ( int j = 0; j < n; j++ ) {
					ch[i][j] = temp[j].charAt(0);
				}
			}
						
			
			for ( int i = 0; i < n; i++ ) {
				for(int j = 0; j < n; j++ ) {

					if ( i < 2 && j < 2) {

						if ( ch[i+1][j] != 'Y' && ch[i+2][j] == 'H') {
							count++;
						}

						if ( ch[i][j+1] != 'Y' && ch[i][j+2] == 'H'  ) {
							count++;
						}
					}
					
					
					if ( i > n-2 && j > n-2) {

						if ( ch[i-1][j] != 'Y' && ch[i-2][j] == 'H') {
							count++;
						}

						if ( ch[i][j-1] != 'Y' && ch[i][j-2] == 'H'  ) {
							count++;
						}
					}

				

					if (  ch[i][j] == 'X') {

						while ( ch[i][j] == 'X' ) {

							if ( ch[i-1][j] != 'Y' && ch[i-2][j] == 'H' ) {
								count++;
							} 

							if ( ch[i+1][j] != 'Y' && ch[i+2][j] == 'H') {
								count++;
							}


							if ( ch[i][j-1] != 'Y' && ch[i][j-2] == 'H' ) {
								count++;
							}

							if ( ch[i][j+1] != 'Y' && ch[i][j+2] == 'H'  ) {
								count++;
							} break;

						} // while
					}
					
				} // j
			} // i
			
	
			
			
			
			System.out.println("#"+t+" "+count);
		} // x



	} // main
} // class
