package ex01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.random());
		//Math.random ---> double 타입
		
		
		// Math.random() * n <---- 0 ~ n-1 값 추출됨
		System.out.println(Math.random()*5); // 0~4
		
		System.out.println((Math.random()*5)+1); //1~4
		
		System.out.println((Math.random()*5)+2); //2~6
		
		// 정수형
		System.out.println((int)(Math.random()*5)+2);
		
		// 1 ~ 100 까지
		System.out.println((int)(Math.random()*100)+1);
	}

}
