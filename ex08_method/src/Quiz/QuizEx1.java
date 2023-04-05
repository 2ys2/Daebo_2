package Quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		add(1, 2);
		sub(1,2,3,4,5);
		message();
//		max(10, -55)
	}

	public static void add( int x, int y) {
		System.out.println( "add = " + x+y);
	}
	
	
	public static void sub( int i, int j, int k, int l, int m) {
		int sum = i+j+k+l+m;
		System.out.println("sum = " + sum);
	}
	public static void message( ) {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
	
	}
	
	
}


//add(int, int), sub(1, 2, 3), message() { 인사말 출력 }