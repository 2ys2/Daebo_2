package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

//Set : 순서 없고, 중복 허용 X
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");

		System.out.println("요소 개수 : " + hs.size()); //4 <- 중복 허용X
		System.out.println(hs); // [컵, 볼펜, 키보드, 마우스] <- 순서 X

		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string"); //The method add(Integer) in the type HashSet<Integer> is not applicable for the arguments (String)

		HashSet hs3 = new HashSet<>();
		hs3.add(10.0);
		hs3.add(3);
		hs3.add(100);
		hs3.add("string");
		
		
		Iterator it = hs.iterator();
		while ( it.hasNext() ) { // 다음 요소가 있다면 ... hasNext 추상메소드
			System.out.println(it.next()); // 요소를 꺼내와서 출력해줘... next 추상메소드
		}
		System.out.println();
		
		it = hs3.iterator();
		while ( it.hasNext() ) { // hasNext 추상메소드
			System.out.println(it.next()); // next 추상메소드
		}
		
		
	}
}
