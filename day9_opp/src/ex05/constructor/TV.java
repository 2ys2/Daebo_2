package ex05.constructor;

public class TV {
	
	private int channer; //멤버변수
	private String color;
	
	public TV() {
		channer = 17;
		color = "black";
	}
	
	public TV(String color, int channer) { //매개변수 1개 생성자함수
		this.channer = channer;
		this.color = color;
	}
	
	public TV(String color) { //매개변수 1개 생성자함수
		this.color = color;
	}
	
	public TV(int channer) { //매개변수 1개 생성자함수
		this.channer = channer;
		color = "red";
	}
	
	
	//getter / setter method
	public void setData(int channer, String color) {
		this.channer = channer;
		this.color = color;
	}
	
	public int getChanner() {
		return channer;
	}
	public void setChanner(int channer) {
		this.channer = channer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//output method
	public void display() {
//		System.out.println(getChanner() + ", " + getColor());
		System.out.println(channer + ", " + color);
	}
	
}

/*
 > Constructor (생성자) 함수 - 멤버변수의 초기화
   - 클래스명과 동일하다.
     - 리턴타입 없음( void 조차 사용하지 않음 )
   - 중복정의 가능함( overload 가능 - 중복함수 )
   - default constructor 갖고 있음.
     (단, 사용자가 생성자 함수를 재정의 하면 디폴트 생성자 함수 기능 상실함)  
       
       
문제1] class TV {
	 color,  channel; 
	// setter / getter method
	// output 
       }
*/