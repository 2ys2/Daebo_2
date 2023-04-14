package ex03.collection.map;

import java.util.Scanner;

public class ScoreView {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreController con = new ScoreController();

		while ( true ) {
			System.out.println("1. 성적 입력 2. 성적 출력 3. 종료");
			int num = sc.nextInt(); sc.nextLine();

			if ( num == 3 ) {
				System.out.println("종료합니다.");
				break;

			} // if end

			switch ( num ) {
			case 1:
				con.input();
				con.addScore();
				break;
			case 2:
				con.output();
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			} //switch end

		} // while end
	}
}

