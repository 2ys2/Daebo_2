//*
package ex01_operator;


// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %, ^, ...
		// 정 + 정 = 정
		// 실 - 실 = 실
		// 정 /, % 문(char) = 정
		
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(gob);
		System.out.println("x * y = " + (x*y));
		System.out.println(x + " * " + y + " = " +
		 (x+y));
		System.out.println("--------------------------");
		
		System.out.println("3 + 4 * 5 = " + (3+4*5));
		System.out.println("(3 + 4) * 5 = " + ((3+4)*5));
		
		
		// 정수 (+, -< *, /, %, ^, ....) 정수 = 정수
		System.out.println("\n\n7 / 3 = " + (7/3)); // 몫
		System.out.println("7 % 3 = " + (7%3)); // 나머지
		
		// 정수 (+, -< *, /, %, ^, ....) 정수 = 정수
		System.out.println("\n7 / 3 = " + (7/3)); // 2
		System.out.println("7 / 3. = " + (7/3.)); // 3. = 3.0, 2.3333 정수 / 실수 = 실수
		System.out.println("7. / 3. = " + (7./3.)); // 3. = 3.0, 실수 / 실수 = 실수
		
	}

}
//*/


/*
package ex01_operator;


//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자 : 증감 ---> ++, --, ~, ...
		int x = 10, y;
		
		//y = x++; //후위연산 : 대입 먼저, 연산 나중
		// x = 11	y = 10
		//y = ++x; //전위연산 : 연산 먼저, 대입 나중
		// x = 11	y = 11
		//y = x--;
		
		x++; //++x; 단독으로 사용된 건 결과가 같다.
		y = x;
		System.out.println("x = " + x + "\ty = " + y);
		
	}

}
//*/


/*
package ex01_operator;


// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자 : 증감 ---> ++, --, ~, ...
		int x = 7, y;
		
		y = ~x; //비트부정 : -(원래 값 + 1) ---> 출력 결과
		// 1010 > 0101 10 > -11
		// x = 10	y = -11
		
		// int x = 7, y;
		// y = ~x;
		// x = 7	y = -8
		
		
		System.out.println("x = " + x + "\ty = " + y);
		
	}

}
//*/