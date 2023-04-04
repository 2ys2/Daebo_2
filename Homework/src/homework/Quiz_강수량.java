package homework;

//import java.util.Scanner;
import java.util.Random;
public class Quiz_강수량 {
	public static void main(String[] args) {

//		추가) 원하는 달(월)을 입력받아서 일수를 결정한다. (switch case)
//		if문으로 윤년 평년구분
		
//		System.out.println("배열 크기는 ? ");
//		int num = new Scanner(System.in).nextInt();
//		double[] arr = new double[num];
		
		int su = 30; double sum = 0; double avg = 0; // 유지보수 수월하게~
		
		double[] rain = new double[su]; // 공간의 크기라 30 은 int형
//		int[] rain = new int[su]; // 공간의 크기라 30 은 int형
//		int[] arr = new int[30];
		
		Random rand = new Random();
		
//		int i = 0;
//		double sum = 0;
//		int sum = 0;
		
		for ( int i = 0; i < su; i++) {
			rain[i] = rand.nextInt(100);
//			System.out.print((double)rain[i] + " ");
			sum += rain[i];
//			System.out.println(sum);
			avg = sum / rain.length;
		}
		
//		avg = sum / rain.length;
		System.out.printf("강수량 평균 : %.2f", avg);
		
			
		
	} // end main
} // end class



//문제] 기상청 출근했어요 (단, 특정월(4월) 30일 기준)
//	비가 온 날에 대한 강수량 평균(소수점 2자리까지 출력) 구하는 프로그램 작성
