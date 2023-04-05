package ex03.overload;

public class MainEntry {
	
	public static void main(String[] args) {
		line("*");
		line("&&&");
		line(10, "&");
		line(20, "A");
		
		
		line();
		plus(20);
		plus(12.34);
		plus(3,4);
		plus("hello ");
	}

	public static void plus(int x) {
		System.out.println(x + 100);
	}
	
	public static void plus(double x) {
		System.out.println(x + 100);
	}
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void plus(String x) {
		System.out.println(x + 100);
	}
	
	public static void line() {
		System.out.println("---------------------------------");
	}
	
	public static void line(String str) { // array : length 필드 <- 배열의 길이(크기), String : length() <-문자열의 길이
		System.out.println(str);
	}
	
	public static void line(int n, String str) { // array : length 필드 <- 배열의 길이(크기), String : length() <-문자열의 길이
		for ( int i = 0; i < n; i++ ) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

} // class end
