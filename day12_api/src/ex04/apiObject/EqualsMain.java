package ex04.apiObject;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if ( c1 == c2 ) System.out.println("같다.");
		else System.out.println("다르다."); // 다르다 값이 위치한 주소가 다름
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if ( x == y ) System.out.println("same"); // 같다
		else System.out.println("not same");
		
		System.out.println("참조형 자료형 비교");
		String str1 = new String("Korea");
		String str2 = new String("Korea");
		
		if ( x == y ) System.out.println("same"); // 같다
		else System.out.println("not same");
		
		System.out.println("------------------------------------------------");
		
//		내용을 비교하고 싶으면
		System.out.println("**** equals() method 비교 ****");
		if ( str1.equals(str2)) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("------------------------------------------------");
		
		System.out.println("**** equals() method 비교 ****");
		if ( str1.equalsIgnoreCase(str2)) System.out.println("same2222");  // 대소문자구분X
		
		else System.out.println("not same2222");
		
		
	}

}
