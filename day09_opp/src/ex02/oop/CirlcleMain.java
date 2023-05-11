package ex02.oop;

class Circle {

	private int x, y, r; // 멤버변수

	public int getR() {
		return r;
	}

	public void setR(int r) { // int x 파라미터 매개변수
		this.r = r;
	}
	public void display() {
		System.out.println(x + ", " + y + ", " + r);
	}

}
	public class CirlcleMain {
		public static void main(String[] args) {
			
			Circle cc = new Circle();
			
			cc.setR(5);
			System.out.println(cc.getR());
			cc.display();	
		}

	}

