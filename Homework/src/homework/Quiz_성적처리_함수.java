package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_성적처리_함수 {

	public static void main(String[] args) {

		//N명의 성적처리 배열 이용하기

		Scanner sc = new Scanner(System.in);

		//		학생 수 입력 받기
		System.out.println("학생 수를 입력하세요 : ");
		int n = sc.nextInt();
		sc.nextLine(); // 개행문자 삭제


		// 학생 이름 입력
		String[] name = new String[n]; 
		for ( int i = 0; i < n; i++) {
			System.out.println("이름을 입력하세요 : ");
			name[i] = sc.nextLine();			
		}
		output(name, n);

	} // end main


	public static int[][] input(String[] name, int n) { // 입력 함수 : 국어, 영어, 전산 점수
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[n][3]; // 국어, 영어, 전산 : 3

		for ( int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr[i].length ; j++ ) {

				switch ( j ) {
				case 0 : System.out.println( name[i] + "학생의 국어 점수를 입력하세요 : "); 
				arr[i][j] = sc.nextInt(); break;
				case 1 : System.out.println( name[i] + "학생의 영어 점수를 입력하세요 : "); 
				arr[i][j] = sc.nextInt(); break;
				case 2 : System.out.println( name[i] + "학생의 전산 점수를 입력하세요 : "); 
				arr[i][j] = sc.nextInt(); break;

				} // switch end
			} // j end
		} // i end
		return arr;

	}// input end


	public static int[] sum( int[][] arr ) { //총합 구하는 함수

		// 총합 구하기
		int[] sum1 = new int[arr.length];
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 0; j < arr[i].length; j++) {
				sum1[i] += arr[i][j];
			} // j end
		} // i end
		return sum1;
	} // sum end

	public static double[] avg( int[] sum ) { //평균 구하는 함수

		// 평균 구하기
		double[] avg1 = new double[sum.length];

		for ( int i = 0; i < sum.length; i++ ) {
			avg1[i] = (double)sum[i]/3;
		} // i end
		return avg1;
	} // avg end

	public static char[] grade( double[] avg ) { // 학점 구하는 함수

		char[] grade1 = new char[avg.length];

		for ( int i = 0; i < avg.length; i++ ) {
			switch ( (int)avg[i]/ 10 ) { // 학점, 실수형 X int형변환
			case 10 :
			case 9 :
				grade1[i] = 'A'; break;
			case 8 :
				grade1[i] = 'B'; break;
			case 7 :
				grade1[i] = 'C'; break;
			case 6 :
				grade1[i] = 'D'; break;

			default:
				grade1[i] = 'F'; break;

			} // switch end
		} // i end
		return grade1;
	} // grade end

	public static int[] rank( double[] avg ) { // 석차 구하는 함수

		int[] rank1 = new int[avg.length];

		double[] avg2 = Arrays.copyOf(avg, avg.length); // avg 정렬되지 않은 배열
		Arrays.sort(avg2); // 정렬된 배열

		// 석차
		for ( int i = 0 ; i < avg.length; i++ ) {
			for ( int j = 0; j < avg.length; j++ ) {
				if ( avg[i] == avg2[j] ) {
					rank1[i] = avg.length-j;  // 내림차순
				} // if end
			} // j end
		} // i end
		return rank1;
	}// rank end


	public static void output(String[] name, int n) { // 출력하는 함수

		int[][] arr = input(name, n);
		int[] sum = sum(arr);
		double[] avg = avg(sum);
		char[] grade = grade(avg);
		int[] rank = rank(avg);

		for ( int i = 0; i<arr.length; i ++) {
			System.out.println("*****" + name[i] + "님의 성적표" + "*****\n"
					+ "국어 : " + arr[i][0] + "점\n"
					+ "영어 : " + arr[i][1] + "점\n"
					+ "전산 : " + arr[i][2] + "점\n"
					+ "총점 : " + sum[i]);
			System.out.printf("평균 : %.2f\n평점(학점) : %c\n석차(등수) : %d\n", avg[i], grade[i], rank[i]);
			//		System.out.println(rank[i]);
			System.out.println("--------------------");

			//			System.out.println(sum); // 계속 사용가능 [I@1a407d53
			//			System.out.println(sum(arr)); // 일회성 출력 [I@5ebec15

		}

	}// output end
} // end class		




