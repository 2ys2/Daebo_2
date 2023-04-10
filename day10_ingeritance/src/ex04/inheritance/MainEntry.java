package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape();
//		sh.show(); // 부모는 부모것만 호출 가능
		
		Shape sh = new Circle(); // 자손은 부모, 자손 모두 호출 가능
		sh.show();
		
		sh = new Triangle();
		sh.show();
		
	}
//		Circle c = new Circle();
//		System.out.println(c); //주소가 나와..? c 인스턴스 있는 주소가 나옴.. 아직 계산 안끝나서 자동호출
//		c.show();
//		
//		System.out.println("==================");
//		Triangle t = new Triangle();
//		t.show();
//		
//		t.setW(20);
//		t.setH(30);
//		t.show();
//	}

}
