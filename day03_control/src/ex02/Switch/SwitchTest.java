//*
package ex02.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.println("point = ? (1,2,3) ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) {
			case 1 : System.out.print("집 "); //break;
			case 2 : System.out.print("피아노 "); //break;
			case 3 : System.out.print("우산 "); break;
			
			default:
				System.out.println("없는 등수 입니다.");
				System.exit(0);
		}
		System.out.println("당첨을 축하합니다.");
	}
}

// break; 있으면 1개만 나오고, 없으면 중복 출력 가능 ---->

//*/