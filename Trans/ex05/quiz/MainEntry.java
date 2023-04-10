package ex05.quiz;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		/* 
		 Transport []  t = new Transport[4];
		 t[0] = new Subway();
		 t[1] = new Bicycle();
		 t[2] = new Bus();
		 t[3] = new Airplane();
		 
		 String[] str = { "지하철", "자전거" , "버스", "비행기" };
		 
		 for (int i = 0; i < t.length; i++) {
			 t[i].start(str[i]);
			 t[i].stop(str[i]);
			 t[i].display(str[i]);
		}
		*/
		
		
		Scanner scan = new Scanner(System.in);

		int num;
		
		do {
			System.out.print("원하는 교통편의 숫자를 고르세요.(1.지하철 / 2.버스 / 3.자전거 / 4.비행기) : ");
			num = scan.nextInt();
			switch (num) {
				case 1 : 
					Transport tr = new Subway(); 
					tr.start("지하철");
					tr.stop("지하철");		
					tr.display("지하철"); break;
				
				case 2 : 
					tr = new Bus();
					tr.start("버스");
					tr.stop("버스");		
					tr.display("버스"); break;
				case 3 :
					tr = new Bicycle();
					tr.start("자전거");
					tr.stop("자전거");		
					tr.display("자전거");break;
				case 4 :
					tr = new Airplane();
					tr.start("비행기");
					tr.stop("비행기");		
					tr.display("비행기");break;
				default : System.out.println("숫자를 다시 입력하세요!");	
			} //switch
		} while (num != 1 && num != 2 && num != 3 &&num != 4);
		
	} //main end
}
