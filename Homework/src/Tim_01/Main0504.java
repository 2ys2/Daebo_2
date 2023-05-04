package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;


public class Main0504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		HashSet<String> h = new HashSet<>();
		for ( int i = 0; i < num; i++ ) {
			h.add(br.readLine());
		}
		int n = h.size();
		String[] srr = new String [n];
		srr = h.toArray(srr);
		
		Arrays.sort(srr, new Comparator<String>() { // 길이 비교 정렬
 
			@Override
			public int compare(String o1, String o2) { // 길이가 같을 때 사전순 정렬
				
				if ( o1.length() == o2.length() ) {
					return o1.compareTo(o2);
				}
				
				return Integer.compare(o1.length(), o2.length()); // o1가 더 클때 음수 반환 -> 바꿈, o2가 더 클때 양수 반환 -> 안바꿈
			}
		});
		
//		lambda식
//		Arrays.sort( srr, (o1, o2) -> { // Comparator가 single method interface (반드시 구현해야할 메소드가 1개)여서 가능
//			if ( o1.length() == o2.length() ) {
//				return o1.compareTo(o2);
//			}
//			return Integer.compare(o1.length(), o2.length());
//		});
		
		
			for ( int i = 0; i < srr.length; i++ ) {
				System.out.println(srr[i]);
			}

	}
}
