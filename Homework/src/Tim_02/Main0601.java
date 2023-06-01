package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main0601 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] sec = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		int sum = 0;
		for ( int i = 0; i < str.length(); i++ ) {
			int idx = (str.charAt(i) -'A');
			sum += sec[idx];
		}
		System.out.println(sum);
	}
}
