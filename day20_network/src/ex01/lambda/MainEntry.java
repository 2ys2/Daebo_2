//package ex01.lambda;
//
//interface Message {
//	void something(); // void type
//}
//
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//		//Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//			
//			p.greeting(new Message() { // 일반적인 형태
//
//				@Override
//				public void something() {
//					System.out.println("good morning");
//					System.out.println("한주 열공 감사요!");
//					System.out.println("안녕하세요.");
//					System.out.println("한주 동안 수고 많으셨습니다.");
//					
//				} 
//			});
//			
//			System.out.println("-------------------------------");
////			public int sum( int x, int y ) { return x+y }
////			( x, y ) -> { x + y }
////			lambda 형태
//			p.greeting( () -> { // 매개변수, 리턴타입 없을때
//				System.out.println("lambda 안녕하세요.");
//				System.out.println("한주 동안 수고 많으셨습니다.");
//			} );
//	}
//}