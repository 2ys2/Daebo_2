package Tim_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class homework0417 {
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			que.add(i+1);
		}
		
		
		while ( true ) {
			
			if ( que.size() == 1 ) {
				System.out.println(que.poll());
				break;
			}
			
			
			que.poll();
			que.add(que.poll());
			
		
			
		}
	}
}
