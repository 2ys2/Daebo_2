package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.println("str : " + str);
		
		char data[] = { 'a', 'b', 'c' };
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "cdefghij";
		System.out.println("korea " + msg);
		System.out.println(msg);
		
		//문자열에서 덧셈연산은 문자열결합이다
		
		msg = msg.concat(" korea"); // 문자열 결합
		System.out.println(msg); // cdefghij korea
		
		
		String str2 = "abcdef".substring(2);
		System.out.println(str2); // cdef
		
		str2 = "abcdefghi123456789jwxy".substring(2, 5); // 상한값 포함, 하한값 미포함
		System.out.println(str2); // cde
		
		System.out.println(msg + ", " + str2); //cdefghij korea, cde
		
	}

}
