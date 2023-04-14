package Tim_01;

import java.util.Arrays;
import java.util.Scanner;

public class homework_0410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			        String n = sc.next();
			        int[] set = new int[10];
			        
			        for (int i = 0; i < n.length(); i++) {
			            int num = n.charAt(i)-'0';
			            set[num] += 1;
			        }
			        
			        System.out.println(Arrays.toString(set));
		
			        if ((set[6] + set[9])%2 == 0) {
			            int sum = (set[6] + set[9])/2;
			            set[6] = sum;
			            set[9] = sum;
			        } else {
			            int sum = (set[6] + set[9]) / 2 + 1;
			            set[6] = sum;
			            set[9] = sum;
			        }
			        Arrays.sort(set);
			        System.out.println(set[9]);

	}
} //  class

