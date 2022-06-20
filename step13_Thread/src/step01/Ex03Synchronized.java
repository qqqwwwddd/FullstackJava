package step01;

/*
 * 1. 하나의 멤버 변수를 갖는 클래스 -> setXXX를 통해 해당 멤버 변수를 변경
 * 단, 특정 값을 이미 갖고 있는 경우, 다른 스레드가 setXXX 수행하지 못하도록 !!!
 * 
 * 2. 각각 다른 스레드에서 setXXX 실행 -> 결과 ? 
 */

class NumberChange {
	int number;

//	public void setNumber(int number) {
	public synchronized void setNumber(int number) {
		if (this.number != 7) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.number = number;
			System.out.println(number);

		} else {
			System.out.println("number 값을 변경할 수 없음");
		}

	}

}

public class Ex03Synchronized {

	public static void main(String[] args) {

		NumberChange nc = new NumberChange();

		// 스레드 1
		// 익명 클래스
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNumber(7);
			}
		});

		// 스레드 2
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNumber(10);
			}
		});
		// 우선순위
		thread1.setPriority(10);
		thread2.setPriority(1);

		thread1.start();
		thread2.start();

		// main 스레드까지 3개 사용 중
		// NumberChange -> 스레드1 스레드2 공통으로 사용
		// 동기화 하나의 스레드가 접근하는 자원에 다른 스레드가 접근하지 못하게 하는 것

		// 공통으로 접근하는 멤버 변수의 경우에는 스레드 보장이 되지 않음!
		// -> 어떻게 해결해야 할까? (순서 보장?)
		// void 앞에 synchronized

	}

}
