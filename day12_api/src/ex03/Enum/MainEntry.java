package ex03.Enum;
/*
 enum 열거형 - 새로운 클래스 타입을 정의하는 것
 	- 특정한 값만을 가질 수 있는 데이터 타입을 정의 할 때 필요하다.
 형식
 	[ 접근지정자] enum 열거형이름 { 필요한 상수를 나열, ...}
 */

enum UserStatus {
	PENDING,
	ACTIVE,
	INAVTIVE,
	DELETE ;
}

public class MainEntry {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.State.BLOCKED);
//		1.
		System.out.println(UserStatus.DELETE);
		System.out.println("-----------------------");
//		2.
		for (UserStatus us : UserStatus.values()) {
			System.out.println(us);
		}

	}

}

//for (자료형 변수명 : 배열) { }

