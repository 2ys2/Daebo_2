package Quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int dan = ((int)(Math.random()*100)+1);
		//System.out.println(dan);
		
		
		//for ( count <= 5)
		
		int count = 0;
		
		while ( count < 5 ) {		
			
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if ( num == dan ) {
				System.out.println(dan + " <--- 정답입니다."); break;
			}

		
			if ( dan > num ) {
				System.out.println("UP");
			}else if ( dan < num ) {
				System.out.println("Down");
			} // if end
			
			count++;
			
			if ( count == 5 ) {
				System.out.println("기회를 모두 소진하셨습니다. 답은 : " + dan + "입니다.");
			} // if end

				
		} //while end
		
	
		
	
		
	} // main end
} // class end

// 문제] up/down game
// 1~100 중에 난수 출력 dan = 난수값
// 답이 맞았으면 탈출
// 틀렸으면 기회 상실 및 답 출력하기