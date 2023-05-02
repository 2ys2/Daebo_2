package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class homework_0427 {
	
static void dfs(int start) {
		
		System.out.print(start + " ");
		visit[start] = true;
		for (int next : adj[start]) 
			if (!visit[next]) dfs(next);
	}

static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true; // 시작점 방문 처리
		
		while ( !q.isEmpty() ) { // q가 비어있지 않다면
			int current = q.poll(); // 
			System.out.print(current + " ");
			for ( int next : adj[current] ) {
				if ( !visit[next] ) { // 방문하지 않았다면
					q.add(next); // q에 추가하고
					visit[next] = true; // 방문 표시
				}
			}
		}	
	}
	
	static int n, m, v;
	static boolean[] visit;
	static ArrayList<Integer>[] adj;
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()); // ex) 4 5 1
		n = Integer.parseInt(st.nextToken()); // 정점의 개수 N(1 ≤ N ≤ 1,000)
		m = Integer.parseInt(st.nextToken()); // 간선의 개수 M(1 ≤ M ≤ 10,000)
		v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호 V
		
		adj = new ArrayList[n + 1]; // n이 1부터 시작해서..
		visit = new boolean[n + 1]; 
		
		for ( int i = 1; i <= n; i++ ) { // n만큼 인접리스트 생성
			adj[i] = new ArrayList<>();
		}
		
		while ( m-- > 0 ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); // 인접숫자 a,b
			adj[a].add(b);
			adj[b].add(a); // a, b 연결
		}
		System.out.println(Arrays.toString(adj));
		
		
		for ( int i = 1; i <= n; i++ ) { // 오름차순 정렬
			Collections.sort(adj[i]);
		}
		
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false); //  배열 전부 false
        bfs(v);
	}
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class homework_0427 { // dfs
//	static int n, m, v;
//	static boolean[] visit;
//	static ArrayList<Integer>[] adj;
//	
//	static void dfs(int start) {
//		
//		System.out.print(start + " ");
//		visit[start] = true;
//		for (int next : adj[start]) 
//			if (!visit[next]) dfs(next);
//	}
//	
////		Stack<Integer> s = new Stack<>();
////		s.add(start);
////		
////		while (!s.isEmpty()) {
////			int curr = s.pop();
////			if ( visit[curr] ) {
////				continue;
////			}
////			visit[curr] = true;
////			System.out.print(curr + " ");
////			for (int next : adj[curr]) {
////				s.add(next);
////			}
////		}	
////	}
//	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		st = new StringTokenizer(br.readLine()); // ex) 4 5 1
//		n = Integer.parseInt(st.nextToken()); // 정점의 개수 N(1 ≤ N ≤ 1,000)
//		m = Integer.parseInt(st.nextToken()); // 간선의 개수 M(1 ≤ M ≤ 10,000)
//		v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호 V
//		
//		adj = new ArrayList[n + 1]; // n이 1부터 시작해서..
//		visit = new boolean[n + 1]; 
//		
//		for ( int i = 1; i <= n; i++ ) { // n만큼 인접리스트 생성
//			adj[i] = new ArrayList<>();
//		}
//		
//		while ( m-- > 0 ) {
//			st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken()); // 인접숫자 a,b
//			adj[a].add(b);
//			adj[b].add(a); // a, b 연결	
//		}
//		
//		for ( int i = 0; i < m; i++ ) {
//			adj[i].sort(Comparator.reverseOrder());
//		}
//		
//		dfs(v); // v부터 시작
//	}
//}
//
///*
// package Tim_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class homework_0427 { // bfs
//	static int n, m, v;
//	static boolean[] visit;
//	static ArrayList<Integer>[] adj;
//	
//	static void bfs(int start) {
//		Queue<Integer> q = new LinkedList<>();
//		q.add(start);
//		visit[start] = true; // 시작점 방문 처리
//		
//		while ( !q.isEmpty() ) { // q가 비어있지 않다면
//			int current = q.poll(); // 
//			System.out.print(current + " ");
//			for ( int next : adj[current] ) {
//				if ( !visit[next] ) { // 방문하지 않았다면
//					q.add(next); // q에 추가하고
//					visit[next] = true; // 방문 표시
//				}
//			}
//		}	
//	}
//	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		st = new StringTokenizer(br.readLine()); // ex) 4 5 1
//		n = Integer.parseInt(st.nextToken()); // 정점의 개수 N(1 ≤ N ≤ 1,000)
//		m = Integer.parseInt(st.nextToken()); // 간선의 개수 M(1 ≤ M ≤ 10,000)
//		v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호 V
//		
//		adj = new ArrayList[n + 1]; // n이 1부터 시작해서..
//		visit = new boolean[n + 1]; 
//		
//		for ( int i = 1; i <= n; i++ ) { // n만큼 인접리스트 생성
//			adj[i] = new ArrayList<>();
//		}
//		
//		while ( m-- > 0 ) {
//			st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken()); // 인접숫자 a,b
//			adj[a].add(b);
//			adj[b].add(a); // a, b 연결	
//		}
//		
//		bfs(v); // v부터 시작
//	}
//}
//
// */
