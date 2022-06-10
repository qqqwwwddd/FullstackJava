package step02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import lombok.Setter;
import model.domain.Student;

public class Ex03HashMap {
	public static void main(String[] args) {

		// HashMap(K:V)
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
//		HashMap<String, int> hm1 = new HashMap<String, int>();
//		int -> 기본타입은 불가능함

		// put : 저장
		hm1.put("a", 1);
		hm1.put("b", 2);
		hm1.put("c", 3);
		hm1.put("d", 4);
		System.out.println("put 저장: " + hm1);

		// get : key로 value 반환
		System.out.println("get 반환: " + hm1.get("a"));

		// remove : key
		hm1.remove("c");
		System.out.println("remove 삭제: " + hm1);

		// HashMap<String, Student>
		HashMap<String, Student> hm2 = new HashMap<String, Student>();

		hm2.put("k1", new Student("Java", 1, "Junior"));
		System.out.println(hm2);

		// hm2 -> grade 출력
		System.out.println(hm2.get("k1").getGrade());

		// HashMap<String, ArrayList>
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");

		HashMap<String, ArrayList<String>> hm3 = new HashMap<>();
		hm3.put("arr1", arr1);

		// c값이 출력되려면??
		System.out.println("hm3출력 : " + hm3);
		System.out.println(hm3.get("arr1").get(2));

		// HashMap<String, HashMap>
		HashMap<String, HashMap> hm4 = new HashMap<>();
		hm4.put("hm3", hm3);

		// b 출력?
		System.out.println("hm4출력: " + hm4);
		System.out.println(hm4.get("hm3"));
		System.out.println(((ArrayList) hm4.get("hm3").get("arr1")).get(1));

		// entrySet
		// key 를 모르는 상황에서 접근
		System.out.println(hm1.entrySet());
		Set<Entry<String, Integer>> entrySet = hm1.entrySet();
		System.out.println(entrySet);

		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
//			System.out.println(entryIterator.next());
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println("entry getKey 출력 : " + entry.getKey());
			System.out.println("entry getValue 출력 : " + entry.getValue());

			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " - " + value);

			// 키를 모르는 상황이라면?
			if (entry.getValue() == 2) {
				System.out.println(entry.getKey());
			}

		}
	}
}
