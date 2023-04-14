package ex05.wraper;

class Point {	}

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10); //Deprecated
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt); // 주소나옴
		System.out.println(pt.toString()); // 주소나옴
		
		System.out.println(Ia); // 10, 값이 나옴
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode())); // java.lang.Integer@a
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		y = x; // 묵시적형변환 8byte <- 4byte O
//		x = y; // 4byte <- 8byte X
		x = (int)y; // 명시적형변환 필요
		System.out.println(x + ", " + y);
		 
		//Boxing vs UnBoxing
		int c = Ia.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = Ib; // jdk 5.x 이후 부터 autoboxing, unboxing
		int num = Integer.parseInt(su);
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(Ia.MAX_VALUE); // 21억 ~
		System.out.println(Ia.MIN_VALUE); // -21억 ~
		
//		Double dd = 12.34;
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(dd.MIN_VALUE); // 4.9E-324
		
		System.out.println("========================");
		c = (int)dd.doubleValue();
		System.out.println("형변환 c의 값은? " + c);
		
		int e = Integer.parseInt("1234");
		int f = Integer.parseInt("1111111", 2);
		System.out.println(f);
		System.out.println(e+20);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // heap memory
		xx = yy; // autoboxing / unboxing ;지금은 그냥 써도 된다.
	}

}

/*
Wrapper class : 기본자료에 대응하는 class형 자료를 가지고 있다.
<기본자료형>	<클래스형(레퍼런스 또는 참조형)>
	int				integer
	float			Float
	double			Double
	char			Character
	...				...
*/