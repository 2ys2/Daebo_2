package ex03.collection.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VideoController extends Video{

	public VideoController() {}

	Scanner sc = new Scanner(System.in);
	int idx = 0;

	private HashMap<Integer, Video> vdmap = new HashMap<>();

	public void input(int num) {

		switch (num) {

		case 1:
			System.out.println("비디오 제목을 입력하세요");
			title = sc.nextLine().trim();
			System.out.println("장르를 입력하세요");
			category = sc.nextLine().trim();
			System.out.println("대여 여부를 입력하세요 대여 : 1 /미대여 : 2");
			lend = sc.nextLine().trim();

			break;
		case 2:
			System.out.println("비디오 제목을 입력하세요");
			title = sc.nextLine().trim();
			break;

		case 4:
			System.out.println("비디오 제목을 입력하세요");
			title = sc.nextLine().trim();
			System.out.println("장르를 입력하세요");
			category = sc.nextLine().trim();
			System.out.println("대여 여부를 입력하세요 대여 : 1 /미대여 : 2");
			lend = sc.nextLine().trim();


		default :

		}
	}


	public void addVideo() {
		idx += 1;
		vdmap.put(idx, new Video(title, category, lend));

	}

	public void delVideo() {

		Set set = vdmap.entrySet();
		for (Object o : set) {
			Map.Entry e = (Map.Entry)o;

			if ( title.equals(((Video)e.getValue()).getTitle()) ) {
				vdmap.remove(e.getKey());
				System.out.println("삭제했습니다.");
				return;
			}
		}
		System.out.println("해당하는 비디오가 없습니다.");
	}

	public void listVideo() {
		Set set = vdmap.entrySet();
		Iterator it = set.iterator();



		while ( it.hasNext() ) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getValue());
		}
	}

	public void editVideo() {

		Set set = vdmap.entrySet();
		for (Object o : set) {
			Map.Entry e = (Map.Entry)o;

			if ( title.equals(((Video)e.getValue()).getTitle())
					&& category.equals(((Video)e.getValue()).getCategory())
					) {// && lend.equals(((Video)e.getValue()).getLend()) ) {

				Video v = ((Video)e.getValue());

				System.out.println("변경된 비디오 제목을 입력하세요");
				title = sc.nextLine().trim();
				v.setTitle(title);

				System.out.println("변경된 장르를 입력하세요");
				category = sc.nextLine().trim();
				v.setCategory(category);

				System.out.println("변경된 대여 여부를 입력하세요 대여 : 1 /미대여 : 2");
				lend = sc.nextLine().trim();

				// lendVideo(lend); // 같은 클래스 내부라서 가져다 쓸 수 있음.

				char numL = lend.charAt(0);

				if ( numL == '1' ) {

					System.out.println("대여자를 입력하세요");
					lendName = sc.nextLine().trim();

					Date today = new Date();
					SimpleDateFormat datedate;
					datedate = new SimpleDateFormat("yy-MM-dd");
					lendDate = (String)datedate.format(today);

					v.setLendName(lendName);
					v.setLendDate(lendDate);

					vdmap.replace((Integer)e.getKey(), v );
					System.out.println("수정했습니다.");
					return;
				}
			}
			System.out.println("해당하는 비디오가 없습니다.");
		}
	}
}

//	public void lendVideo(String lend) {


//			Set set = vdmap.entrySet();
//			for (Object o : set) {
//				Map.Entry e = (Map.Entry)o;
//
//				if ( title.equals(((Video)e.getValue()).getTitle())
//						&& category.equals(((Video)e.getValue()).getCategory())
//						&& lend.equals(((Video)e.getValue()).getLend()) ) {
//
//					
//
//					System.out.println("수정했습니다.");
//					return;
//				}
//			}
//			System.out.println("해당하는 비디오가 없습니다.");
//		}




