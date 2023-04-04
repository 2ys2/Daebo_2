package homework;

 import java.util.Arrays;
import java.util.Scanner;

public class Quiz_성적처리_석차 {
	public static void main(String[] args) {
		
		//N명의 성적처리 배열 이용하기
		
	
		Scanner sc = new Scanner(System.in);
		
//		String[] message = new String[] {"no", "name", "kor"};
		
		System.out.println("학생 수를 입력하세요 : ");
		int n = sc.nextInt(); // 학생 수 입력 받기
		sc.nextLine(); // 개행문자 삭제
//		int n = 4; // 학생 수
		
		// 학생 이름 입력
		String[] name = new String[n]; 
		for ( int i = 0; i < n; i++) {
			System.out.println("이름을 입력하세요 : ");
			name[i] = sc.nextLine();			
		}
		
		int[][] a = new int[n][4]; // 국어, 영어, 전산, 총합 : 4 
		char[] grade = new char[n]; // 학점
	
		
		// 점수 랜덤으로 받기 ( 0 ~ 100 )
		for ( int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[i].length - 1 ; j++ ) {
				a[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		// 총합, 평균 구하기
		int[] avg = new int[n];
		int[] rank = new int[n];
		for ( int i = 0; i < a.length; i++ ) {
			for ( int j = 0; j < a[i].length - 1; j++) {
				a[i][3] += a[i][j];
				avg[i] = a[i][3]/3;
		} // j end
			
			
			// 전체 총합
			// 전체 평균
			
			int[] avg2 = Arrays.copyOf(avg, avg.length); // avg 정렬되지 않은 배열
			Arrays.sort(avg2); // 정렬된 배열
			// 석차
			for ( int x = 0 ; x < n; x++ ) {
						for ( int y = 0; y < n; y++ ) {
							if ( avg[x] == avg2[y] ) {
								rank[x] = n-y;  // 내림차순
							} // if end
						} // j end
			} // i end
			
		// 학점
				switch ( (int)avg[i]/ 10 ) { // 학점, 실수형 X int형변환
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
		} // i end
		
		
		// 점수 출력
		for ( int i = 0; i<a.length; i ++) {
		System.out.println("*****" + name[i] + "님의 성적표" + "*****\n"
				+ "국어 : " + a[i][0] + "점\n"
				+ "영어 : " + a[i][1] + "점\n"
				+ "전산 : " + a[i][2] + "점\n"
				+ "총점 : " + a[i][3]);
		System.out.printf("평균 : %.2f\n평점(학점) : %c\n석차(등수) : %d\n", (double)avg[i], grade[i], rank[i]);
//		System.out.println(rank[i]);
		System.out.println("--------------------");
		}
		
		
	} // end main
} // end class		
		
		
//		// 배열 출력
//		for ( int i = 0; i < a.length; i++ ) {
//			for ( int j = 0; j < a[i].length; j++ ) {
//				System.out.print(a[i][j] + " ");
//			} // i end
//			System.out.println();
//		} // j end

	
		

