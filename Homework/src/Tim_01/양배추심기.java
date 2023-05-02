package Tim_01;

import java.util.*;
import java.io.*;

class Pair {
	int x, y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}	// x, y 좌표 묶으려고 Pair 클래스 선언


public class 양배추심기 {
	static int n, m;
	static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};	// 상하좌우 이동하게 할 간선역할
	static int[][] map;
	static boolean[][] visit;
	static Queue<Pair> start;								// 탐색을 시작할 좌표점들 (값이 1인 곳의 위치)
	static boolean bfs(Pair start) {
		// 이미 방문했을 경우는 bfs 시작하지 않고 바로 종료
		if (visit[start.y][start.x]) return false;
		
		// 아닌 경우는 연결된 컴포넌트를 전부 방문
		Queue<Pair> q = new LinkedList<>();
		q.add(start);
		visit[start.y][start.x] = true;
		while (!q.isEmpty()) {
			Pair curr = q.poll();
			
			for (int i = 0; i < 4; i++) {
				// 상하좌우로 연결된 다음 정점들의 좌표
				int nextX = curr.x + dx[i],
					nextY = curr.y + dy[i];
				
				// 좌표가 크기를 벗어나는 경우 통과
				if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) continue;
				
				// 이미 방문한 좌표인 경우 통과
				if (visit[nextY][nextX]) continue;
				
				// 해당 좌표의 값이 0인 경우 통과
				if (map[nextY][nextX] == 0) continue;
				
				
				q.add(new Pair(nextX, nextY));
				visit[nextY][nextX] = true;
			}
		}
		// bfs 종료
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		start = new LinkedList<>();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			start.clear();
			
			map = new int[n][m];
			visit = new boolean[n][m];
			
			while (k-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()),
					y = Integer.parseInt(st.nextToken());
				
				map[y][x] = 1;
				start.add(new Pair(x, y));
				// 출발점 좌표 저장
			}
			
			int ans = 0;
			while (!start.isEmpty()) {
				if (bfs(start.poll())) ans++;
			}
			System.out.println(ans);
		}
	}
}
