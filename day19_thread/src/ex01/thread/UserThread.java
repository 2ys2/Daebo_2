package ex01.thread;

public class UserThread extends Thread {

	
	String name;
	public UserThread(String name) {
		this.name = name;
//		System.out.println("UsetThread constructor" + name);
		
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			if ( i == 3 ) {
				try {
					sleep(1000); // 1 / 1000 -> 1초, 예외발생
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println(name);
			} // if end
			
			
			System.out.println(i);
		} // for end
	}
}
