package ex02.Quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Trans[] t = new Trans[3];
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Plain();
		
		String[] name = {"지하철", "버스", "비행기"};
		for ( int i = 0; i < t.length; i++ ) {
			t[i].start(name[i]);
			t[i].stop(name[i]);
			System.out.println("-------------------");
		}
	}
}
