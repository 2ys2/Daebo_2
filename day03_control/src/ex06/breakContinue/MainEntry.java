package ex06.breakContinue;
import java.utill.Iterator;
public class MainEntry {
	public static void main(String[] args) {
		//break, continue
		
		
		for( int i = 1; i < 11; i++) {
			
			if ( i == 7 ) continue; // 시작점으로 돌린다. for -> 증감식으로, shile/do-while -> 조건식으로 이동
			System.out.println(i); // 7은 출력될 수 가 없다. 1~6, 8~10
		} // for end
		
		for (int i = 0; i < 101; i++) {
			
			if ( i % 2 == 0 ) continue; { //홀수만 출력됨
				System.out.println(i + "\t");
		} // end if
		} // end for
		
		
//		for( int i = 1; i < 11; i++) {
//			
//			if ( i == 7 ) break;
//			System.out.println(i);
//		} // for end
		
		
	} //main
} // class
