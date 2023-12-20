package java8.features.stream.foreach;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamTerminalOperators {

	public static void main(String[] args) {
		Supplier<IntStream> stream = () -> {
			return IntStream.of(10, 20, 30, 40, 50, 80, 11, 11);
		};

		System.out.println("Min -> " + stream.get().min().orElse(1111));
		System.out.println("Max -> " + stream.get().max().getAsInt());
		System.out.println("findAny -> " + stream.get().findAny().getAsInt());
		System.out.println("findFirst -> " + stream.get().findFirst().getAsInt());
		System.out.println("Count -> " + stream.get().count());
		System.out.println("Sum -> " + stream.get().sum());
		System.out.println("average -> " + stream.get().average().getAsDouble());
		System.out.println("distinct -> " + stream.get().distinct().count());
		
		System.out.println("===============");
		
		System.out.println("anyMatch -> " + stream.get().anyMatch(e -> (e % 2 == 0)));
		System.out.println("allMatch -> " + stream.get().allMatch(e -> (e % 2 == 0)));
		
		
		System.out.println("===============");

		System.out.println("isParallel -> " + stream.get().isParallel());
		//System.out.println("takeWhile -> " + stream.get().takeWhile(e -> e == 20).forEach(System.out::println));
		stream.get().takeWhile(e -> e == 20).forEach(System.out::println);
		System.out.println("dropWhile -> " + stream.get().dropWhile(e -> e == 11).count());
	}

}
