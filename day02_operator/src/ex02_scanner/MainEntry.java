package ex02_scanner;

//import 하는 3가지 방법
//import java.util.Scanner; 오류 마우스 클릭
//import java.util.Scanner; // shift + ctrl + o
import java.util.Scanner;

//예외 import java.lang.*; //내부적으로 자동으로 import

public class MainEntry {
	public static void main(String[] args) {
		
		//표준 입력 : System.in
		//표준 출력 : System.out
		Scanner sc = new Scanner(System.in); //객체생성, 메모리할당, 생성자함수자동호출
		
		System.out.println("정수 데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n\n입력 받은 수 : " + su);
	
		
		//Ctrl + / : 주석 설정/해제
		//Ctrl + Shift + / : 여러줄 주석 설정
		//Ctrl + Shift + \ : 여러줄 주석 해제
		
	}
}


/*
 * scanner
 * For example, this code allows a user to read a number from System.in:
 * Scanner sc = new Scanner(System.in);
 * int i = sc.nextInt();
 */
