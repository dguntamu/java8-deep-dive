package java8.features.stream.foreach;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LimitSkip {

	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
//		list.stream().limit(5).skip(2).parallel().forEachOrdered(e -> { //Only ONE thread assigned when we use forEachOrdered()
		list.stream().limit(5).skip(2).parallel().forEach(e -> { //All available threads will be assigned when we use forEach for parallel
			System.out.println("elt : "+e+", threa name : "+Thread.currentThread().getName());
		});
		
		System.out.println("-----");
		
		
		
		//peek() is intermediate operator and will get called when used terminal operator.
		List<Integer> list2 = IntStream.rangeClosed(1, 4).boxed().collect(Collectors.toList());
		list2.stream().peek(System.out::println); //nothing will be printed as there is no terminal operator involved here.
		
		list2.stream().map(e -> e+2).peek(System.out::println).collect(Collectors.toList());
	}

}
