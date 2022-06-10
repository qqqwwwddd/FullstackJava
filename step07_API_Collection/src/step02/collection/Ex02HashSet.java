package step02.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSet {
	public static void main(String[] args) {

		// HashSet
		HashSet<String> set1 = new HashSet<String>();

		set1.add("Java");
		set1.add("Busan");
		set1.add("Study");
		set1.add("Happy");
		set1.add("Lazy");
		set1.add("Lazy");

		// for문 출력
		for (String v : set1) {
			System.out.println(v);
		}

		System.out.println();
		// iterator
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println();

		System.out.println("-----------");
		System.out.println(set1.isEmpty());
		System.out.println("Lazy");
		System.out.println("-----------");

		for (String v : set1) {
			System.out.println(v);
		}
		System.out.println("-----------");
		System.out.println(set1.contains("Busan"));
	}
}
