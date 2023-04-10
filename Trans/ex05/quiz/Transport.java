package ex05.quiz;

public abstract class Transport {  //추상클래스
	String start;
	String stop;
	
	public abstract void start(String trpt); //추상메소드
	public abstract void stop(String trpt);
	public abstract void display(String trpt);
	
}