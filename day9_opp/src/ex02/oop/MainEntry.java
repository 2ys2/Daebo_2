package ex02.oop;

import java.lang.*; // 자동임포트

class Point { //extends Object { //Object class 상속 받고 있었음  
	int x, y; //멤버변수 - 접근지정자 : private < default < protected < public
	
	private int x, y; 
	
	public int getX() {
		return x;
	}
	public void setX(int x) { // int x 파라미터 매개변수
		this.x = x;
	}
	
//	public void display() {
//		System.out.println(getX() + ", " + y);
//		System.out.println(x + ", " + y);
//	}
	
} // Point end

// 클래스가 여러개 있을때 public 은 1개만 가능!
public class MainEntry {
	public static void main(String[] args) { // 보통 public에 Main 생성
		Point pt = new Point();
		System.out.println(pt.getX());
		pt.setX(1000);
		System.out.println(pt.getX());
//		System.err.println(pt.x);
//		pt.display();
//		int xx ;
//		System.out.println(xx);
	}

} // MainEntry end


//값 변경한다 set void setA(){a=aaa}
//값 외부로 실어나른다 get      int getA(){}


//int 0, double 0.0, String null