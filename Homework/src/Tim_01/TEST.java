package Tim_01;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[5][15];

		for ( int i = 0; i < 5; i++ ) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();

			for ( int j = 0; j < ch.length ; j++ ) {
				arr[i][j] = ch[j];
			}
		}

//		for (int i = 0; i < 5 ; i++) {
//			for (int j = 0; j < 15; j++) {
//				System.out.print((int)arr[i][j] + ", ");
//			}
//			System.out.println();
//		}
		

		for (int j = 0; j < 15 ; j++) {
			for (int i = 0; i < 5; i++) {
				if(arr[i][j]=='\0')		// 값이 null일 경우, 넘어가고 계속 진행 ( continue )
					continue;
				System.out.print(arr[i][j]);
			}
		}		


	}
}
