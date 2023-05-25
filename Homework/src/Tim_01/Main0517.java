package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main0517 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] rope= new int[N]; 
		for ( int i = 0; i < N; i++ ) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);

		int[] maxw = new int[N];
		for ( int i = 0; i < N; i++ ) {
			maxw[i] = rope[i] * (N-i);
		}
		Arrays.sort(maxw);

		System.out.println(maxw[N-1]);
	}	
}
