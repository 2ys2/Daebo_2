package Quiz;

import java.util.Scanner;

public class Quiz_IF {
	public static void main(String[] args) {

		/* ========== [ 문 제 1 ]=================================
		 * System.out.println("학점을 입력하세요 : "); int score = new
		 * Scanner(System.in).nextInt();
		 * 
		 * //nexInt(); 에서 입력 대기하므로 학점 입력이 위에 올라와야한다.
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); int score; score = sc.nextInt();
		 * 
		 * System.out.println("학점을 입력하세요 : ");
		 * 
		 * 
		 * if ( score >= 90 ) { System.out.println("A학점 입니다."); }else if ( score >= 80 )
		 * { System.out.println("B학점 입니다."); }else if ( score >= 70 ) {
		 * System.out.println("C학점 입니다."); }else if ( score >= 60 ){
		 * System.out.println("D학점 입니다."); }else { System.out.println("F학점 입니다."); }
		 */

		// || (= or) 사용
		/*
		 * if ( score <=100 && score >=90) else if ( score <=89 || score >=80)
		 */
		
		//=============================================================
		
		//===========[ 문 제 2 ]===============================
		
		System.out.println("국어 점수를 입력하세요 : ");
		int Kor = new Scanner(System.in).nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		int Eng = new Scanner(System.in).nextInt();
		
		System.out.println("전산 점수를 입력하세요 : ");
		int Com = new Scanner(System.in).nextInt();
		
		//double avg = (Kor + Eng + Com) / 3.0;
		//double avg = (double)(Kor + Eng + Com) / 3;
		
		
		if ( (Kor + Eng + Com) / 3 >= 60 ) {
			
			if ( Kor < 40 ) {
				System.out.println("국어 점수 과락으로 불합격 입니다.");
			}else if ( Eng < 40 ) {
				System.out.println("영어 점수 과락으로 불합격 입니다.");
			}else if ( Com < 40 ) {
				System.out.println("전산 점수 과락으로 불합격 입니다.");
			}else {
				System.out.println("합격 입니다.");
			} //in if end
			
		}else {
			System.out.println("불합격 입니다.");
		} // out if end
		
	}
}

//if ( avg >= 60 ) && ( Kor < 40 ) { System.out.printLn("국어 과락 불합격");}

/* if ( avg >= 60 ) { //3과목 평균 60점 이상
 * 		if ( Kor >= 40 && eng >= 40 && com >= 40) {
 * 			System.out.printf("모든 과목이 40점 이상이며, 평균이 %.3f로 [합격]입니다.\n", avg);
 			// %.3f 소수점 3자리
 		} else {
 			System.out.printf("평균이 %.1f 이지만, ", avg);
 			if ( Kor < 40 ) System.out.print("국어" + Kor + "점");
 			if ( Eng < 40 ) System.out.print("영어" + End + "점");
 			if ( Com < 40 ) System.out.print("전산" + Com + "점");
 			System.out.println("으로 [과락 탈락] 입니다.");
 			}
 		} else {
 			System.out.printf("평균이 %.1f로 [평균 미달 탈락]입니다\n", avg);
 		} // out if end
 */

/*
 * 문제] 점수 입력 받아서 평점(학점) 구하는 프로그램 작성 100~90 : A 89~80 : B 79~70 : C 69~60 : D
 * 59~0 : F
 * 
 * 문제2] 3과목(Kor, Eng, Com) 점수 입력 받아서 평균점수 60점이상이고, 각 과목 40점 이상이면 "합격", 평균 "불합격",
 * 각 과목 과락 "불합격"
 * 
 * 
 * 
 * 1. 변수 선언 2. 메세지 출력 및 입력받기 3. 처리(계산) 4. 결과출력(화면)
 * 
 */
