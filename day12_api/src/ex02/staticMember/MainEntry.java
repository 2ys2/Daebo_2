package ex02.staticMember;

class Atm {
	int count; // instance member
	static int total; // static memeber
	
	public Atm(int amount) { // constructor method <- 생성자
		count += amount;
		total += amount; // total = total + amount;
	}
	
	public static void view() { // static member에서 일반 멤버변수는 사용 할 수 없다.
		total = total + 100;
//		count = count + 100; // instance member 사용 불가
	}
	
	public static void show(int count, int total) { // static method에서 this 사용할 수 없다.
//		this.count = count; 
//		this.total = total; // this : 자기자신, 객체 생성될때 주소 -> static은 주소를 모름
	}
	
	public void display() {
		count += 50;
		total += 30;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
} // Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		
		Atm at = new Atm(1000);
		at.display(); // c : 1000, t : 1000
		System.out.println("---------------------------------------");
		Atm at2 = new Atm(1000);
		at2.display();// c : 1000, t : 2000
		System.out.println("---------------------------------------");
		Atm at3 = new Atm(1000);
		at3.display();// c : 1000, t : 3000
		
	}
}
