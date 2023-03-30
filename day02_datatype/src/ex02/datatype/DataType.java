package ex02.datatype;

public class DataType {
		public static void main(String[] args) {
			String str = "A"; // 문자열, " ", 2byte
			// String str2 = 'A'; 안됨 string은 문자열이여야함.
			char ch = 'A'; // 문자, ' ', 1byte
			char ch2 = 67; //
			char ch3 = 'b'; //
			int su = 20; String nickname = "happy"; double d = 12.34;
			
			System.out.println(ch); // A
			System.err.println(str); // A
			System.out.println((int)ch); // ASCII 65
			System.out.println(ch2 + ch3); //ASCII 코드 값이 있어서 연산 가능
			System.out.println("nickname = " + nickname);
			System.out.println("실수형 데이터 : " + d);
			//문자열은 나의 끝을 알리는 그림자를 달고다녀...?? %s  null 만날때까지 출력. "A"는 null 데리고 다님. \0 = null 	
		
		
		for (char i = 'A'; i <= 90; i++) {
			System.out.print( i + " "); // \t : tab key
		} //end for
		
		System.out.println("\n\n-------------------------------");
		
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print( (char)i + " ");
		} //end for
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
		// int b = flag; // error
		System.out.println(flag);
		
		}
}
