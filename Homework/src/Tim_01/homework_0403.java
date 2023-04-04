package Tim_01;
import java.util.Scanner;
public class homework_0403 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int [] a;
			int n = sc.nextInt();


	        for ( int i = 0; i < n ; i++ ){
	        	
	            int k = sc.nextInt();
	            a = new int [k];

	            int sum = 0;
	            for ( int j = 0; j < k; j++) {
	                int score = sc.nextInt();
	                a[j] = score;
	                sum += a[j];
	            }

	            double avg = 0;
	            avg = (double)sum/k;

	            int count = 0;
	            for ( int j = 0; j < k; j++) {
	                if ( a[j] > avg ) {
	                    count++;
	                }
	            }

	            System.out.printf("%.3f\n", (double)count/k*100);
	            System.out.println("%");
	        }
			sc.close();
		}
	}

