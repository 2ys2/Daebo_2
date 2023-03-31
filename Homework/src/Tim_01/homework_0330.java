package Tim_01;

import java.util.Scanner;

public class homework_0330 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1 ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= n ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 * //for ( int i = 1; i <= n; i++ ) {
		 * 
		 * // System.out.print("*"); }
		 */
	}
}
