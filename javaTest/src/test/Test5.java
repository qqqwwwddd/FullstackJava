package test;

class Person1 {
	String name;
	int age;
	int weight;

	Person1() {
	}

	Person1(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void wash() {
		System.out.println("wash");
	}

	void study() {
		System.out.println("study");
	}

	void play() {
		System.out.println("play");
	}
}

interface Allowance {

	abstract void in(int price, String name);

	abstract void out(int price, String name);
}

interface Train {
	abstract void payTuitionFee(int tuitionFee, String name);
}

class Student1 extends Person1 implements Allowance, Train {
	Student1() {
	}

	Student1(String name, int age, int weight) {
		super(name, age, weight);
	}

	public void in(int price, String name) {
		System.out.printf("%s 에게서 %d원 용돈을 받았습니다.%n", name, price);
	}

	public void out(int price, String name) {
		System.out.printf("%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name);
	}

	public void payTuitionFee(int tuitionFee, String name) {
		System.out.printf("[%s --> %d원 입금완료]%n", name, tuitionFee);
	}
}

public class Test5 {
	public static void main(String[] args) {

		// Test5 결과 출력하기 & extends와 implements중에서 우선적으로 적용되는 것은 무엇인지 확인해보기
		/*
		 * wash study play 엄마 에게서 10000원 용돈을 받았습니다. 5000원 금액을 지출했습니다. [지출용도 --> 편의점]
		 * [훈련비 --> 50000원 입금완료]
		 */

	}
}
