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
