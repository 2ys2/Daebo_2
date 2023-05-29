package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main28061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] lemon = new int[N+2];
		int[] result = new int[N+2];
		for (int i = 1; i <= N; i++ ) {
			lemon[i] = Integer.parseInt(st.nextToken());
			result[i] = ( lemon[i] - (N+1-i) );
			} 
		Arrays.sort(result);
		System.out.println(result[N+1]);
	}
}


//나무의 수 N, x=i에 위치한 나무에 자라는 레몬의 개수 n
//성우는 현재 x=0에 있으며, 집은 x=N+1\에 있다.
