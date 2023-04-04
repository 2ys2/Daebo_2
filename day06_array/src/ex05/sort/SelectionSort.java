package ex05.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		int temp;
//		if( a]\ a)
		
		System.out.println("sort 전 출력");
		for ( int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + "\t");
		}
		
		for ( int i = 0; i < a.length; i++ ) {
			for ( int j = i+1; j < a.length; j++ ) { // i+1 맨 앞자리 제외
				if ( a[i] > a[j] ) { //교환 - 부등호 방향에 따라 오름/내림차순
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}// if end
			} //end j
		} //end i
		
		
		System.out.println("\n\nsort 후 출력 : ");
		for ( int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + "\t");
		}
		
		
		System.out.println("\n\n내림차순 - sort 후 출력 : ");
		for ( int i = a.length-1; i >= 0 ; i-- ) {
			System.out.print(a[i] + "\t");
		}
		
		
		
	} // main end
} // class end


//기준이 있다.
//작은것이 앞으로 온다.