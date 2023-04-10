package ex07.argumentVariable;

public class MainEntry {

	public static void plus(int...x) { // 자료형이 같아야 한다.
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			//			System.out.print(x[i] + " ");
		}
		System.out.println("sum = " + sum);
	}


	public static void plus(String...x) { // 자료형이 같아야 한다.
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	public static void main(String[] args) {

		plus(1, 3);
		plus(200);
		plus(1, 2, 3, 4, 5 );
		plus(10,20,30,40,50,60,70,80);
		plus("kbs ", "mbc ", "sbs ");
		plus("a ", "b ", "c ", "asdfgasdfg ", "cbnnbc ");
	}
}

//	private static void plus(String string, String string2, String string3) {
//		// TODO Auto-generated method stub
//		
//	}

//	private static void plus(int i, int j, int k, int l, int m, int n, int o, int p) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j, int k, int l, int m) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}
