package ex03.Quiz;

public class Plain extends Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 이륙합니다. 안전벨트를 매주시길 바랍니다.");

	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 착륙합니다. 즐거운 여행 되세요.");

	}
	
	
	

}
