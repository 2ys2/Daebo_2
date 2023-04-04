package homework;

public class Quiz1 {
	public static void main(String[] args) {
		
		
// [ 문제 3 ]
//		
//	while ( n < 10) {
//		
//		for ( n = 1; n < 10; n++ ) {
//			q1 = n
//			
//		}
//		
//		for ( n  = 2; n <= 10; n++ ) {
//			w1 = n
//		}
//		
//		result = q1 / w1
//	}
		
		
		double sum = 0;
		double result = 0;
	
		for ( int n = 1; n < 10; n++) {
			int a = n ;
			int b = n+1 ;
			
			sum = (double)a / b ;
			result += sum ;
		}
		
		System.out.printf("%.2f", result);
		
		
		
//[ 문제 2 ]
		
		int n = 0;
		int a = 0;
		int b = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for ( n = 1; n < 11 ; n++) {
			
			if ( n % 2 == 1) {
				a = -n;
				sum1 += a;
			} else {
				b = n;
				sum2 += b;}
			}
			System.out.println(sum1 + sum2);
			
		
		
		
[ 문제 1 ]		
		int sum = 0;
		
		for ( int i = 1; i < 6; i++ ) {
			for ( int j =1; j <=i; j++) {
				//System.out.println("i = "+i+"j = "+j);
				sum += j;
			}
		}
		System.out.println(sum);
		
		
	} // main end
} // class end


과제1] 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) = 35

과제2] (-1) +2 + (-3) + 4 + (-5) + … + (-9) + 10 = 5

과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = 7.07