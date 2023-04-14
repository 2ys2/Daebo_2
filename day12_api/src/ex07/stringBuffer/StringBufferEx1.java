package ex07.stringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 초기값 16?? 16byte??
		System.out.println(sb.hashCode());
		
		System.out.println("length        /        capacity");
		System.out.println(sb.length()+"        /        " + sb.capacity());
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "        /        "+size);
		
		
		sb.append("deabo");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "        /        "+size);
		
		sb.append("happyvirus");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "        /        "+size);
		
		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "        /        "+size);
		
		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "        /        "+size); // 70 = 34 + 배수 + 2(null)
		System.out.println(sb.hashCode()); //1865127310 주소 같다
		
		sb.trimToSize(); //용량크기 조절
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "        /        "+size); // 37
		
		
	}
}
