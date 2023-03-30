package Quiz;

import java.util.*;

public class Quiz_IfSwitch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("범위를 벗어났습니다.");
			System.exit(0);
		}
		
		switch (score / 15) {
		case 5 :
		case 6 :
			System.out.println("상"); break;
		
		case 4 :
			System.out.println("보통"); break;
		
		default :
			System.out.println("노력"); break;
			
		}
	}
}

/*
문제] if, switch
점수를 0~100
100~75 점 까지 "상"
74~60 점 까지 "보통"
59~ 이하는 "노력요망"

		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/
