package ex03.Quiz;

public class Subway extends Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 출발합니다.");

	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 도착했습니다. 내리실 문은 왼쪽입니다.\n승강장 사이가 넓으니 조심하시길 바랍니다.");
	}
}
