package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0501 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());	
		
		
		StringTokenizer str  = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] sum = new int[n+1];
		sum[0] = 0;
		for ( int i = 0; i < n; i++ ) {
			arr[i] = Integer.parseInt(str.nextToken());
			sum[i+1] += sum[i] + arr[i];

		}
		
		for ( int i = 0; i < m; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(sum[b]-sum[a-1]);
			
		}
	}
}


