package Quiz;

import java.util.Scanner;

public class QuizEx02 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		sc.nextLine();
		// System.out.println("이름 : " + name);
				
		System.out.println("주소를 입력하세요 : ");
		String address = sc.nextLine();

		// System.out.println("주소 : " + address);
		
		System.out.println("연락처를 입력하세요 : ");
		String phone = sc.nextLine();

		// System.out.println("연락처 : " + phone);
		
		
		 System.out.println("\n\n 이름 : " + name +"\n 주소 : " + address + "\n 연락처 : " +
		 phone);
		 
		 //long su = sc.nextLong();
		 //String a = sc.next();
		
/*
 * 		Scanner sc = new Scanner(System.in); //객체생성, 메모리할당, 생성자함수자동호출
		
		System.out.println("정수 데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n\n입력 받은 수 : " + su);
 */

	}

}
