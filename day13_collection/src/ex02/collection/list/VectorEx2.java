package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector<>(3, 5);

		v.addElement("자바"); //string
		v.addElement(new Double(10.2)); //double
		v.addElement(date); //object (객체)

		System.out.println("------------ 3개 객체 추가 ----------");
		System.out.println("size : " + v.size() +" , capacity : " + v.capacity());

		for ( i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("------------ 10개 객체 추가 ----------");
		System.out.println("size : " + v.size() +" , capacity : " + v.capacity());

		System.out.println("---------- Vector 내용 출력 ----------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}

		System.out.println("---------- 객체 내용 포함 확인 ----------");
		if ( v.contains("자바1")) System.out.println("자바 문자열 포함");
		else System.out.println("자바1 미포함");

		System.out.println("---------- 10.2 객체 위치는? ----------");
		System.out.println(v.indexOf(new Double(10.2))); // 1 나오면 맞음

		System.out.println("---------- 입력 시간 ----------");
		System.out.println(date);
		System.out.println(v.get(v.indexOf(date))); // indexOf 앞에서부터 찾기

		//		date object delete
		v.removeElementAt(v.lastIndexOf(date)); // lastIndexOf 뒤에서부터 찾기
		System.out.println("*******************************");
		System.out.println("size : " + v.size() +" , capacity : " + v.capacity());
		System.out.println(v); // [자바, 10.2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println("*******************************");
		for ( i = 0; i < v.size(); i++ ) {
			//			v.removeElementAt(i);
			//		}
			//		System.out.println("size : " + v.size() +" , capacity : " + v.capacity());
			//		System.out.println(v); // [10.2, 1, 3, 5, 7, 9]
			//		자바 사라지고 10.2가 앞으로 땡겨짐 1에 있던 0이 지워지고 1 앞으로 땡겨짐 
//			v.remove(i);
			v.remove(10.2);
			v.remove("자바");
//			v.removeAllElements(); // 전체 삭제
			
			
			for ( i = 0; i < v.size(); i++ ) {
				System.out.print(v.get(i)+ ", ");
			}
			System.out.println();
			System.out.println("*******************************");
//			v.setElementAt(enu, i);
			v.setElementAt("java", 2); //  3번째 위치에 java 문자열 추가
			
			enu = v.elements();
			while ( enu.hasMoreElements()) {
				System.out.print(enu.nextElement() + ", ");
			}
			
			System.out.println("*******************************");
			v.trimToSize();
			System.out.println("size : " + v.size() +" , capacity : " + v.capacity());
			
			System.out.println("*******************************");
			v.setSize(2);
			enu = v.elements();
			while ( enu.hasMoreElements()) {
				System.out.print(enu.nextElement() + ", ");
			
			}
			System.out.println("size : " + v.size() +" , capacity : " + v.capacity());
		}

	}
}