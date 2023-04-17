package ex04.set.set;
import java.util.*;
class HashSetEx1 {
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	
		}
		System.out.println(set);	
	}
}


// 중복배제, 자료형이 다르면 나올 수 있다. [1, 1, 2, 3, 4]