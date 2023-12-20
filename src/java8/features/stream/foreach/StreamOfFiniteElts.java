package java8.features.stream.foreach;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOfFiniteElts {

	public static void main(String[] args) {
		//Create finite IntStream
		Stream way1 = Stream.of(10,20,30,40,50);
		Stream<String> stringStream = Stream.of("java","oops");
		
		IntStream way2 = IntStream.of(1,2,3,4,5);
		LongStream longS = LongStream.of(1l,2l,3l);
		DoubleStream doubleS = DoubleStream.of(2.2,3.4);
		
		way1.forEach(e -> System.out.print(e));
		System.out.println();
		way2.forEach(System.out::println);
		
	}

}
