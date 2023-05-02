package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
	int x, y;
	public Pair(int x, int y) { // x, y 좌표 묶음
		this.x = x;
		this.y = y;
	}
}

public class homework_0428 {
	static int n, m, k;
	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 }; // 상하좌우 움직일 간선역할
	static boolean[][] visit;
	static Queue<Pair> start;

	static boolean bfs(Pair start) {
			
		// 이미 방문 했을 경우 false
		if ( visit[start.x][start.y] ) return false;

		// 아닌 경우 연결된 넘포넌트 전부 방문
		Queue<Pair> q = new LinkedList<>();
		q.add(start);
		visit[start.x][start.y]= true; 

		while ( !q.isEmpty() ) {
			Pair current = q.poll();

			for ( int i = 0; i < 4; i++ ) { // 상하좌우 탐색
				// 상하좌우로 연결된 다음 정점들의 좌표
				int nextX = current.x + dx[i];
				int nextY = current.y + dy[i];

				// 좌표 크기 벗어나는 경우 통과
				if ( nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) continue;

				// 이미 방문한 좌표의 경우 통과
				if (visit[nextX][nextY]) continue;

				// 해당 좌표의 값이 0인 경우 통과 (0,0)
				if (map[nextX][nextY] == 0) continue;

				q.add(new Pair(nextX, nextY));
				visit[nextX][nextY] = true;
			} // for end
		} // while end
		return true;
	} // bfs end


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		start = new LinkedList<>();
		
		int t = Integer.parseInt(br.readLine()); // test 케이스
		while ( t-- > 0 ) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken()); // 가로길이
			n = Integer.parseInt(st.nextToken()); // 세로길이
			k = Integer.parseInt(st.nextToken()); // 배추 위치 개수

			map = new int[m][n];
			visit = new boolean[m][n];

			while ( k-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());

				map[x][y] = 1 ;
				start.add(new Pair(x,y)); //  출발점 좌표 저장
			}
			int ans = 0;
			while ( !start.isEmpty() ) {
				if ( bfs(start.poll()) ) {
					ans++; 
				}
			}
			System.out.println(ans); //  지렁이 수
		}
	} // main end
}
