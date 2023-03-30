package Quiz;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, com, score;
		double average;
		
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		System.out.println("전산 점수를 입력하세요 : ");
		com = sc.nextInt();
		
		
		score = kor + eng + com;
		average = score / 3;
		
		
		System.out.println("*****" + name + "님의 성적표" + "*****\n"
							+ "국어 : " + kor + "점\n"
							+ "영어 : " + eng + "점\n"
							+ "전산 : " + com + "점\n"
							+ "총점 : " + score + ", " + "평균 : " + average
							);		
	}

}


/*
문제] 이름 입력 받고, 국어, 영어, 전산 점수 입력 받아서
		총점, 평균까지 구하는 프로그램 작성

		이도연님의 성적표**************
		국어 : 100점, 영어 : 100점, 전산 : 100
		총점 : 300, 평균 : 100.0 (double)
		
		
		1.변수 선언
		2. 메세지 출력 및 입력받기		
		3. 처리(계산)
		4.결과출력(화면)
		
*/
