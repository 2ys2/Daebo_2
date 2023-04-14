package Tim_01;

import java.util.ArrayList;
import java.util.Scanner;

public class homework_0411 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < b-a+1 ; i++ ) {
			for ( int j = 0; j < i; j++ ) {
				arr.add(i);	
			}
		}
		System.out.println(arr);
		int sum = 0;
		for ( int i = a-1; i < b; i++ ) {
			int num = (int) arr.get(i);
			sum += num;
			System.out.print(sum + " ");
		}
		
		System.out.println(sum);
	}
}
			
			
//			throws IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String[] str = br.readLine().split(" ");
//	System.out.println(Arrays.toString(str));

//1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
//int n = Integer.parseInt(str);
//int m = Integer.parseInt(st.nextToken());
//String[] strs = br.readLine().split(" ");