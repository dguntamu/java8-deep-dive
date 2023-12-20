package java8.features.stream.functional;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> condition = (input) -> input%2==0;
		System.out.println(condition.test(10));
	}

}
