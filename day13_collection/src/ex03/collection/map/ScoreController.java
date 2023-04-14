package ex03.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreController extends ScoreMain{

	public ScoreController () {}
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<ScoreMain> arr = new ArrayList<>();
	
	
	public void input () {
		System.out.print("학생의 이름을 입력하세요 : ");
		name = sc.nextLine().trim();
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요 : ");
		com = sc.nextInt(); sc.nextLine();
	}
	
	public void addScore() {
		arr.add(new ScoreMain(name, kor, eng, com));
	}
	
	public void rank(  ) { // 석차 구하는 함수
		ArrayList<ScoreMain> copy = (ArrayList)arr.clone();
		copy.sort(null);
		
		for ( int i = 0; i < copy.size(); i++ ) {
			copy.get(i).setRank(i+1);
		}
		
		
	}// rank end
	
	public void output() {
		
		rank();
		for ( int i = 0; i < arr.size(); i++ ) {
			System.out.println(arr.get(i));			
		}
	}

} // ScoreController end

