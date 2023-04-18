package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사칙연산 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(" su1 입력하세요 : ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.println(" su2 입력하세요 : ");
		int su2 = Integer.parseInt(br.readLine());
		System.out.println(" 연산자를 입력하세요 (+, -, *, /) ");
		char op = br.readLine().charAt(0);

		
		

		

			if ( su2 == 0 ) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			} else {
				


				Object result = 0;

				switch ( op ) {
			

			case '+':
				result = su1 + su2; break;
			case '-':
				result = su1 - su2; break;
			case '*':
				result =  su1 * su2; break;
			case '/':
			result = (double)su1 / su2; break;

			}// switch

				System.out.print("su1 = " + su1 + ", su2 = " + su2
						+ ", op = " + op + "\n"
						+ "result = " + result );
		}

	}
}


//문제1] 사칙연산 프로그램 작성하기 ( io객체 이용하기 )
//result > su1 = 3, su = 5, op = *, 3 * 5 = 15
