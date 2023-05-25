package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0515 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] SE = new int[1000002];
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			SE[S]++;
			SE[E+1]--;
		}
		
		int[] sum = new int [1000002];
		sum[0] = SE[0];
		for ( int i = 0; i < 1000001 ; i++ ) {
			sum[i+1] = sum[i] + SE[i+1];
		}

		int Q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());                                                                                           ,,
		for (int i = 0; i < Q; i++ ) {
			int seat = Integer.parseInt(st.nextToken());
			System.out.println(sum[seat]);
		} 
	}
}
