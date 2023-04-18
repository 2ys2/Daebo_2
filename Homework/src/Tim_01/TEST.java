package Tim_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TEST {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String > map = new HashMap<>();
		
		
		int[][] arr = new int[9][9];
		
		for ( int i = 0; i < 9; i++ ) {
			for ( int j = 0; j < 9; j++ ) {
				arr[i][j] = sc.nextInt();
				map.put(arr[i][j], ( i + " " + j) );
			}
		}
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while( it.hasNext() ) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}
		
		
	}
}
