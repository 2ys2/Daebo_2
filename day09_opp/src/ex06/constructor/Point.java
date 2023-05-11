package ex06.constructor;

public class Point {
	private int x, y;  //멤버변수

	//생성자함수 3개 
	public Point() {
		this(100,100);
		System.out.println("default constructor");
		//x = y = 100;
	}

	public Point(int x, int y) {
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(x, 9999);
		System.out.println("1 constructor");
//		this.x = x;
//		y = 9999;
	}
	
	//getter / setter
	
	//output method
	public void disp() {
		System.out.println("x = "+x + ", y= " +y);
	}
	
}
