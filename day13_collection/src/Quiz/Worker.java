package Quiz;

import java.util.Scanner;


public class Worker extends Person {

	public Worker(int no, String name, String tel) {
		super(no, name, tel);
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		this.name = sc.nextLine();
		System.out.println("연락처를 입력하세요");
		this.tel = sc.nextLine();
		this.no = (int)(Math.random()*2000) + 1000;
		
	}
	

	public static void main(String[] args) {
//	Worker wk = new Worker();
	
	}
	
	
	
	

}
