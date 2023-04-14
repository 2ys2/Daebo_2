package ex02.Quiz;

public class Bus implements Trans {

	@Override
	public void start(String name) {
		System.out.println(name+" 출발합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name+" 도착합니다.");
	}

}

//@Override
//publice void move() {
//	while( speed < 5 ) {
//		speed += (accelerator * 5);
//		System.out.println("Accelerating..." + speed);
//		
//		try {
//			Thread.sleep(500);
//		} catch ( Exeption e ) {
//			e.printStackTrace();
//		}
//			
//		}
//	}
//}
//
//public void stop() {
//	speed = 0;
//	System.out.println("Emergency stop.....");
//}