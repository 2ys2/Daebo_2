package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeMap;

public class homework_0424 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		TreeMap<String, String > tm = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			
			String str = br.readLine();
			
			if ( str.equalsIgnoreCase("ENTER") ) {
				tm.put(str, str);
				count++;
				continue;
			}
			
			tm.put(str+count, str);
			
		}
		System.out.println(tm.size()-1);
		for (String i : tm.keySet()) {
			System.out.println("key = " + i + ", value = " + tm.get(i));
			
		}
	}
}
