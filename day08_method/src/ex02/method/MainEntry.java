package ex02.method;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		String s1 = args[0];
		String s2 = args[1];
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		String s1 = args[2];
		System.out.println("========================================");
		System.out.println(s1 + ", " + s2);
		System.out.println(s1 + s2); //string 타입이라 문자열처럼 연결된것...
		System.out.println("plus= " + (Integer.parseInt(s1) + Integer.parseInt(s2)));
		// 스트링 타입이라서 숫자를 연산하고 싶으면 integer.paseInt 사용해야함
	}
}
