package ex02.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
//		1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("원");
		Rect r = new Rect();
		r.show("사각형(rectangle)");
		Triangle t = new Triangle();
		t.show("삼각형");
		
		System.out.println("=================================");
//		2. Shape 부모 추상 클래스 이용해서 객체 생성
//		Shape sh = new Shape(); // 미완성 클래스 <- 생성 불가능
		Shape sh = new Circle(); // 자손으로는 가능
		sh.show("Circle");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		sh = new Rect();
		sh.show("사각형");
		
		System.out.println("*********************************");
//		3. 
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rect", "Triangle"};
		
		for ( int i = 0; i < ss.length; i++ ) {
			ss[i].show(name[i]);
		}
	}
}

