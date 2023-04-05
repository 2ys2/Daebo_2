package Tim_01;

import java.util.Arrays;
import java.util.Scanner;

public class homework_0404 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] W = new int[10];
		int[] K = new int[10];
		
		for ( int i = 0; i < 20; i ++) {
			int n = sc.nextInt();
			
			if ( 0 <= i && i < 10 ) {
				W[i] = n;
			} else if ( 10 <= i && i < 20 ) {
				K[i-10] = n;
			}
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		
		int sumW = W[9]+W[8]+W[7];
		int sumK = K[9]+K[8]+K[7];
		
		System.out.println(sumW + " " + sumK);
	}
}
