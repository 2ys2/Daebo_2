package ex02.runnable;

public class UserRunnable implements Runnable {

	String name;

	public UserRunnable(String name) {
		for (int i = 1; i <= 10; i++) {

			if ( i == 3 ) {
				try {
					Thread.sleep(1000); // 1 / 1000 -> 1초, 예외발생
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println(name);
			} // if end


			System.out.println(i);
		} // for end
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
