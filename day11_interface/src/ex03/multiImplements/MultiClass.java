package ex03.multiImplements;

import ex02.Interface.IDraw;

public class MultiClass extends Shape
						implements Test, IDraw {

	private int num;

	public void display() {
		System.out.println("MultiClass method!!");
	}

	@Override
	public void draw() { // IDraw
		num = 88;
		System.out.println("IDraw Interface " + num);
	}

	@Override
	public void testview() { // Test
		System.out.println("Test Interface");
	}

	@Override
	public double calc(double x) { // Shape
		System.out.println("Shape abstract class");
		return 5.5;
	}

	@Override
	public void show(String name) { // Shape
		System.out.println("Shape abstract class");
	}

}
