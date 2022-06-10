package step04.abstractex;

public abstract class Computer {
	protected String ss = "a";

	abstract void display();

	public void turnOn() {
		System.out.println("전원 ON");
	}

	public void turnOff() {
		System.out.println("전원 OFF");
	}
}
