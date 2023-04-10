package ex03.Quiz;

public class Bus extends Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 도착합니다. 하차시 태그해주세요.");
	}
}
