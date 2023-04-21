package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY);  // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10
//		우선순위 설정 ↑
		
//		t1.run(); // run()메소드 명시적으로 호출, 쓰레드 X
		t1.start(); // run() 메소드를 유도한다.
		t2.start(); // run() 메소드를 유도한다.
		t3.start(); // run() 메소드를 유도한다.
		
		
	}

}
