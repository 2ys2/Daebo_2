package ex07.innerClass;

class OuterClass { // 외부클래스
	static int no;
	String message = "hello ~~~~ ";

	public void outerMethod() {
		System.out.println("outer method call~~~~");
		//		System.out.println(su);
		//		show(); //선언한 위치부터 밑으론 사용 가능 위로는 사용 불가능
	}

	class InnerClass { // 내부클래스
		int su = 99;
		public void show() {
			System.out.println(su); // 내부(자신의 것) 사용가능
			System.out.println(message); // 외부 클래스 멤버 사용 가능

		}
		public void disp() {
			outerMethod(); // 외부클래스 메소드 호출
		}

	} // InnerClass end

} //OuterClass end


public class MainEntry {
	public static void main(String[] args) {
		//	1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.disp();	ic.show();

		System.out.println("=================================");

		//		2.
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();	inner.show();





	}
}
