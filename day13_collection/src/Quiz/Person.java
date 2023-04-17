package Quiz;

public class Person {
	
	
	protected String name;
	protected int no;
//	protected final int no;// 바꿀수 없음
//	protected static int count = 0;
	protected String tel;
	
	public Person(int no, String name, String tel) { // 생성자 함수
		this.no = no;
		this.name = name;
		this.tel = tel;
		
	}

	@Override
	public String toString() {
		return "no." + no + " name : " + name + " tel : " + tel;
	}
	
	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public static int getCount() {
//		return count;
//	}
//
//	public static void setCount(int count) {
//		Person.count = count;
//	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
}
