package Quiz;

import java.util.Scanner;

public class homework01 {
	public static void main(String[] args) {
		
		System.out.println("정수 3개를 입력하세요 : ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		if ((a == b) || (b == c) || (a == c)) {
			
			if ((a == b) && (b == c)) {
				System.out.println( a + "=" + b + "=" + c );
			} else if (( a == b ) && ( b > c )) {
				System.out.println( a + "=" + b + ">" + c );
			} else if (( a == b) && ( c > b)) {
				System.out.println( c + ">" + a + "=" + b );
			} else if (( b == c) && ( a > b )) {
				System.out.println( a + ">" + b + "=" + c );
			} else if (( b == c) && ( b > a )){
				System.out.println( b + "=" + c + ">" + a );
			} else if (( a == c) && ( b > c )) {
				System.out.println( b + ">" + a + "=" + c );
			} else if (( a == c) && ( c > b )){
				System.out.println( a + "=" + c + ">" + b );
			}
			
		} else {

		if (( a > b ) && ( a > c) ) {
			if ( b > c ) {
				System.out.println( a + ">" + b + ">" + c );
			} else {
				System.out.println( a + ">" + c + ">" + b );
			}
			
		} else if (( b > a ) && ( b > c )) {
			if ( a > c ) {
				System.out.println( b + ">" + a + ">" + c );
			} else {
				System.out.println( b + ">" + c + ">" + a );
			}
		} else if (( c > a ) && ( c > b )) {
			if ( a > b ) {
				System.out.println( c + ">" + a + ">" + b );
			} else {
				System.out.println( c + ">" + b + ">" + a );
			}
		}
}
}
}
