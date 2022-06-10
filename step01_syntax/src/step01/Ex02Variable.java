package step01;

public class Ex02Variable {

	public static void main(String[] args) {
		// 타입 변수명 = 값;
		// 기본타입 (primitive) 타입
		// 정수 : -2^(n-1) ~ 2^(n-1)-1
			// n : 비트 수
		
		byte vb1 = -128;
		// byte vb2 = 128; // !ERROR
		short vs1 = 128;
		
		// int (32)
		int vi1 = 10;
		int vi2 = 0B1010; // 2진수 :0B + 2진수
		int vi3 = 012; // 8진수 : 0 + 8진수
		int vi4 = 0XA; // 16진수 : 0X + 16진수
				
		long vl1 = 10;
		// long vl2 = 10000000000; //!ERROR : int로 인식 중
		// 자바에서 정수를 인식할 때, 기본 타입을 int로 인식
		long vl2 = 10000000000L; // 가능
		// 변수 사용 시 초기화 필수, 선언만 하고 사용 불가
		
		// 실수 : float(32), double(64)
		// float vf1 = 3.14; //!ERROR : 실수는 기본 형 double
		float vf1 = 3.14F;
		double vd1 = 3.14;
		
		// 문자 : char(16)
		char vc1 = 'A';
		char vc2 = 65;
		char vc3 = '\u0041';
		
		// 논리 : boolean(8)
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println(vc3); 
	}

}
