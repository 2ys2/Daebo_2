package ex01_operator;

public class OperatorTest {
	
	//최단산쉬관논삼대콤
	public static void main(String[] args) {
		//관계연산자 : >, <, >=, <=, == (같다), != (같지않다)
		
		int x = 20, y = 20;
		
		if( x != y )
			System.out.println("같지 않습니다.");
		else
			System.out.println("같습니다.");
		
		if ( x == y) System.out.println("같습니다.");
		else System.out.println("같지 않습니다.");

	}

}

/*
//최단산쉬관논삼대콤
public static void main(String[] args) {
	//shift 연산자 : <<, >>, <<<
	int x = 8, result;
	
	// result = x << 2; //lesft shift : 원래값 * 2^bit수 ---> 8 * 2^2 = 32
						// ex) 0000 1000 > 0010 0000 : 8 > 32
	
	result = x >> 3; //right shift : 원래값 / 2^bit수 ---> 8 / 2^3 = 1
					 // ex) 0000 1000 > 0000 0001 : 
	
	// System.out.println("left shift result : " + result); // 32
	System.out.println("right shift result : " + result); // 1
*/
