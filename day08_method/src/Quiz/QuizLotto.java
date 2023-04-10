package Quiz;

import java.util.Arrays;
import java.util.Random;

public class QuizLotto {

	public static void init() {

		Random rand = new Random();

		int[] arr = new int[6];

		for ( int i = 0; i < 6; i++ ) {
//			for ( int j = 0; j < 6; j++ ) {
				arr[i] = ((int)(Math.random()*45)+1);

				if( isCheck(arr, i)) {
					i--; // 다시 뽑아라
				}
			}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));


	} // init end


	public static void main(String[] args) {
		init();
	}// main end


	//isCheck(int[] arr, int i) {}
	public static boolean isCheck(int[] arr, int i) {
		boolean flag = false; //같은 수가 없다고 가정

		for ( int j = 0; j < i ; j++ ) {
			if (arr[j] == arr[i] ) { // 같은 수가 있다면
			flag = true; // 있다는거 알려줌
			}
		}
		return flag;
	} // isCheck end
} // class end