package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main0602 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for ( int i = 0; i < T; i++ ) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int x = N / H; //호수
			int y = N % H; //층수
			
			if ( y == 0 ) {
				y = H;
				if ( x < 10 ) {
					System.out.println((y*100)+x);
					continue;
				}
				System.out.println((y*100)+x);
				continue;
			}
			System.out.println((y*100)+(x+1));
		}
	}
}
