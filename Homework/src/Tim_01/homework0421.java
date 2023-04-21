package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homework0421 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[10];
		int[] sum = new int[11];


		sum[0] = 0;
		for( int i = 0; i < 10; i++ ) {
			String str = br.readLine();
			int n = Integer.parseInt(str);
			num[i] = n;
			sum[i+1] = num[i] + sum[i];
		}

System.out.println(Arrays.toString(sum));
		if ( sum[10] <= 100 ) {
			System.out.println(sum[10]);

		} else {

			for ( int i = 1; i < 11; i++ ) {

				int x = Math.abs((100 - sum[i-1]));
				int y = Math.abs((100 - sum[i]));

				if ( (x - y) < 0 ) {
					System.out.println(sum[i-1]);
					break;
				} 
			}
		}
	}
}
