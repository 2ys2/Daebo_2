package ex06.syncronized;


class Atm {
	private int money;

	public Atm(int money) { // 생성자 함수
		this.money = money;

	}

	// 입금 함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}

	// 출금 함수
	public void withdraw(int amount, String name) {
		synchronized(this) {
			if ( ( money - amount) > 0 ) {
						Thread.yield(); // 양보하는 함수, 양보하는 함수 있어도 동기화 돼서 제대로 작동함
			money -= amount;
			System.out.println(name + " : 출금금액 " + amount);
		} else {
			System.out.println(name + " : 출금못함(잔액 부족~~~~");
		}
	}
}


// 통장 잔고 함수
public void getMoney() {
	System.out.println(	"						잔액은 : "+money );
}
} // Atm end

class UserAtm extends Thread {

	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name); // <- 쓰레드가 가지고 있는 thread(Sting)사용한거 api 참조, 부모의 생성자함수 호출 super();
		this.obj = obj;
	}

	@Override
	public void run() { //스레드 실행부(구현부)
		for (int i = 0; i < 2; i++) {
			try { sleep(50); } catch (Exception e) { e.printStackTrace(); }

			if ( flag ) {
				obj.deposit((int)(Math.random()*10 + 2) * 100, getName());
			} else {
				obj.withdraw((int)(Math.random()*10 + 2) * 100, getName());
			} // if end

			flag = true;
			obj.getMoney(); //  잔고 확인

		} // for end
	} // run() end
} // UserAtm

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000); // 통장개설
		UserAtm user1 = new UserAtm(at, "박정희");
		UserAtm user2 = new UserAtm(at, "전두환");
		UserAtm user3 = new UserAtm(at, "노태우"); // 통장1개 사용자3명

		user1.start();
		user2.start();
		user3.start();

	}
}
