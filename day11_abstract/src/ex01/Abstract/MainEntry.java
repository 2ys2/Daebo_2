package ex01.Abstract;

abstract class Shape { // abstract class, super class
	double result = 0;
	public abstract double calc(); // abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Supeer class Shape");
	}
} // Shape end

class Circle extends Shape {
	
	double r = 5.0;

	@Override // 강제성이 있다.
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");
	}
} // Circle end

class Rect extends Shape {
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + " 인 사각형을 그렸습니다.");
	}
	
} // Rect end

class Triangle extends Shape {
	int w = 20, h = 10;

	@Override
	public double calc() {
		result = w * h * 0.5;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + " 인 삼각형을 그렸습니다.");
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
//		Shape sh = new Shape(); // Cannot instantiate the type Shape ; 자체적으로 객체 생성할 수 없다.
//		Shape sh = new Circle(); // 단, 상속 받은 자손 클래스로는 객체 생성 할 수 있다.
	}
}
