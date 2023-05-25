package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0519 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < 5; i++ ) {
			int n = Integer.parseInt(st.nextToken());
			sum += n*n;
		}
		System.out.println(sum % 10);
	}
}
