package ex05.sort;


public class BubbleSort {
	public static void main(String[] args) {
		
		int[] a = { 7, 3, 5, 2, 8 };
		int temp;
		
		
		System.out.println("sort 전 출력 : ");
		for ( int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + "\t");
		}
		
//		i = 0; i < a.length; i++
//		i = 0; i < a.length -i; i++
		
		// sort
		for ( int i = 0; i < a.length; i++ ) { //4
			for ( int j = 0; j < a.length-i-1; j++ ) { //4-i-1
				
				if( a[j] > a[j+1] ) { // 교환 - 부등호 방향에 따라 오름/내림차순
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} // end if
			} // j end
		} // i end
		
		System.out.println("\n\nsort 후 출력 : ");
		for ( int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + "\t");
		}
		
	} // main end
} // class end
