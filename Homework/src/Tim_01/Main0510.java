package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main0510 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];

		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());	
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) { // 첫번째 원소가 같다면 두 번째 원소끼리 비교
					return  e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
					//compare(e1[0], e2[0]); //e1[0].compareTo(e2[0]);
				}
			}
		});
		
		
		
		Arrays.sort( arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return  e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		} );
		
		for ( int i = 0; i < N; i++ ) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
