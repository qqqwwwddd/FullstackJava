package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {

		ArrayList<Integer[]> arr = new ArrayList<Integer[]>(Arrays.asList());
		arr.add(new Integer[] { 11, 12, 13, 14 });
		arr.add(new Integer[] { 21, 22, 23, 24 });
		arr.add(new Integer[] { 31, 32, 33, 34 });

		System.out.println(arr);

		// Test3 전체 요소 출력하기
		/*
		 * 11 12 13 14 21 22 23 24 31 32 33 34
		 */

		for (Integer[] arr1 : arr) {
			for (int j = 0; j < arr1.length; j++) {
//				System.out.print(arr1[j]);
				System.out.print(arr1[j] + " ");

			}
			System.out.println();
		}
		;

	}
}
