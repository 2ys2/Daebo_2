package ex03.collection.map;

import java.util.Date;

public class VideoMain {
	
}

class Video {
	public String title;
	public String category;
	public String lend;
	protected String lendName;
	public String lendDate;

	public Video() {}
	public Video(String title, String category, String lend) { //생성자 함수
		this.title = title;
		this.category = category;
		this.lend = lend;
	}

	
	@Override
	public String toString() {
		
		return "제목 : " + title + ", 장르 : " + category + ", 대여 여부 : " + lend + ", 대여자 : " + lendName + ", 대여 날짜 : " + lendDate;
		// ", 대여자 " + lendName + ", 대여 날짜" + lendDate
	}
	
	// getter / setter
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	
	public String getLend() {
		return lend;
	}


	public void setLend(String lend) {
		this.lend = lend;
	}


	public String getLendName() {
		return lendName;
	}
	
	
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		return lendDate;
	}


	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	
	
}



//문제] Video class
//title 비디오제목
//category 장르
//lend 대여여부
//lendName 대여자(고객명)
//lendDate 대여일자(오늘날짜 입력) date
//
//Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료
//출력하는 프로그램 작성하기.