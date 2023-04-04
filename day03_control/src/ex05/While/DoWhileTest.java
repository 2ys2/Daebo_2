/*
package ex05.While;
 

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int su;
		char grade = ' ';
		
		
		do {
			System.out.println("당신의 점수 입력 요망 : ");
			su = new Scanner(System.in).nextInt();
		} while ( su < 0 || su > 101);
		
		
		//switch 예시로 변경
		switch ( su / 10) {
		case 10 :
		case 9 : grade = 'A'; break ;
		case 8 : grade = 'B'; break ;
		case 7 : grade = 'C'; break ;
		case 6 : grade = 'D'; break ;
		default: grade = 'F'; break ;
	}
		System.out.println("\n당신의 점수" + su + " ==> " + grade + "학점");

		
	}// main end
} // class end
//*/


/*/


package ex05.While;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int su;
		char grade = ' ';
		
		Scanner sc = new Scanner(System.in);
		

do {
	System.out.println("국어, 영어, 전산 순으로 점수 입력 요망 : ");
	int kor = sc.nextInt();
	int eng = sc.nextInt();
	int com = sc.nextInt();
	
} while ( kor < 0 || kor > 101) || ( eng < 0 || eng > 101) || ( com < 0 || com > 101);
{
	}

}// main end
} // class end

//*/
