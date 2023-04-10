package ex04.oop;

public class MainEntry {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("aaa");
		p.setAge(33);
//		p.setAddress("seoul");
//		p.setPhone("01012345678");
//		p.setWeight(100);
//		p.setHeight(200);
		
		
		System.out.println(p.toString());
		System.out.println(p);
	}

}
