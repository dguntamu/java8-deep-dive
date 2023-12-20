package java8.features.stream.functional;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,String> f = (t) -> "Value is "+t;
		System.out.println(f.apply(10));
	}

}
