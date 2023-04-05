package ex01_method;

import java.util.Scanner;


public class MainEntry {
	//	2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y,String msg) { //함수정의부(구현부)
		System.out.println("hap = " + (x+y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(msg);
		System.out.println(x + ", "+ y + ", "+ msg);

	}
//	private static void abs(int ) {
	public static void abs(int x) {
		// TODO Auto-generated method stub
		if ( x < 0 ) x = -x;
		System.out.println("절대값 : " + x);
	}

	public static void main(String[] args) {
		abs(-9);
		line();

		//		Scanner sc = new Scanner(System.in);// 객체생성, 메모리에 할당, 생성자함수호출
		plus(10, 20, "hello"); // 함수호출
		line();
		System.out.println("main start");
		info();
		System.out.println("main end");
		line();
	}
		
	

	//	1) 매개변수 없고, 리턴타입 없는 경우
	public static void info() {
		System.out.println("doyeon");
		System.out.println("010-1234-5678");
		System.out.println("seoul");
	}

	public static void line() {
		System.out.println("------------------------");
	}


}
