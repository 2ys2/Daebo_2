package ex04.apiObject;

class Point {	}

public class MainEntry { // Object class
	
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Poinit pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("Object String : " + pt); // s.o.pln{pt); // 626b2d4a
		System.out.println("Object String : " + pt.toString());
		System.out.printf("10진수 주소 %d\n",0x626b2d4a);
		System.out.println("==========================================");
		
		Point pt1 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt1.getClass());
		System.out.println("hash code : " + pt1.hashCode());
		System.out.println("Object String : " + pt1); // s.o.pln{pt); // 626b2d4a
		System.out.println("Object String : " + pt1.toString()); // 기본으로는 16진수로 전환된 주소값을 나타낸다. 보통 문자열로 표현한 객체의 정보를 overrideing 한다....
		System.out.printf("10진수 주소 %d\n",0x626b2d4a);
		System.out.println("==========================================");
		
		System.out.println("pt1.toString : toString()의 의미");
		System.out.println(pt1.getClass().getName() + '@' + Integer.toHexString(pt1.hashCode()));
		
		Point pt2 = new Point();
		
		if(pt.hashCode() == pt.hashCode()) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		Point pt3;
		pt3 = pt;
		
		if(pt.hashCode() == pt3.hashCode()) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		line();
			
	}

	private static void line() {
		System.out.println("================================================");
		
	}
}
