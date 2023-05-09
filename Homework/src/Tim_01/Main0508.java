package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main0508 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for ( int i = 0; i < n; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}

		Arrays.sort(arr);

		int[] sum = new int[n+1];
		sum[0] = 0;
		int result = 0;
	
		for ( int i = 0; i < n; i++ ) {
			sum[i+1] = sum[i] + arr[i];
			result += sum[i+1];

		}
		System.out.println(result);	
		
	}
}
