package Quiz;
import java.util.Scanner;
public class Score {

	Scanner sc = new Scanner(System.in);

	//멤버변수
	private String name;
	private int n, kor, eng, com, sum, rank;
	private double avg;
	private char grade;

	//getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getN() {
//		return n;
//	}
//	public void setN(int n) {
//		this.n = n;
//	}
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
		sum = kor + eng + com;
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		avg = (double)sum / 3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		
			switch ( (int)avg / 10 ) { // 학점, 실수형 X int형변환
			case 10 :
			case 9 :
				return grade = 'A'; 
			case 8 :
				return grade = 'B'; 
			case 7 :
				return grade = 'C'; 
			case 6 :
				return grade = 'D';

			default:
				return grade = 'F'; 

			} // switch end
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
//	public char getRank() {
//		return rank;
//	}
//	public void setRank(int rank) {
//		this.rank = rank;
//	}


	//user method - input, ouput

}
