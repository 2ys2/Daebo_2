package ex03.Quiz;

public class Biclycle extends Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 출발합니다.");

	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 목적지에 도착했습니다.");

	}

}
