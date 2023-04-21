//package ex01.lambda;
//
//interface Message {
//	int something(int x, int y); // int return type, parameter O
//}
//
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//		//Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//			
//			p.greeting(new Message() { // 일반적인 형태
//
//				@Override
//				public int something(int x, int y) {
//					System.out.println("return type, parameter O 안녕하세요.");
//					System.out.println("한주 동안 수고 많으셨습니다.");
//					return x+y;
//					
//				} 
//			});
//			
//			System.out.println("-------------------------------");
////			public int sum( int x, int y ) { return x+y }
////			( x, y ) -> { x + y }
//
//			p.greeting( (x, y) -> { // lambda 형태, 자료형 안써도 됨, 괄호도 안써도 됨
//				System.out.println("lambda return type, parameter O 안녕하세요.");
//				System.out.println("한주 동안 수고 많으셨습니다.");
//				return x+y;
//			} );
//	}
//}