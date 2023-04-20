package Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BMIController {
//	HashMap<Integer, BMI> B = new HashMap<>();
	ArrayList<BMI> Barr = new ArrayList<>();
	BMI bm;
	int idx;
	boolean con = true;

	public void Badd ( ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("이름을 입력하세요");
		String name = br.readLine().trim();

		System.out.println("키(cm)를 입력하세요");
		Double heigth = Double.parseDouble((br.readLine().trim()));

		System.out.println("몸무게(kg)를 입력하세요");
		Double weigth = Double.parseDouble((br.readLine().trim()));
		bm =  new BMI(name, heigth, weigth);
		Barr.add(bm);
		Bcal(heigth, weigth);

	}
	public void Bsave() throws IOException {

		File f = new File("bmi.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;


		try {
			fos = new FileOutputStream(f); // append mode
			oos = new ObjectOutputStream(fos);
			oos.writeObject(Barr);
			System.out.println("bmi.txt  save!!!");
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Bload() throws IOException {

		File f = new File("bmi.txt");
		f.createNewFile();
		FileInputStream fis = null;
		ObjectInputStream bis = null;

		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);

			Barr = (ArrayList<BMI>)bis.readObject(); // 형변환
			bis.close();
		} catch (Exception e) {

		}


	}

	public void Bcal( Double heigth, Double weigth ) {
		bm.setBmi();

		if ( bm.getBmi() < 18.5 ) {
			System.out.println("저체중 입니다.");
		} else if (bm.getBmi() < 22.9 ) {
			System.out.println(" 정상 체중 입니다.");
		} else if (bm.getBmi() < 24.9 ) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("비만입니다.");
		}
	}


	public void Blist() {
		
		for (int i = 0; i < Barr.size(); i++) {
			System.out.println(i + "번 " + Barr.get(i));
		}
	}

	public void Bdel ( ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("삭제하실 분의 index 번호를 입력하세요");
		int idx = Integer.parseInt(br.readLine().trim());
		Barr.remove(idx);


	}

	public void Bedit ( ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("수정하실 분의 index 번호를 입력하세요");
		idx = Integer.parseInt(br.readLine().trim());

		System.out.println("수정할 이름을 입력하세요");
		String name = br.readLine().trim();

		System.out.println("수정할 키를 입력하세요");
		Double heigth = Double.parseDouble(br.readLine().trim());

		System.out.println("수정할 몸무게를 입력하세요");
		Double weigth = Double.parseDouble(br.readLine().trim());
		
		Barr.get(idx).setName(name);
		Barr.get(idx).setHeigth(heigth);
		Barr.get(idx).setWeight(weigth);
		Barr.get(idx).setBmi();


	}

}
