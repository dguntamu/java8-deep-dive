package java8.features.stream.functional;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> sup = () ->  10;
		Supplier<Integer> sup2 = () -> { return 10;};
		System.out.println(sup.get());
		
	}

}
