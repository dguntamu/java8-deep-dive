package java8.features.stream.foreach;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerateInfinate {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(10));
		stream.forEach(e -> System.out.println(e)); 
	}

}
