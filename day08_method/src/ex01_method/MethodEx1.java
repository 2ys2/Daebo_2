package ex01_method;

import java.util.Scanner;

public class MethodEx1 {

//	3) 매개변수 없고, 리턴타입 있는 경우
	public static int show() {
//		System.out.println("show() method");
		return 100;
		
	}
	
	public static  int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		int max = ( x > y)? x : y;
		return max;
//		if ( x > y ) return x;
//		else return y;
	}
	
	public static void main(String[] args) {
		show(); //출력의 책임이 호출한 쪽에 있다. 이렇게 호출 불가능
		
//		호출 방법 두가지
//		1)
		System.out.println(show());
//		2)
		int num = show();
		System.out.println(num);
//		같은 변수명도 가능
		int show = show();
		System.out.println(show);
		
		System.out.println("max = " + max());
	}
}
