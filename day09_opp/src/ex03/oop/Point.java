package ex03.oop;

public class Point {
	private int x, y;
	
	// getter / setter method
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) { // int x 파라미터 매개변수
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) { // int x 파라미터 매개변수
		this.y = y;
	}
	public void setXY( int x, int y) {
		this.x = x;
		this.y = y;
	}

	// output
	public void display() {
		System.out.println(x + ", " + y);
	}
	

}
