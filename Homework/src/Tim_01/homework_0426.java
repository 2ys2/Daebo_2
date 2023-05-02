/*/
package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class homework_0426 { // bfs
	static int n, m, total; // n 정점 개수, m 간선 개수, total 방문한 정점 수
	static boolean[] visit;
	static ArrayList<Integer>[] adj;

	static void bfs(int start) { // 
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true;

		while ( !q.isEmpty() ) {
			int curr = q.poll();
			total++;
			for ( int next : adj[curr] ) {
				if ( !visit[next] ) {
					q.add(next);
					visit[next] = true;
				}
			}
		}
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		adj = new ArrayList[ n + 1 ]; // 1부터 시작하는 거 때문에 미리 예방
		visit = new boolean[n + 1];

		for ( int i = 1; i <= n; i++ ) { // n 만큼 인접리스트 생성
			adj[i] = new ArrayList<>();
		}

		while ( m-- > 0 ) { //  for문으로 0부터 m 까지 ++ 돌리는거랑 같음
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 인접숫자 a, b 서로 연결
			adj[a].add(b);
			adj[b].add(a);
		}

		bfs(1); // 1부터 bfs 시작
		System.out.println(total - 1); // 1은 세지 않으므로 빼준다.
	}
}
//*/

//*/
import java.util.*;
import java.io.*;
public class homework_0426 { // dfs
	static int n, m, total;	// n 정점 개수, m 간선 개수, total 방문한 정점 수
	static boolean[] visit;
	static ArrayList<Integer>[] adj;

	static void dfs(int start) {
	Stack<Integer> st = new Stack<>();
	st.add(start);
	
	while (!st.isEmpty()) {
		int curr = st.pop();
		if ( visit[curr] ) {
			continue;
		}
		visit[curr] = true;
		System.out.print(curr + " ");
		total++;
		for (int next : adj[curr]) {
			st.add(next);
		}
	}
}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		adj = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken());
			// a - b 연결
			adj[a].add(b);
			adj[b].add(a);
		}
		dfs(1);

		System.out.println();
		System.out.println(total - 1);
	}
}
//*/
