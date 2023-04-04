package Quiz;

import java.util.Random;

public class QuizLotto {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		for ( int i = 0; i < 6 ; i++ ) {
			for ( int j = 0; j < 6 ; j++ ) {
				int lo = ((int)(Math.random()*45)+1);
				
				
				
				System.out.print( lo +" " );
			} // j end
			System.out.println();
		}// i end
		
	} // main end
} // class end

// 로또 프로그램
// 1 ~ 45까지 숫자 중 6개 추출
// 한 세트 내에 중복 숫자 제거  ---> ???
