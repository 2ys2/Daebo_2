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

package Quiz;

import java.util.Scanner;

public class Quiz_Switch {
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
		average = (double)score / 3;
		char grade = ' ';
		switch ( (int)average / 10 ) {  //실수형 올 수 없다.
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		
		default:
			grade = 'F';
			break;
			
	}
		
		System.out.println("*****" + name + "님의 성적표" + "*****\n"
				+ "국어 : " + kor + "점\n"
				+ "영어 : " + eng + "점\n"
				+ "전산 : " + com + "점\n"
				+ "총점 : " + score);
		System.out.printf("평균 : %.2f\n평점(학점) : %c", average, grade);	
		
		
		
	}
}

/*
package Quiz;

import java.util.Scanner;

public class Quiz_Switch {
	public static void main(String[] args) {
		
		
		System.out.println("당신이 받은 점수는? ");
		int jumsu = new Scanner(System.in).nextInt();
		
		//평점(학점 프로그램 작성

		
		switch ( jumsu / 10 ) {
			case 10 :
			case 9 :
				System.out.print("A");
				break;
			case 8 :
				System.out.print("B");
				break;
			case 7 :
				System.out.print("C");
				break;
			case 6 :
				System.out.print("D");
				break;
			
			default:
				System.out.print("F");
				break;
				
		} // switch end
		
		System.out.println(" 학점 입니다.");
	}
}
//*/