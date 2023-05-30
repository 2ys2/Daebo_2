package Tim_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main0530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		
		for ( int i = 1; i <= N; i++ ) {
		q.add(i);
		}
		
		while ( !q.isEmpty() ) {
			if (q.size() == 1) {
				System.out.println(q.peek());
				break; 
			}
			if (q.size() < K) {
				System.out.println(q.peek());
				break;
			}
			
			q.add(q.poll());
			//System.out.println(q);
			for (int i = 0; i < K-1; i++ ) {
				q.poll();
			}
		}
	}
}
