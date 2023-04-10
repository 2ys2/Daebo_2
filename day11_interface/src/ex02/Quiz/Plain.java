package ex02.Quiz;

public class Plain implements Trans {

	@Override
	public void start(String name) {
		System.out.println(name+" 이륙합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name+" 착륙합니다.");
	}

}
