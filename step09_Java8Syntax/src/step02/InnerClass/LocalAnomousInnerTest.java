package step02.InnerClass;

class OutClass {
	int outNumber = 100;
	static int staticOutNumber = 200;

	// 지역 클래스
	Runnable getRunnable(int i) {
		int number = 100;

//		class MyRunnable implements Runnable {
		return new Runnable() {
			int localNumber = 10;

			@Override
			public void run() {

				// 외부 클래스
				System.out.println("외부 클래스, 인스턴스 변수" + outNumber);
				System.out.println("외부 클래스, static 변수" + staticOutNumber);

				System.out.println();
				//
//				i = 100;	//final : 값 변경되지 않음, 상수 풀 메모리에 계속 존재하는 것과 간ㅌ
//			number = 1000; // final

				// 따라서 getRunnerble 이라고 하는 메소드가 호출되어 끝났다 할지라도
				// run 메소드 내부에서 게속해서 호출을 사용 수 있음

				System.out.println("외부 클래스, 매개변수" + i);
				System.out.println("메소드, 지역변수" + number);
				System.out.println("지역 클래스, 인스턴스 변수" + localNumber);

			}

		};
	}
//		return new MyRunnable();
	// 어짜피 지역 클래스인데 외부에서 사용되지 않는다
	// 지역 클래스 -> 익명 클래스 : 12->13번라인, 34->35라인, 36번라인은 없어져도 됨

	// 익명 클래스
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변");
		}
	};
}

public class LocalAnomousInnerTest {
	public static void main(String[] args) {
		OutClass out = new OutClass();
		Runnable runner = out.getRunnable(10);
		runner.run();

		//

		out.runner.run();
	}

}
