package java8.features.stream.functional;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> c = (input)-> System.out.println(input);
		c.accept(20);
	}

}
