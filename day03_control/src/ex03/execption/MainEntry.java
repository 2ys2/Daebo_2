//*
package ex03.execption;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System. in);
		
		System.out.println("x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		
//		if ( y == 0 ) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.exit(0); //return
//		}
		
		try {
			result = x / y;
			
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(x);
			//System.out.println("0으로 나눌 수 없습니다."); //user messahe
			//System.out.println(e.getMessage());
			e.printStackTrace(); //
		}
	}
}

/*
package ex03.execption;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System. in);
		
		System.out.println("x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		
		if ( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0); //return
		}
		
		try {
			result = x / y;
			
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(x);
			//System.out.println("0으로 나눌 수 없습니다."); //user messahe
			//System.out.println(e.getMessage());
			e.printStackTrace(); //
		}
	}
}
/*/

/*
package ex03.execption;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System. in);
		
		System.out.println("x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		
		if ( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0); //return
		}
		
		result = x / y; // 에러발생 할 수 있다. ex) 0일때
		
		System.out.println(result);
	}
}


package ex03.execption;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System, in);
		
		System.out.println("x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		
		result = x / y; // 에러발생 할 수 있다. ex) 0일때
		
		System.out.println(result);
	}
}
//*/