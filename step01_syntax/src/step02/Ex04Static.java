// static (정적))
// - 클래스의 소속
//- 객체 생성 없이도 사용 가능
//- 사용 : 용 데이터 값 지정, 변수, 메소드 

package step02;

public class Ex04Static {
	// 멤버 변수와 static 멤버 변수
	String name;
	static String company;

	// static 초기화 블럭 : 코드별로 분류할때 사용 잘 안씀
	static {
		company = "busan";
	}

	// 절대 변하지 않는 수 = 상수 (final , static ) - 대문자, 언더바_
	static final double PI = 3.14;

	public Ex04Static(String name) {

		this.name = name;
	}

	public static void main(String[] args) {
		Ex04Static ppl1 = new Ex04Static("Java");
		System.out.println(ppl1.name);

		System.out.println(company); // null

		System.out.println(PI);

	}

}
