package step02.collection;

import java.util.ArrayList;

import model.domain.Student;

public class Ex01ArrayList {

	public static void main(String[] args) {
		// ArrayList
		ArrayList arr1 = new ArrayList();
		// add : 데이터 추가 메소드
		arr1.add("Java");
		arr1.add(new Student("Java", 1, "Junior"));
		arr1.add(3);
		arr1.add("Java");

		// get : 원소 객체를 반환
//		System.out.println(arr1.get(0));

		System.out.println(arr1);
		// -> [Java, Student(name=Java, stNo=1, grade=Junior), 3, Java]

		// size : 객체 수 반환
		System.out.println(arr1.size());

		// ??
		System.out.println(((Student) arr1.get(1)).getName());

		// 제네릭(Generic) : 컬렉션 객체 생성시, 저장되는 데이터 타입을 지정
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java1");
		arr2.add("Java2");
		arr2.add("Java3");
		arr2.add("Java4");
		arr2.add("Java5");
//		arr2.add(new Student("Java", 1, "Junior")); // 에러 

		// remove : 해당 인덱스에 있는 객체 삭제
		arr2.remove(2); // 3 삭제
		System.out.println(arr2.get(2)); // ->Java4 출력
		// ArrayList는 빈값 자동으로 매꿈
		// NullpointException 은 발생 안하겠지만 수시로 자료가 바뀔때 별로 안좋음

		// for 출력?

	}

}
