package Tim_01;

import java.util.Scanner;

public class homework_0328 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System. in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	int B_100 = B / 100; //100자리
	int B_10 = (B % 100) / 10; //10자리
	int B_1 = (B % 100) % 10; //1자리
		
	System.out.println(A * B_1);
	System.out.println(A * B_10);
	System.out.println(A * B_100);
	System.out.println(A * B);

	}
	
}
