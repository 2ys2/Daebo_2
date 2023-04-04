package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// next() vs nextLine()
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.next(); sc.next(); // 공백처리
		String b = sc.next();
		System.out.println(a + ", " + b);
		
		
		
//		String name = sc.nextLine();  // 공백 인식 O
//		String str = sc.next(); // 공백 인식 X
//		
//		System.out.println(name + ", " + str);
	}
}
