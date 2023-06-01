package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int max = 0;
		int[] cnt = new int[N];
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < N; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if ( arr[i] > max) {
				max = arr[i];
				count = 0;
			}
			
			if ( max > arr[i] ) {
				count++;
				cnt[i] = count;
			}
		}
		Arrays.sort(cnt);
		System.out.println(cnt[N-1]);
	}
}
