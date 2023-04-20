package ex06.filecopy;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException { // 위임처리
//		읽기 객체 - FileInputStream
//		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Pictures\\singly_linkedlist.png"); //절대경로
//		InputStream is = new FileInputStream("C:/Users/KOSA/Pictures/singly_linkedlist.png"); //절대경로
		InputStream is = new FileInputStream("ca_spring23_cover.jpg"); //상대경로
		// byte 단위 - 낱개로 copy
//		쓰기 객체 - FIleOutputStream
		OutputStream os = new FileOutputStream("copy4.jpg");

		byte[] buffer = new byte[1024 * 8];
		
		long start = System.currentTimeMillis(); // 시작시간 저장
		
		while ( true ) {
			int inputDate = is.read(buffer); //  buffer 크기 만큼 읽어들임
			if ( inputDate == -1 ) break;
			os.write(buffer, 0, inputDate); // buffer 크기로 0부터 데이터만큼
		}
		
		long end = System.currentTimeMillis(); // 끝난시간 저장
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간

		is.close();
			os.close();
			
			System.out.println("copy success!!!");
	}

}



/*/
package ex06.filecopy;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException { // 위임처리
//		읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("ca_spring23_cover.jpg"); //상대경로
		// byte 단위 - 낱개로 copy
//		쓰기 객체 - FIleOutputStream
		OutputStream os = new FileOutputStream("copy.springcat.png");
		
		long start = System.currentTimeMillis(); // 시작시간 저장
		
		while ( true ) {
			int inputDate = is.read();
			if ( inputDate == -1 ) break;
			os.write(inputDate);
		}
		
		long end = System.currentTimeMillis(); // 끝난시간 저장
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간

		is.close();
			os.close();
			
			System.out.println("copy success!!!");
	}

}
*/