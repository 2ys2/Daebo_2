package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea")); // SkoreaUL 출력을 한거지 s2가 정말 바뀐건 아니다

		s2 = s2.replace("EO", "korea");
		System.out.println(s2);// 완벽히 바뀐다.
		System.out.println("========================================================");

		//		s1 = s1  + s2; 
		s1 = s1.concat(s2); // 같은 표현 s1 = s1  + s2; 
		System.out.println(s1);
		System.out.println("========================================================");

		String s3 = new String("		ab	cd		");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열의 길이
		s3 = s3.trim(); // 공백제거 단, 가운데 공백은 제거 X
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("========================================================");

		String s4 = new String("ab defgh 344546 kwierw 656758");
		//		String s4 = new String("ab/defgh/344546/kwierw/656758");
		String[] s5 = s4.split(" "); // 공백이 구분자 역할, "/"도 가능
		for ( int i = 0; i < s5.length; i++ ) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		System.out.println("========================================================");

		String s6 = "123-4567-8900";
		String[] s7 = s6.split("-");
		for ( int i = 0; i < s7.length; i++ ) {
			System.out.println(s7[i]);
		}
		System.out.println("========================================================");

		String s8 = "13423525agdgs 4534634 dfd  252452 dg  string";
		char ch = s8.charAt(8);
		System.out.println(ch);

		s8 = s8.substring(5,7); //5포함 7미포함
		System.out.println(s8);
		System.out.println("========================================================");

		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase()); // skoreaul
		System.out.println("대문자로 출력 toUpperCase() : " + s1.toUpperCase()); // HAPPYDOYEONSKOREAUL
		System.out.println(s2); // SkoreaUL, 진짜로 바뀌는거 아니고 출력만
		
		char[] ch2 = s1.toCharArray();
//		for (int i = 0; i < ch2.length; i++) { // ch2는 배열이라 길이 구하는 필드;
		for (int i = 0; i < s1.length(); i++) { //s1은 문자열이라 함수();
			System.out.print(ch2[i] + " "); //h a p p y d o y e o n S k o r e a U L 
		}
		
		

	}
}
