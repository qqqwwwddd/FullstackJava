package step02;

// 클래스와 객체
// - 설계
// 1. 데이터(멤버 변수, 필드) : name, age
// 2. 기능(메소드) : name, age 값 반환 / 단순출

public class Ex02People {
	// 멤버 변수 (필드)
	String name = "Java";
	int age = 27;

	// 생성자
	// 클래스의 이름과 동일 해야 함 !!!!
	// 반환값이 없음

	// 기본 생성자 : 객체 생성 시 , 필수 요소(생략 시 자동 생성 (기본생성자만 존재할 때 ))
	Ex02People() {
	}

	// 사용자 정의 생성자 : 객체 생성 시, 초기화 - 생성자 오버로딩(Overloading)
	// 반환 값, 형태는 같으나 매개 변수의 갯수가 다른 생성자를 만들 경우
	public Ex02People(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;

	}

	// 오버로딩
	public Ex02People(String name) {
		this.name = name;

	}

	// 메소드
	// name 반환 메소드
	// 1. 메소드명 : getName
	// 2. 반환값 유무 : return
	String getName() {
		return name;
	}

	// age 반환 메소드
	int getAge() {
		return age;
	}

	// 단순 출력 ("단순 출력 메소드") 메소드
	// 1. 메소명 : print
	// 2. 반환값 유무 : void ( 반환 타입 없음 )
	void print() {
		System.out.println("단순 출력 메소드");
	}

	public static void main(String[] args) {
		Ex02People ppl1 = new Ex02People();
		System.out.println(ppl1);
		System.out.println(ppl1.age);
		System.out.println(ppl1.getName());
//		System.out.println(ppl1.print());
		ppl1.print();

		// ppl1의 이름을 New Java 으로 변경하고자 한다면?
		ppl1.name = "New Java";
		System.out.println(ppl1.getName());

		// ppl2
		Ex02People ppl2 = new Ex02People();
//		System.out.println(ppl1.hashCode());
//		System.out.println(ppl2.hashCode());
		System.out.println(ppl2.name);
		ppl2.name = "New Java2";

		// ppl3
		Ex02People ppl3 = new Ex02People("Java3", 45);
		System.out.println(ppl3.name);

		// ppl4
		Ex02People ppl4 = new Ex02People("Java4");
		System.out.println(ppl4.name);
		System.out.println(ppl4.age);

	}

}
