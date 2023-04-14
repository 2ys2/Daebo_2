package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class homework_0414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();


		//		System.out.println(Arrays.toString(ch));
		Iterator iter1 = st1.iterator();
		Iterator iter2 = st2.iterator();

		while ( true ) {
			char[] ch = br.readLine().toCharArray();

			if ( ch.length == 1 && ch[0] == '.') { // . 온점만 입력했을때 YES 반환
				System.out.println("YES"); break;
			} else {

				for ( int i = 0 ; i < ch.length; i++ ) {
					st1.clear(); st2.clear();

					if ( ch[i] == '(') {
						st1.push(1); 
						iter1.hasNext();
						System.out.print(iter1.next() + " ");
//						continue;
					} else if (ch[i] == '[') {
						st2.push(2); 
						iter2.hasNext();
						System.out.print(iter2.next() + " ");
//						continue;
					} else {

						if ( st1.size() == 0 && st2.size() == 0) {
						} else if (ch[i] == ')') { 
							st1.pop();
							iter1.hasNext();
							System.out.print(iter1.next() + " ");
//							continue;
						} else if (ch[i] == ']') {
							st2.pop();
							iter2.hasNext();
							System.out.print(iter2.next() + " ");
//							continue;
						}

					}			

					if ( ch[ch.length-1] == '.' ) { // 문장 마지막에 . 온점 입력하면 break;

						if ( st1.isEmpty() && st2.isEmpty() ) {
							System.out.println("YES"); break;
						}else {
							System.out.println("NO"); break;
						}

					}

				} // i end
			} // while end
		}

	}
}
