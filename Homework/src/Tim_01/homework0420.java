package Tim_01;

import java.util.Scanner;

public class homework0420 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		while ( true ) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			

			if ( a == 0 && b == 0) {
				break;
			} 

			if ( a > b ) {

				if ( a != 0 && b == 0) {
					System.out.println("multiple");
				} else if ( a % b == 0 ) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}

			} else {

				if ( a == 0 && b != 0) {
					System.out.println("factor");

				} else if ( b % a == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}



		}

	}
}
