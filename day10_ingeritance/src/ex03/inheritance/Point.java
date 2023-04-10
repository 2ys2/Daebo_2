package ex03.inheritance;

public class Point {
	
	// super class
		protected int x, y;

		//생성자함수
		public Point(int x, int y) {		
			this.x = x;
			this.y = y;
			System.out.println("Point x, y constructor");
		}
		
		public Point() {
			//x = y = 10;
			System.out.println("Point default constructor");
		}
		public Point(int x){
			//this(x, 9);
			System.out.println("Point x constructor");
		}
		//getter / setter 
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		//output method
		public void disp() {
			System.out.print(x + ", " + y);

		}
		
	}


	//class Circle extends Point {
	//	
	//}

