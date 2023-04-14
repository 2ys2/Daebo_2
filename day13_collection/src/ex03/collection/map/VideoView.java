package ex03.collection.map;

import java.util.Scanner;

public class VideoView {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VideoController vd = new VideoController();

		
		while ( true ) {
			System.out.println("1. Video 추가 2. Video 삭제 3. Video 리스트 출력 4. 수정 5. 프로그램 종료" );
			int num = sc.nextInt();
			sc.nextLine();
			
			if ( num == 5 ) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch ( num ) {
			
			case 1:
				vd.input(num);
				vd.addVideo();
				break;
			case 2:
				vd.input(num);
				vd.delVideo();
				break;
			case 3:
				vd.listVideo();
				break;
			case 4:
				vd.input(num);
				vd.editVideo();
				default :
					break;
			} // switch end
		} // while end

	}
}
