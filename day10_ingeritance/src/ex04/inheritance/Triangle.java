package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape {
	
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로길이 = ");
		this.w = sc.nextInt();
		System.out.println("세로길이 = ");
		this.h = sc.nextInt();
		
	}
	
	public double calc() {
		this.result = (w * h * 0.5);
		return result;
	}
	
	public void show() {
		System.out.println(calc());
	}

}
