package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main0531 {
	static int div(int a, int b) {
		if ( b==0 ) {
			return a;
		} else {
		return div(b, a % b);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int [][] arr = new int [2][2];
		for ( int i = 0; i < 2; i++ ) {
			st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken()); //분자
				arr[i][1] = Integer.parseInt(st.nextToken()); //분모
		}
		int A = (arr[0][0] * arr[1][1]) + (arr[0][1] * arr[1][0]);
		int B = (arr[0][1] * arr[1][1]);
	
		
		int result = div(A, B);
		System.out.println(result);
		System.out.println(A/result + " " + B/result);
	}
}

/*
 * for ( int i = 0; i < 2; i++ ) { for ( int j = 0; j < 2; j++ ) {
 * System.out.println(i+", "+j+" : "+arr[i][j]); } }
 */