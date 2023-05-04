package Tim_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main11478 {
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		ArrayList<String> arr = new ArrayList<>();
		
		for ( int i = 0; i < str.length(); i++ ) {
			for ( int j = i+1; j < str.length(); j++ ) {
				arr.add(str.substring(i, j));
			}
		}
		
		System.out.println(arr);
		
	}
}
