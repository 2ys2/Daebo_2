package Tim_01;

import java.util.Scanner;

public class homework_0329 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("x 좌표를 입력하세요 : ");	
		int x = sc.nextInt();
		
		// System.out.println("y 좌표를 입력하세요 : ");
		int y = sc.nextInt();
		
		if (( x > 0 ) && ( y > 0 )) {
			System.out.println("1");
		} else if (( x > 0 ) && ( y < 0 )) {
			System.out.println("4");
		} else if (( x < 0 ) && ( y > 0 )) {
			System.out.println("2");
		} else if (( x < 0 ) && ( y < 0 )) {
			System.out.println("3");
		}
	}
}
	

/*	
		1.변수 선언
		2.메세지 출력 및 입력받기		
		3.처리(계산)
		4.결과출력(화면)
		
*/