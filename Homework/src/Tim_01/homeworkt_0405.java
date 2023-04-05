package Tim_01;

import java.util.Arrays;
import java.util.Scanner;

public class homeworkt_0405 {
	//	public static int su(int n) {
	//		if (n == 0) return 0;
	//		if (n == 1) return 1;
	//		return su(n - 1) + su(n - 2);
	//	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//		long start = System.currentTimeMillis();
		//		System.out.println(su(n));

		long[] a = new long[101];	
		a[0] = 0;
		a[1] = 1;
		for ( int i = 2  ; i <= n; i++ ) {

			a[i] = a[i-1] + a[i-2];
		}
		System.out.println(a[n]);

		//		long end = System.currentTimeMillis();
		//
		//		System.out.println(end - start);




	}

} // class end


