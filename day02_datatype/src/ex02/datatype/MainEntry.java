package ex02.datatype;

public class MainEntry {
	
	static int Num; // 정수형 : 0, 실수형 : 0.0, 문자열 :  NULL
	static String str;
	
		public static void main(String[] args) { // 시작점(진입점)
			
			int y=99; // 지역변수(함수 내부에 선언)는 반드시 초기화 하고 사용한다.
			System.out.println(y); // 오류
			
			System.out.println("static valule : " + Num + "," + str);
			int su = 30;
			System.out.println(su); // 4byte
			System.out.println(100); // 4byte
			
			long num = 20;
			System.out.println(num);  // 8byte
			System.out.println(1000L); // 4byte인데 L,l 쓰면 8byte
			
			double d = 12.34;
			System.out.println(d); // 
			System.out.println(34.56); // double
			System.out.println(12.34f); // float
			
			/*
			float f = 12.34;  double로 인식했기 때문에 float 넣으려니 오류
			System.out.println(f);
			*/
			
			float f = 12.34F; // f, F 붙여줌으로써 float으로 인식 가능
			System.out.println(f);
			
			
		} // main end
} // class end
