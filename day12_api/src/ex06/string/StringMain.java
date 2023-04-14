package ex06.string;

public class StringMain {
	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = " + x + ", y = " + y); // x = 3, y = 5
		x = y;
		System.out.println("x = " + x + ", y = " + y); //x = 5, y = 5
		
		String str1 = "korea";
		String str2 = "happy";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + ",\t"+str2.hashCode()); // hashcode : 102236330,	99047136
		
		str1 = str2;
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + ",\t"+str2.hashCode()); // hashcode : 99047136,	99047136
		
		str2 = "seoul";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + ",\t"+str2.hashCode()); // hashcode : 99047136,	109324212
		// 불변객체 옆에 공간을 새로 잡음 -> 메모리 낭비초래 
		// str2만 바꾸고싶은데 str1도 바뀔수도 있으니까 새로운 공간을 따로 잡는다. (보호차원)
		
		str2 = "korea";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + ",\t"+str2.hashCode()); // hashcode : 99047136,	102236330
		// 같은 글자는 같은 주소를 가르킴
		String str3 = "korea";
		System.out.println("str2 = " + str2 + ", str3 = " + str3);
		System.out.println("hashcode : " + str2.hashCode() + ",\t"+str3.hashCode()); // hashcode : 102236330,	102236330
		// 같은 글자는 같은 주소를 가르킴
		
		str3 = "doyeon";
		System.out.println("str2 = " + str2 + ", str3 = " + str3);
		System.out.println("hashcode : " + str2.hashCode() + ",\t"+str3.hashCode()); // hashcode : 102236330,	-1325836042
		
	}

}
