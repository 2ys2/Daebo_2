package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class homework_0414_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();

		for ( int i = 0; i < 100; i++ ) {
			st1.clear(); st2.clear();

			String str = br.readLine();
			if ( str.equals(".")) { break;

			} else {

				for ( int j = 0; j < str.length(); j++ ) {

					char ch = str.charAt(j);

					if ( ch == '(' ) {
						st1.push(1);

					} else if ( ch == '[') {
						st2.push(1);

					}

					if ( ch == ')' ) {

						if ( st1.isEmpty() ) {
							System.out.println("NO");
						}else {
							st1.pop();
						}

					} else if ( ch == ']' ) {

						if ( st2.isEmpty() ) {
							System.out.println("NO");
						}else {
							st2.pop();
						}
					}

					if ( ch == '.' ) {

						if ( st1.isEmpty() && st2.isEmpty() ) {
							System.out.println("YES");
						}
					}


				} // for end
			}

		}	
	}

}

