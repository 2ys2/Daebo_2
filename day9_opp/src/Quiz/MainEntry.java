package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		input();
		



	} // main end

	public static void input() { // 입력 함수 : 국어, 영어, 전산 점수
		Scanner sc = new Scanner(System.in);
		Score score = new Score();



//		System.out.println("학생 수를 입력하세요 : ");
//		score.setN(sc.nextInt());
//		sc.nextLine();


		// 학생 이름 입력
//		for ( int i = 0; i < score.getN(); i++) {
			System.out.println("이름을 입력하세요 : ");
			score.setName(sc.nextLine());			
//		}

		// 국어, 영어, 전산 : 3
		System.out.println( "국어 점수를 입력하세요 : "); 
		score.setKor(sc.nextInt());
		System.out.println( "영어 점수를 입력하세요 : "); 
		score.setEng(sc.nextInt());
		System.out.println( "전산 점수를 입력하세요 : "); 
		score.setCom(sc.nextInt());
		
		
		
		System.out.println("*****" + score.getName() + "님의 성적표" + "*****\n"
				+ "국어 : " + score.getKor() + "점\n"
				+ "영어 : " + score.getEng() + "점\n"
				+ "전산 : " + score.getCom() + "점\n"
				+ "총점 : " + score.getSum() + "점\n"
				+ "평균 : " + score.getAvg() + "점\n"
				+ "평점(학점) : " + score.getGrade());
		//		} // i end
		//		for ( int i = 0; i < score.getN(); i++) {
		//			System.out.println( i + "번째학생의 국어 점수를 입력하세요 : "); 
		//			score.setKor(sc.nextInt());
		//			System.out.println( i + "번째학생의 영어 점수를 입력하세요 : "); 
		//			score.setEng(sc.nextInt());
		//			System.out.println( i + "번째학생의 전산 점수를 입력하세요 : "); 
		//			score.setCom(sc.nextInt());
		//		} // i end
	}// input end
} // class MainEntry end