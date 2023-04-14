package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

// Set : 순서없고, 중복 허용 X
public class HachSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();
			
			for ( int i = 0; i < objArr.length; i++ ) {
				set.add(objArr[i]);
			}
		System.out.println(set); 
		// [1, 1, 2, 3, 4]
		// 중복 제거, 1은 타입이 둘이 달라서 중복 아님.
	}
}