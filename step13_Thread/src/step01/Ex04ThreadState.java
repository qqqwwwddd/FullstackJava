package step01;

public class Ex04ThreadState {

	public static void main(String[] args) {

		// 첫번째 스레드
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				// run() -> 두번째 스레드 만들어짐
				Thread thread2 = new Thread(new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 100000000; i++) {
						}
						;
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				});

				while (true) {
					System.out.println(thread2.getState());
					// NEW -> Enum 타입
					if (thread2.getState() == thread2.getState().NEW) {
						// NEW 가 맞으면 실행할 수 있는 상태로 바뀌게 됨
						thread2.start();
						System.out.println(thread2.getState()); // 이 결과로 TERMINATED

					} else if (thread2.getState() == Thread.State.TERMINATED) {
						break;
					}

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread1.start();
	}

}
