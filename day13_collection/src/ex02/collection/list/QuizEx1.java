package ex02.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {

	protected String name;
	protected String address;
	protected String tel;

	public Customer(String name, String address, String tel) { // 생성자함수
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	//getter / setter method

	@Override
	public String toString() { // 출력
		return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

} // Customer end


public class QuizEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> cus = new ArrayList<>();


		while (true) {


			System.out.println("1. 고객추가 2. 고객삭제 3. 고객 리스트 출력 4. 수정 5. 종료");
			int num = sc.nextInt();
			sc.nextLine();

			if ( num == 5 ) break;

			switch ( num ) {
			case 1: 
				System.out.print("이름을 입력하세요 : "); String name = sc.nextLine();
				System.out.print("주소을 입력하세요 : "); String address = sc.nextLine();
				System.out.print("연락처를 입력하세요 : "); String tel = sc.nextLine();
				cus.add(new Customer(name, address, tel));
				System.out.println(cus);
				System.out.println();
				break;
			case 2:
				System.out.println("삭제할 고객의 index를 입력하세요");
				int idx = sc.nextInt();
				cus.remove(idx);
				System.out.println();
				break;
			case 3:

				for ( int i = 0; i < cus.size(); i++ ) {
					System.out.println( i + "번 " + cus);
				}
				System.out.println();
				break;

						case 4:
							System.out.println("변경할 고객의 index를 입력하세요"); int idx1 = sc.nextInt(); sc.nextLine();
							System.out.print("이름을 입력하세요 : "); String name1 = sc.nextLine();
							System.out.print("주소을 입력하세요 : "); String address1 = sc.nextLine();
							System.out.print("연락처를 입력하세요 : "); String tel1 = sc.nextLine();
							cus.set(idx1, new Customer(name1, address1, tel1)); // 객체생성이라서 new
							System.out.println();
				break;

			default : 
				System.out.println("1 ~ 4 중에 입력해주세요.");
				System.out.println();
				break;
			} // switch end
		} // while end



	} // main end
} // QuizEx1 end



//문제] Customer class
//name, address, tel field
//생성자함수, set/get method
//
//ArrayList or Vector 이용해서
//고객추가(switch) / 삭제(remove.Elements~) / 고객 리스트 출력 / 수정(set) / 프로그램 종료 출력하는 프로그램 작성하기