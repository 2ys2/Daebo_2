package ex00.Instanceof;

class A {	}
class B extends A {	}

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println("a instanceof A : " + (a instanceof A)); // true
		System.out.println("b instanceof A : " + (b instanceof A)); // true
		System.out.println("a instanceof B : " + (a instanceof B)); // false
		// 부모는 자손꺼 못 건들임
		
		System.out.println("b instanceof B : " + (b instanceof B)); // true
		//instanceof : 앞에있는 애들 뒤에있는애로 변환할수 있는지 T/F로 나타내는 함수
	}
}
