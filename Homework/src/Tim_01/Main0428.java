package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
	int x, y;
	public Pair(int x, int y ) {
		this.x = x;
		this.y = y;
	}
}

public class Main0428 {
	static int n, m;
	static boolean visit[][];
	static int [][] map;
	static int dx[] = {-1,1,0,0}, dy[] = {0,0,-1,1}; // 상하좌우
	static Queue<Pair> start;

	static boolean bfs(Pair start) {
		
		if ( visit[start.x][start.y] ) return false;
		
		Queue<Pair> q = new LinkedList<>();
		q.add(start);
		visit[start.x][start.y] = true;
		
		while ( !q.isEmpty() ) {
			Pair current = q.poll();
			
			for ( int i = 0; i < 4; i++ ) {
				int nextX = current.x + dx[i];
				int nextY = current.y + dy[i];
			
				if ( nextX < 0 || nextX >= n || nextY < 0 || nextY >= m ) continue;
				
				if ( visit[nextX][nextY] ) continue;
				
				if ( map[nextX][nextY] == 0) continue;
				
				q.add(new Pair(nextX, nextY ));
				visit[nextX][nextY] = true;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		start = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int count = 0;

		map = new int[n][m];
		visit = new boolean[n][m];
		for ( int i = 0; i < n; i++ ) {
			String str = br.readLine();
			for ( int j = 0; j <m; j++ ) {
				map[i][j] = str.charAt(j) - 48;

				if ( map[i][j] == 1 ) {
					start.add(new Pair(i,j)); // 출발 좌표  저장
				}
			}

				while (  !start.isEmpty() ) {
					if ( bfs(start.poll()) ) {
						count++;
						System.out.print(count + " ");
				}
			}
//		System.out.println(Arrays.deepToString(map));

		}
		System.out.println("Result = " + count);
	}
}
