package ex03.array;

 import java.util.Scanner;

public class QuizEx5 {
	public static void main(String[] args) {
		
		//7명의 성적처리 배열 이용하기
		
		Scanner sc = new Scanner(System.in);
		
		int n = 7;
		
		String[] name = new String[n];
		for ( int i = 0; i < n; i++) {
			System.out.println("이름을 입력하세요 : ");
			name[i] = sc.nextLine();			
		}
		
		int[][] a = new int[n][4];
		char[] grade = new char[n];
	
		
		for ( int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[i].length - 1 ; j++ ) {
				a[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		
		for ( int i = 0; i < a.length; i++ ) {
			for ( int j = 0; j < a[i].length - 1; j++) {
				a[i][3] += a[i][j];
		}
		
				switch ( (int)a[i][3] / 10 ) {
				case 10 :
				case 9 :
					grade[i] = 'A';
					break;
				case 8 :
					grade[i] = 'B';
					break;
				case 7 :
					grade[i] = 'C';
					break;
				case 6 :
					grade[i] = 'D';
					break;

				default:
					grade[i] = 'F';
					break;
			
				}
		}
		
		for ( int i = 0; i<a.length; i ++) {
		
		// 점수 출력
		System.out.println("*****" + name[i] + "님의 성적표" + "*****\n"
				+ "국어 : " + a[i][0] + "점\n"
				+ "영어 : " + a[i][1] + "점\n"
				+ "전산 : " + a[i][2] + "점\n"
				+ "총점 : " + a[i][3]);
		System.out.printf("평균 : %.2f\n평점(학점) : %c\n", (double)a[i][3]/3, grade[i]);
		System.out.println("--------------------");
		}
		
		
		
		
//		// 배열 출력
//		for ( int i = 0; i < a.length; i++ ) {
//			for ( int j = 0; j < a[i].length; j++ ) {
//				System.out.print(a[i][j] + " ");
//			} // i end
//			System.out.println();
//		} // j end

		
		
		
		
		
	} // end main
} // end class

