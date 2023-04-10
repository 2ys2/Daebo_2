package ex03.inheritance;

public class Circle extends Point {  // sub class 
	private int r;
	
	public Circle(int x, int y) {
		super(x, y); //부모의 생성자 함수
		this.r = 55;
		System.out.println("Circle 2 constructor");
	}

	public Circle() {
		this.r =5;
		System.out.println("Circle default constructor");
	}
	
	//output method
	public void disp() {
		super.disp();
		
		System.out.println(", " + r);

	}

}
