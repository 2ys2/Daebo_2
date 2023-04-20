package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework0419 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		char[][] arr = new char[5][15];
		
		for ( int i = 0; i < 5; i++ ) {
			String str = br.readLine();
			char[] ch = str.toCharArray();
			
			for ( int j = 0; j < ch.length ; j++ ) {
				arr[i][j] = ch[j];
			}
		}
		
		
		for (int j = 0; j < 15 ; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i][j]);
			}
		}		


	}
}

//		String[][] arr = new String[5][15];
//
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 15; j++) {
//				arr[i][j] = sc.nextLine();
//
//
//				if ( arr[i][j] == null ) {
//					arr[i][j] = "";
//				}
//
//
//			}	
//		}
//		