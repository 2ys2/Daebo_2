package ex06.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true; // 1, 4, 5 출력
		
		firust : {
			second : {
				third : {
					
					int k = 100;
					System.out.println("Before the break"); // 1
					
					if ( flag ) break second; // break 식별자; 식별자 위치까지 탈출
					
					System.out.println("This won't execute"); // 2
					
				}// end third
				System.out.println("대보반 홧팅!!!"); // 3
			}// end second
			System.out.println("This is after second break!!!"); // 4
		} // end firust
		System.out.println("123456"); // 5
		
	} // main end
} // class end


//식별자1 : {
//	식별자2 : {
//		
//		break 식별자1; // break 식별자; 식별자 위치까지 탈출
//	}
//}
// 가장 가까운 식별자를 빠져나가는데 뒤에 붙여주면 해당 식별자를 벗어남
