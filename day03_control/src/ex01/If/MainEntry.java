package ex01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		
		
		//int su = new Scanner(System.in).nextInt();
		
		//짝수 홀수 판정 if
		//if ( su % 2 == 0 ) System.out.println("even");
		//else System.out.println("odd");
		
		System.out.println("integer data input : ");
		
		int su1 = new Scanner(System.in).nextInt();
		
		
		// 삼항연산자
		//1.
		//( su1 % 2 == 0) ? System.out.println("even") : System.out.println("odd");
		//2.
		//String str = ""; //null
		//str = ( su1 % 2 == 0) ? "even" : "odd";
		//System.out.println(str);


		// 양수, 음수, 0, 판정 if
		if(su1 > 0) System.out.println("양수");
		else if(su1 < 0) System.out.println("음수");
		else System.out.println("0이군요");

		}
	}
