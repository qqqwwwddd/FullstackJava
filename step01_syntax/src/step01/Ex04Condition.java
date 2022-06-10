/*	  조건문 : 주어진 조건이 참일 경우, 기능 수행
 *  1) if 문 
 *  	if(조건식) {
 *  			수행코드 ; 
 *  	} else if ( 조건식2 ) {
 *  			수행코드2 ; *  
 *  	} else {
 *  			수행코드3;
 * 	} 
 * 
 * 2) switch / case 문 
 * 	switch(변수명) {
 *			 case 조건1:
 *					수행 코드;
 *			. . . 
 *			default: 
 *				기본수행코드; 
 *
 * 		}
 *
 * */

package step01;

public class Ex04Condition {

	public static void main(String[] args) {
		// if 문 ) 관리자 id가 admin 혹은 admin2 일때 접속 성공 (단, else if) 사용하기

		String id = "admin";
		if (id.equals("admin")) {
			System.out.println("접속 성공");
		} else if (id.equals("admin2")) {
			System.out.println("접속 성공");
		} else {
			System.out.println("접속 실패");
		}

		// switch / case문 ) 1~3월 까지 해당 월을 비교 -> 해당 월이라면 " month 월 입니다 " 문구 출력
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("1월 입니다");
			break;
		case 2:
			System.out.println("2월 입니다");
			break;
		case 3:
			System.out.println("3월 입니다");
			break;
		default:
			System.out.println("해당 월 없습니다");

		}

	}

}
