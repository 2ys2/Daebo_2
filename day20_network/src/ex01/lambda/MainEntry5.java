package ex01.lambda;

// 타입을 써야할 상황이 있다.
interface Message {
	void something(int x, int y); // parameter O
	int good(int x);
}
@FunctionalInterface
interface Talk {
	void something(String x, String y); // functional interface ex) Runnable <- run 메소드만 가지고 있다.
}

class Person {
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", " DaeBo!!");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		//Lambda Expression, JDK 1.8 이상
		Person p = new Person();
			
			p.greeting(new Message() { // 일반적인 형태

				@Override
				public void something(int x, int y) {
					System.out.println("x = " + x + ", y = " + y);
					
				} 
			});
			
			System.out.println("-------------------------------");
//			public int sum( int x, int y ) { return x+y }
//			( x, y ) -> { x + y }

			char ch = 'K';
			p.greeting( (String x, String y) -> { // 에러발생, 타입에 대해서 애매 해서 타입을 정확히 써줘야함
				System.out.println("x = " + x + ", y = " + y);
//				ch = 'P'; // lambda 안에서 값 변경 할 수 없다.
				System.out.println(ch); //  출력은 가능
				
				num = 500; // static 변수 값은 변경 가능
				System.out.println(num);
			} );
			
			p.greeting( (int x, int y) -> { 
				System.out.println("x = " + x + ", y = " + y);
			} );
	}
	static int num = 30;
	
}