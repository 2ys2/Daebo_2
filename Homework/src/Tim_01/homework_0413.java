package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class homework_0413 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int n = Integer.parseInt(N);

		Stack<Integer> st = new Stack<>();

		for ( int i = 0; i < n ; i++ ) {
			String K = br.readLine();
			int k = Integer.parseInt(K);

			if ( k == 0) {
				st.pop();
			} else {
				st.push(k);
			}
		} // for end

		int sum = 0;
		if (st.size() != 0) {
			int j = st.size();
			for ( int i = 0; i < j ; i++ ) {
				sum += st.pop();
			}
			System.out.println(sum);

		} else {
			System.out.println(0);
		}


	}
}
