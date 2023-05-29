package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/28065
public class Main28065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long R = Long.parseLong(st.nextToken());
		long sum = 0;
		
		for(long i=1 ; i<=Math.sqrt(N-R) ; i++) {
			if( (N-R) % i == 0 ) {
				long j = (N-R)/i;

				if ( i > R && i == j) {
					sum += i;	
				} else {
					if ( i > R ) {
						sum += i;
					}
					if ( j > R ) {
						sum += j;
					}
				} 
			}
		}
		System.out.println(sum);
	}
}

