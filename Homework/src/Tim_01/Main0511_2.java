package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main0511_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> q = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		for ( int i = 0; i < N; i++ ) {
			q.add(i+1);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int count = 0;
		while(!q.isEmpty()) {
			count++;
			if(count % K == 0)
				sb.append(q.poll()).append(", ");
			else
				q.offer(q.poll());
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb);
		
	}
}

//		ArrayList<Integer> arr = new ArrayList<>();
//		System.out.println(arr.toString().replace('[', '<').replace(']', '>'));
//System.out.print("<");
//for(int i = 0; i < N-1; i++){
//    System.out.print(arr[i]+", ");
//}
//System.out.print(arr[N-1]+">");

