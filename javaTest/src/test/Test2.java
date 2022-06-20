package test;

abstract class Animal {

	public Animal() {
	}

	public void cry() {

	}

	public void fly() {

	}
}

class Animal2 extends Animal {
	@Override
	public void fly() {
		super.fly();
		System.out.println("윙윙!");
	}
}

class Dog extends Animal {
	@Override
	public void cry() {
		super.cry();
		System.out.println("멍멍!");
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹!");

	}

}

class Cow extends Animal {
	@Override
	public void cry() {
		super.cry();
		System.out.println("음메!");
	}

}

public class Test2 {
	public static void main(String[] args) {

		// Test2 결과 출력하기
		/*
		 * 윙윙! 멍멍! 야옹! 음메!
		 */

		Animal2 dragonfly = new Animal2();
		dragonfly.fly(); // 윙윙!

		Dog dog = new Dog();
		dog.cry(); // 멍멍!

		Cat cat = new Cat();
		cat.cry(); // 야옹!

		Cow cow = new Cow();
		cow.cry(); // 음메!

	}
}
