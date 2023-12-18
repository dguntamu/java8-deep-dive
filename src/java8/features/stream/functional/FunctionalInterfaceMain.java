package java8.features.stream.functional;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		Test t = () -> System.out.println("@FunctionalInterface implemented");
		t.implementMe();
		t.defaultMethod();
		Test.staticMethod();
		A.staticMethod();
	}

}

@FunctionalInterface
interface Test {
	void implementMe();

	default void defaultMethod() {
		System.out.println("I am default");
	}

	public static void staticMethod() {
		System.out.println("I am static");
	}
}

//@FunctionalInterface
interface B extends Test{
	void bMethod();
}

class A implements Test{

	@Override
	public void implementMe() {
		System.out.println("A");
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("I am default from A");
	}
	
	public static void staticMethod() {
		System.out.println("I am static from A");
	}
	
}