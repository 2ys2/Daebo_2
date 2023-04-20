package Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class BMISave {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean con = true;

		ObjectOutputStream oos = null;
		File f = new File("bmi.txt");
		FileOutputStream fos = null;
		
		

		try {
			fos = new FileOutputStream(f, true); // append mode
			oos = new ObjectOutputStream(fos);

			while (con) {

				oos.writeObject(id);
				
				
				oos.writeObject(ch);
				

				oos.writeObject(name);
				
				
				oos.writeObject(heigth);
				
				
				oos.writeObject(weigth);

				oos.writeObject(bmi);

				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					con = false;
				}

			} // while end

			System.out.println("bmi.txt  save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
			//			fos.close();
		} // try end
	}

}
