package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0502 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = ( a < b ) ? a : b ; // 참이면 a, 거짓이면 b <- 삼항연산자
		int min = 0;

		for ( int i = 1; i <= n ; i++ ) {
			if ( a % i == 0 && b % i == 0 ) {
				min = i;
			}
		}
		System.out.println(min);
		System.out.println(a*b/min);
	}
}
