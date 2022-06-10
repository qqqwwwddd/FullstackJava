// 반복문 (Loop)

package step01;

public class Ex05Loop {

	public static void main(String[] args) {
		// for 문
		// 5 ~ 1 출력
		for(int i = 5; i >= 1; i--) {
//			System.out.println(i);
		}
		
		// while문
		// 1 ~ 5 출력
		int i1 = 1; 
		while(i1 <= 5) {
//			System.out.println(i1);
			i1++;
		}
		
		// do ~ while 
//		int i2 = 1;
//		do {
//			System.out.println(i2);
//			i2++;
//		}while( i2 <= 5 );
		
		
		
		// ? 구구단 출력 ? 
		
		for(int i = 1; i <= 9; i++ ) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println("--------------");
			
		}
		
		
	}

}
