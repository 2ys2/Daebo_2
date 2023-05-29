package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/28063

public class Main28063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		if ( N == 1 ) { 
			System.out.println(0);
		} else {
			if ( ( x == 1 &&  y == N ) || ( y == 1 && x == N)
					|| (x == 1 && y == 1) || ( x == N && y == N ) ) { // (1,1), (N,N), (1,N), (N,1)
				System.out.println(2);
			} else if ( ( x == 1 && y != 1 ) || ( x != 1 && y == 1 )
					|| ( x == N && y != N ) || ( x != N && y == N )) { // (1,?), (?,1)
				System.out.println(3);
			} else { 
				System.out.println(4);
			}
		}
	}
}
/*
x=1, y=?
1,1
1,n

x=?, y=1
n,1
n,n

n=1 -> 0
 */