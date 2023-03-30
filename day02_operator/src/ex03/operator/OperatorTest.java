package ex03.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//대입연산자 : =, +=, -=, +=, /=, <<=, >>=, ...
		
		int x = 2, y = 3, result;
		
		result = x + y; // 5
		System.out.println(result);
		
		//x = x + y; // 5
		x += y; // =+ <== win x, += 
		System.out.println(x);
		
		//x = x * y; // 15
		x *= y; // 15 처리 속도가 더 빠르다
		System.out.println(x);
		
		
		
		x = x + 1; // x += 1; x++; 모두 같다.
		System.out.println(x);
		
	}

}
