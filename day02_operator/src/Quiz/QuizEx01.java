package Quiz;

public class QuizEx01 {

	public static void main(String[] args) {
		
		/*
		int pay = 567890;
		
		
		int m = pay / 10000;
		int mn = pay % 10000;
		int ch = (pay % 10000) / 1000;		
		int ba = (pay % 1000) / 100;		
		int sh = (pay % 100) / 10;
		
		System.out.println("result : \n" + "만원 : " + m + "장");
		System.out.println("천원 : " + ch + "장");
		System.out.println("백원 : " + ba + "장");
		System.out.println("십원 : " + sh + "개");
		System.out.printf("%d %d", m, mn);
		
		*/
		
		//1. 변수 선언
		int pay = 567890;
		int man, chun, back, sip; //몫 저장변수
		int m_na, ch_na, b_na; //나머지 저장변수
		
		//2. 메세지 출력 및 입력받기		
		//3. 처리(계산)
		man = pay / 10000;	m_na = pay % 10000;
		chun = m_na / 1000;	ch_na = m_na % 1000;
		back = ch_na / 100;	b_na = ch_na % 100;
		sip = b_na / 10;
		
		//4.결과출력(화면) //소프트카피 = 화면출력, 하드카피 = 
		System.out.println("\n\n만원 : " + man
				+ "장\n천원 : " + chun
				+ "장\n백원 : " + back
				+ "개\n십원 : " + sip + "개");
		
		System.out.println("=====================================");
		System.out.println("10000 : " + (pay / 10000)
				+"장\n 1000 : " + (pay % 10000) / 1000
				+"장\n  100 : " + ((pay % 10000) % 1000) / 100
				+"장\n   10 : " + ((pay % 10000) % 1000) % 100 / 10 + "개"
				);
	}	
	
}
