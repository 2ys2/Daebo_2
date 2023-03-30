package ex02.datatype;

public class DataType3 {
	//진법
	public static void main(String[] args) {
		int su = 10;
		System.out.println("10진수 : " + su); // %d, %o, %x, %X
		// %d : 10진수, %o : 8진수, %x : 16진수 소문자, %X : 16진수 대문자
		System.out.printf("10진수 : %d\n", su);
		System.out.printf(" 8진수 : %o\n", su);
		System.out.printf("16진수 : %x %X\n", su, su);
		
		// 0숫자 ---> 8진수, 0x숫자 ---> 16진수
		System.out.printf("%d\n", 012); // 012(8진수) ---> 10진수 출력
		System.out.printf("%d\n", 0xA); // 0xA(16진수) ---> 10진수 출력
		System.out.println("---------------------------------");
		
		double f = 12.34;
		System.out.println(f);
		float ff = 5.6f;
		System.out.println(ff);
	}
}


/*
 *  0~9
 *  10진수 : 0 1 2 3 4 5 6 7 8 9  (0에서 9까지 숫자로 조합 되는 것이 10진수)
 *  10 11 12 13 14 15 16 17 18 19 (1과 0이 조합 1과 1이 조합...)
 *  20 21 22 23 24 25 26 272 8 29 (2와 0이 조합 2와 1이 조합...)
 *  
 *  0~7
 *  8진수 : 0 1 2 3 4 5 6 7
 *  10 11 12 13 14 15 16 17
 *  20 21 22 23 24 25 26 27
 *  
 *  0~15 (0~9,a,b,c,d,e,f)
 *  16진수 : 0 1 2 3 4 5 6 7 8 9 a b c d e f
 *  10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f
 *  ... 2a 2b 2c 2d 2e 2f
 *  
 *  10 표현
 *  10진수 : 10
 *  8진수 : 12
 *  16진수 : 0xa
 *  2진수 : 0000 0000 1010
 */