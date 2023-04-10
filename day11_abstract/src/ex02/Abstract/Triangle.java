package ex02.Abstract;

public class Triangle extends Shape {
	
	int w = 10;

	@Override
	public double calc(double x) {
		result = (x * w) / 2.0 ;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0); // result가 같은 변수라 생략, 다르면 a = calc(9.0); 이런식으로 변수지정해줘야함.
		System.out.println(result + " 크기의 " + name + "이 그려졌습니다.");
	}
}
