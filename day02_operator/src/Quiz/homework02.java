package Quiz;

import java.util.Scanner;

public class homework02 {
	public static void main(String[] args) {
		System.out.println("정수 2개를 입력하세요 : ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("연산자 ( +, -, *, / ) 중 1개를 입력하세요 : ");
		String c = new Scanner(System.in).next();
		char op = c.charAt(0);
		// 문자열 비교가 어렵기 때문에 Character을 사용해 문자로 바꿔준다.
		// char to String ---> Character.toString(값);
		// String to char ---> String값.charAt(인덱스); ---> 한 글자만 빼서 넣어줄 수 있다
		// charAt(0)은 맨 앞의 문자. (문자열은 null을 데리고 다니기 때문에 (0)이 입력한 해당 문자이다.)
		// String의 모든 글자를 char로 옮겨주고 싶을 경우에는 ---> char[] 배열명 = s.toCharArray();
		
		if ( op == '+' ) {
			System.out.println( a + " + " + b + " = " + (a+b) );
		} else if ( op == '-' ) {
			System.out.println( a + " - " + b + " = " + (a-b) );
		} else if ( op == '*') {
			System.out.println( a + " * " + b + " = " + (a*b) );
		} else if ( op == '/') {
			System.out.println( a + " / " + b + " = " + (a/b) );
		} else {
			System.out.println(" 연산자를 ( +, -, *, / ) 에서 선택하세요.");
		}
}

}
