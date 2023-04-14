package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class homework_0412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		int n = Integer.parseInt(N);

		Stack<Integer> st = new Stack<>();

		for ( int i = 0; i < n; i++ ) {
			st.clear();
			char[] ch = br.readLine().toCharArray();

			boolean flag = true;
			for ( int j = 0; j < ch.length; j++ ) {
				if ( ch[j] == '(' ) {
					st.push(1);
				} else {
					if ( st.size() == 0) {
						flag = false;
					}else {
						st.pop();
					}
				}
			}

			if ( flag ) {
				if ( st.isEmpty() ) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}

	}	

}

