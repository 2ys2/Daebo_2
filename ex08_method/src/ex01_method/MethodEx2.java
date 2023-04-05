package ex01_method;

public class MethodEx2 {

	//	4) 매개변수 있고, 리턴타입 있는 경우
	public static String name(int x, String irum) {
		System.out.println("x = " + x );
		return irum;
	}

	public static String display(int x, String name) {
		for ( int i = 0; i <= x ; i++ ) {
			System.out.print(name + "\t");
		}
		System.out.println();
		return name;
	}

	public static void main(String[] args) {
		System.out.println(display(10, "&"));
		String star = display(20, "*");
		System.out.println(star);
		
		System.out.println("=================================");
		String str = name(10, "doyeon");
		System.out.println(str);

		System.out.println("name() call : " + name(99, "gil dong"));
	}

}
