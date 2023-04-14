package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person { // extends Object
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return name.hashCode() + age;
	}


} // Person end

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(new Person("doyeon", 33));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 37));
		set.add(new Person("David", 10));

		set.add(new String("happy"));
		set.add(new String("happy"));

		System.out.println(set);

		//		for ( Object obj : set ) {
		//			System.out.println( obj + " "+ obj.hashCode());
		//		}
	}

}
// hashcode 비교 해야하는 이유 -> 순서대로 진행되기 때문에...

//if (e.hash == hash &&
//((k = e.key) == key || (key != null && key.equals(k))))
//break;
//p = e;
