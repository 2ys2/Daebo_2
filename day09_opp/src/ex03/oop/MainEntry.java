package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		//객체 생성해서 3, 5로 결과 출력하기
		
		Rectangle rect = new Rectangle();
		rect.setX1(5);
		rect.setY1(5);
		rect.setX2(5);
		rect.setY2(5);
		rect.disp();
		
		System.out.println("===============================");
		
		Point pt = new Point();
		pt.display();
		
		
		pt.setX(100);
		pt.setY(50);
		pt.display();
		
		pt.setXY(3, 5);
		pt.display();
	}

}
