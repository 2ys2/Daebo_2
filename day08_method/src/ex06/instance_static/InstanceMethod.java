package ex06.instance_static;


//- instance method : 객채 생성하고 사용해야함(메모리상에 할당이 되어야....)
//ex) Scanner sc = new Scanner(System.in); 
//     int x = sc.nextInt(); <--- nextInt() 등등,...
     
class B {
	int x, y;
	
	// instance method
	public void setData(int xx, int yy) { //static 안붙어 있는 형태 > 객체생성해서 불러야한다
		System.out.println(xx + ", " + yy);
	}
}// B class end


public class InstanceMethod {
	public static void main(String[] args) {
		
		 B b = new B(); // 객체생성, 메모리에 할당, 생성자함수 자동 호출
		 
		 b.setData(22, 55);
//		 B.setData(22, 55); <  static 아니라서 안됨?? non-static method setData
		
	}

}
