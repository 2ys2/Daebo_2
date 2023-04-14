package ex03.collection.map;

import java.util.*;

class ScoreMain implements Comparable<ScoreMain>{
	protected String name;
	protected int kor, eng, com, sum, rank ;
	protected double avg;
	protected char grade;
	
	public ScoreMain () {}

	public ScoreMain (String name, int kor, int eng, int com) { // 생성자함수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		setSum();
		setAvg();
		setGrade();
	}

	
	

	@Override
	public String toString() {
		return "*****" + name + "님의 성적표" + "*****\n"
				+ "국어 : " + kor + "점\n"
				+ "영어 : " + eng + "점\n"
				+ "전산 : " + com + "점\n"
				+ "총점 : " + sum + "점\n"
				+ String.format("평균 : %.2f\n평점(학점) : %c\n석차(등수) : %d\n", avg, grade, rank);
	}


	@Override
	public int compareTo(ScoreMain o) {
		return -Double.compare(avg, o.avg); //오름차순, - 붙으면 내림차순, 0 유지
	}


	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		sum = kor + eng + com;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = sum / 3.0;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {

		switch ( (int)avg / 10 ) { // 학점, 실수형 X int형변환
		case 10 :
		case 9 :
			grade = 'A'; break;
		case 8 :
			grade = 'B'; break;
		case 7 :
			grade = 'C'; break;
		case 6 :
			grade = 'D'; break;

		default:
			grade = 'F'; break;

		} // switch end
	}






}


