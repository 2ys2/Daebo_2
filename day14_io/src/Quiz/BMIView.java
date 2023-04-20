package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMIView {

	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. 입력");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 출력");
		System.out.println("5. 저장");
		System.out.println("6. 불러오기");
		System.out.println("7. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BMIController bc = new BMIController();
		bc.Bload();
		while ( true ) {

			menu();
			String str = br.readLine();
			int n = Integer.parseInt(str);


			switch ( n ) {

			case 1:
				bc.Badd();
				break;
			case 2: 
				bc.Bdel();
				break;
			case 3:
				bc.Bedit();
				break;
			case 4:
				bc.Blist();
				break;
			case 5:
				bc.Bsave();
				break;
			case 6:
				bc.Bload();
				break;
			case 7:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("숫자 1 ~ 7 중에 다시 입력해주세요.");
			}
		}

	}
}
