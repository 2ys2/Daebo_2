package ex03.execption;

import java.util.*;
import java.util.Scanner;

public class TrowsMain {

	public static void main(String[] args) throws ArithmeticException, InputMismatchException {
		
		// throws Exception {
		// throws ArithmeticException, InputMismatchException { //예외처리 위임
			
			int x = 0, y, result;
			
			System.out.println("x, y = ");
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			
			result = x / y; //문제발생
			
			System.out.println(result);
		}
	}
