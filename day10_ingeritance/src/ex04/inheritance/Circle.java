package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { // Sub class 자손 클래스
	
	public Circle() {
		super(); // 반드시 첫 줄에 와야 함
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 값은 = ");
		this.w = sc.nextInt();
		
	}
	
	public double calc() {
		this.result = (w * w * Math.PI); //Math.PI -> double 타입
		return result;
	}
	
	public void show() {
		System.out.println("반지름 = " + w + ", 원의 넓이 = " + calc() );
	}

}
