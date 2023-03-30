//*
package ex02.datatype;

public class DataType2 {
	//형변환
	public static void main(String[] args) {
		short sh = 3;
		int num = 50000;
		
		// 작은 자료형이 큰 자료형으로 형변환이 될때는 자동으로 형변환이 일어난다. : 묵시적형변환
		num = sh; // int(4byte) = short(2byte) 뒤에 있는걸 앞에 넣는다.
		System.out.println(sh + " : " + num);
		
//		num = -32769;
		num = 32770;
		// 큰 자료형을 작은 자료형에 넣으려면 명시적형변환이 있어야한다.
		// 데이터 손실이 발생 할 수 있다.
		sh = (short)num; // 명시적 형변환 (short) short(2byte) = int(4byte) 뒤에 있는걸 앞에 넣는다.
		System.out.println(sh + " : " + num);
	
	}
}
//*/

/*
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위(크기)를 벗어나지 않는다.
	public static void main(String[] args) {
		short sh = 32767; //short 범위 -32,768 ~ 32,767, short 2byte
		int num = 50000; // -21억 ~ 21억, int 4byte
		
		System.out.println(sh + " : " + num);
		
//		num = -32769;
		num = 32770;
		sh = (short)num; // 명시적 형변환
		System.out.println(sh + " : " + num);
	
	}
}
//*/
