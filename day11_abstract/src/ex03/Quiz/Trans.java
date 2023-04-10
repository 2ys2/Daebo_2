package ex03.Quiz;

public abstract class Trans { // Super class
	
	public abstract void start(String name);
	public abstract void stop(String name);
	
	public String name(String name) {
		return name;
	}
}
