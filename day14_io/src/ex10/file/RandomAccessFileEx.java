package ex10.file;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx throws FileNotFoungeException, IOException {

	public static void main(String[] args) {

		RandomAccessFile raf = new RandomAccessFile("sawson", "rw");

			for ( int i= 0; i<=10;  i ++ )
			{raf.seek(i * 100);
			String str = "hello";
			raf.writeUTF(str); 
//			raf.writeUTF(i); 
			}

			for ( int i= 0; i<=10;  i ++ )
			{raf.seek(i * 100);
			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
			}
			
			System.out.println("String print success!");
			raf.close();


		
		
		}
}