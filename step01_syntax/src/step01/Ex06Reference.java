/* 참조 타입
 * - 변수 -- 스택(stack),  객체 -- 힙(heap) 영역에서 생성
 * - 기본값 : null ( 데이터타입 x 하나의 값 자체로 인식)
 * 		-> 참조할 수 있는 객체가 없다 * 문제 발생 
 * 		-> NullPointerException(NPE) 발생
 * 
*/
package step01;

import java.util.Arrays;

public class Ex06Reference {

	public static void main(String[] args) {
		// 문자열 (String)
		// ==, equals

		String str1 = "Java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode());

		str1 = null;
//		System.out.println(str1);
//		// 참조할 객체가 없음
//		System.out.println(str1.hashCode()); // java.lang.NullPointException

		/*
		 * 배열(Array) : 데이터 값 여러가지를 한개의 변수에 대입 - 구조 : 타입[] 변수명 = {요소1, 요소2, . . .}; - 특징
		 * : 길이(사용 가능한 데이터 값의 갯수) 가 고정 - 종류 : 1차원, 다차원 배열
		 * 
		 */

		// 배열 선언 및 초기화
		int[] arr1 = { 1, 2, 3 };
		String[] arr2 = { "one", "two", "three" };

		int[] arr3;
//		arr3 = {4, 5, 6}; // 에러 나중에 사용할때는 new int 해주기 
		arr3 = new int[] { 4, 5, 6 };

		int[] arr4 = new int[3];

		// 2차원 배열
		// 배열은 고정된 크기 ! 크기 지정해주기
		int[][] arr11 = new int[3][4];

		// 배열 값 접근 : index - 0 부터 시작
		System.out.println(arr1[0]);
//		System.out.println(arr1[3]); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("------------");

		// 배열의 길이 : length
//		System.out.println(arr1.length); // 1,2,3 -> 3

		// 배열의 데이터 값?
//		System.out.println(arr1); //[I@15db9742 -> 주소값 배열 관련 변수 추적 

		// step01
//		for(int i = 0;  i < 3;  i++) {
//			System.out.println(arr1[i]);  // arr1[] 배열 안의 인덱스 값 
//		}

		// step02
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//			

		// step03
//			for ( int i : arr1 ) {
//				System.out.println(i);
//			}

		// 얕은 복사
		int[] arr5 = { 1, 2, 3 };
		int[] arr6 = arr5;

//		System.out.println(arr6[0]); // 1
//		System.out.println(arr5[0]); // 1
//		arr6[0] = 10;   // 1 -> {10, 2, 3}
//		System.out.println(arr6[0]); // 10
// 		System.out.println(arr5[0]); // 10
// 		// -> 10  arr6만 바꿨는데 왜 바귐?  

		System.out.println("-------------");

		// 깊은 복사
		int[] arr7 = { 1, 2, 3 };
		int[] arr8 = new int[arr7.length]; // arr7 길이 따라 변동 줄수 있게 동적으로 할당
		for (int i = 0; i < arr7.length; i++) { // 인ㄴ덱스번호복사해야하니깐 7 길이로
			arr8[i] = arr7[i];
		}

//		System.out.println(arr8[0]); // 1
//		System.out.println(arr7[0]); // 1
//		arr8[0] = 10;   
//		System.out.println(arr8[0]); // 10
//		System.out.println(arr7[0]); // -> 1 별개의 복사 됨 
//	

		// ETC
		// clone : 길이 까지 복사
		int[] arr9 = arr7.clone();
		for (int i : arr9) {
			System.out.println(i);
		}
		arr9[0] = 10;
		System.out.println(arr7[0]);

		// copyOf : 안에 있는 내용 복사, 길이는 지정 가능
		int[] arr10 = Arrays.copyOf(arr7, arr7.length);
		for (int i : arr10) {
			System.out.println(i);
		}

		System.out.println("-----구구단-------");

		// 구구단

		int[][] result = new int[9][9];
		for (int i = 0; i < result.length; i++) {
			System.out.println((i + 1) + "단");
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = (i + 1) * (j + 1);
				System.out.print((i + 1) + "x" + (j + 1) + "=" + result[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
