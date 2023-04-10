package ex03.Quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Subway s = new Subway();
		s.start("열차");
		s.stop("열차");
		
		System.out.println("==================================");
		Bus b = new Bus();
		b.start("버스");
		b.stop("버스");
		
		System.out.println("==================================");
		Biclycle bi = new Biclycle();
		bi.start("자전거");
		bi.stop("자전거");
		
		System.out.println("==================================");
		Plain p = new Plain();
		p.start("비행기");
		p.stop("비행기");
		
		
		Trans[] t = new Trans[4];
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Biclycle();
		t[3] = new Plain();
		
		System.out.println("************************************");
		String[] name = {"열차","버스","자전거","비행기"};
		for ( int i = 0; i < t.length; i++ ) {
			t[i].start(name[i]);
			t[i].stop(name[i]);
			System.out.println("************************************");
		}
//		Object[] name = { new Subway(), new Bus(), new Biclycle(), new Plain() };
//		String[] str = { "자전거", "버스", "지하철", "비행기"};
//		for ( int i = 0; i < t.length; i++ ) {
//			t[i] = (Trans)name[i];
//			t[i].show(str[i]);
	}
}

//문제 1] Trans 추상클래스 <-- 부모는 모든 자손에게 상속할 수 있는 최소한의 것
//추상메소드 start() / stop()
//
//public string name(String name) {
//	return name;
//}
//
//sub class : subway / bus / biclycle / plain
// MainEntry 에서 메인 함수 구현하기