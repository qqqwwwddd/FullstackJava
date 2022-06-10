package step05.interfaceex;

public interface InterfaceEx {
	// 상수 : public static final
	// interface 에서는 상수만 사용! -> 대문자 , 메소드는 추상메소드만 사용
	int AGE = 25;

	// 메소드 : 추상메소드 - 코드블럭은 없음
	int getAge();

}
