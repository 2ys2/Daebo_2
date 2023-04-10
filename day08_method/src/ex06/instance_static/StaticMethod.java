package ex06.instance_static;


//	static method :  객체 생성 없이 바로 사용 가능함 ex) Math.random()
//	object.methodName();
//	ClassName.methodName();
//	A a = new A(); a <- 객체 생성, 메모리에 할당, 생성자함수 자동 호출

class A {
	int x, y;
	
	// static method
	public static void setData(int xx, int yy) { // static은 객체생성 안해도 부를수 있다
		System.out.println(xx + ", " + yy);
	}
} // A class end


public class StaticMethod { //StaticMethod
	public static void main(String[] args) {
		A a = new A();// a <- 객체생성, 메모리에 할당, 생성자함수 자동 호출
		
		A.setData(100,500); // 호출방법 ClassName.methodName();
		a.setData(20, 33); // 호출방법 object.methodName();
		
		
		a.x = 999;
		A.setData(3, 4);
	}
}
