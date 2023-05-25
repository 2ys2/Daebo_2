package Tim_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main0518 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
		long N = Long.parseLong(st.nextToken()); // 필요한 랜선 개수

		long[] line = new long[K];
		for ( int i = 0; i < K; i++ ) {
			line[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(line);
		long start = 1;
		long end = line[K-1] + 1;

		long ans = 0;
		while ( start < end ) {
			long mid = (start+end)/2;
			long sum = 0;
			for ( int i = 0; i < K; i++ ) {
				long count = line[K-1-i] / mid;
				sum += count;
//				System.out.print(count + " ");
			}
//			System.out.println("/ " + mid + " " + sum);
			if (sum < N) {
				end = mid;
			}
			else {
				start = mid + 1;
				ans = ans < mid ? mid : ans;
			}
		} // while end
		System.out.println(ans);
	}
}
