package step03.oop;

class A {
}

class B extends A {
}

class C extends A {
}

public class Instanceof {

	public static void main(String[] args) {

		A a1 = new B();
		A a2 = new C();
		A a3 = new A();

		System.out.println(a1 instanceof A); // t
		System.out.println(a1 instanceof B); // t
		System.out.println(a1 instanceof C); // f

		System.out.println();

		System.out.println(a2 instanceof A); // t
		System.out.println(a2 instanceof B); // f
		System.out.println(a2 instanceof C); // t

	}

}
