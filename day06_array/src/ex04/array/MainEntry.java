package ex04.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		
		int[] a = new int[30];
		int[][] a2 = new int [2][3]; // 초기화 되어 있지 않을때는 행, 열크기 생략 할 수 없다.
		int[][] a3 = new int[][] {{1,2,3},{4,5,6,}};
//		int[][] a5 = {1,2,3,4,5,6,}; //error
//		int[][] a6 = new int[2][] {{1,2,3},{4,5,6,}}; // error
		int[][] a7 = {{0,},{0,}}; //{{0},{0}};
		
		int[][][] a8 = new int[5][2][3]; //[면][행][열]
		
		// 배열 길이(크기)
		System.out.println("1차원 배열 길이 : " + a.length);
		System.out.println();
		System.out.println("2차원 행 길이 : " + a2.length);
		System.out.println("2차원 열 길이 : " + a2[0].length);
		System.out.println();
		System.out.println("3차원 면 길이 : " + a8.length);
		System.out.println("3차원 행 길이 : " + a8[0].length);
		System.out.println("3차원 열 길이 : " + a8[0][0].length);
		System.out.println();
		
		
		// 임의적인 데이터 입력 받아서 배열 데이터값 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("면, 행, 열 순서대로 입력하세요 : ");
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
//		int x = 0;
		int[][][] a9 = new int[k][l][m]; //[면][행][열]
		
		for ( int i = 0; i < a9.length; i++ ) { System.out.println( i+1 + "번째 면");
			for ( int j = 0; j < a9[0].length; j++ ) {
				for ( int z = 0; z < a9[0][0].length; z++ ){
					a9[i][j][z] = (int)(Math.random()*100+1);
//					a9[i][j][z] = x+= 10; //10, 20, 30 ...
//					a9[i][j][z] = x++; //1, 2, 3 ...
//					a9[i][j][z] = new Random().nextInt(45) + 1; // 1 ~ 45 사이 값 추출됨. import 필요
					
					
					System.out.print(a9[i][j][z] + " ");
				} // end z
				System.out.println();
			} // end j
			System.out.println();
		} // end i
		
		
		
		
		
//		int[] arr = new int[100];
//		
//		for( int i = 0; i < arr.length; i++ ) {
//			//arr[i] = i + 1;
//			arr[i] = (int)(Math.random()*100)+2;
//			//arr[i] = (i + 1) * 5;
//			
//		}
//		for ( int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + "\t");
//		
//			if ( (i + 1) % 10 == 0 ) System.out.println();
//		}

	}
}