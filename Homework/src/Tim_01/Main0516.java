package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0516 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] H = new int[N];
		for ( int i = 0; i < N; i++ ) {
			H[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] ab = new int[N+2];
		for ( int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			ab[a] += k;
			ab[b+1] -= k;
		}
		
		int[] sum = new int[N+2];
		sum[0] = ab[0];
		for ( int i = 0; i < N+1; i++ ) {
			sum[i+1] = ab[i+1] + sum[i];
		}
		
		for ( int i = 0; i < N; i++  ) {
			System.out.print( (H[i]+sum[i+1])+ " ");			
		}
	}
}
