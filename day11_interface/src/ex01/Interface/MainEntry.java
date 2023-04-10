package ex01.Interface;

interface A { // interface - abstract method, final field 만 갖는다.
	int x = 90; // final static int x = 90;
	final int y = 777;
	char ch = 'A'; 

	//	추상메소드 abstract 생략 가능함 <- 무조건 추상메소드라서
	//	public void show() {	} // abstract methods do not specify a body <- 추상메소드는 몸체(블록)을 가질 수 없다.
	public void show(); // public abstract void show();
	public abstract void disp();
} // A end

interface B { 
	void view(); // abstract
} // B end

interface C {
	String name = "happy";
	public void draw(); // abstract
} // C end

interface D extends B { // 인터페이스 간 상속 가능
	void dview(); // override는 해당 클래스에서 해야함
} //  D end

class Rect implements D { // implements interface

	@Override
	public void view() { // B interface

	}

	@Override
	public void dview() { // D interface

	}

	public int plus( int x, int y) {
		return x + y;
	}

} // Rect class

class Shape {

} // Shape class

class Circle implements C {

	@Override
	public void draw() {
//		name = "doyeon";
				System.out.println(name + "님이시네요.");
		
	}
	
	
}

class Multi extends Shape implements B, C, A { // java 컴파일러는 class 구현시 반드시 클래스가 먼저 기제된다. 그다음 인터페이스

//	x = 100; // 값 변경 금지
	@Override
	public void show() { // A

	}

	@Override
	public void disp() { // A

	}

	@Override
	public void draw() { // C

	}

	@Override
	public void view() { // B

	}

} // Multi end

public class MainEntry {
	public static void main(String[] args) {
		//		A a = new A(); // Cannot instantiate the type A <- class 아니라 인터페이스는 객체 생성 할 수 없다.
	}

}
