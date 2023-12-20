package java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamSatrt {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,3,10,8,20,9,15);
		
		Predicate<Integer> condition = (num)-> num>5;
		
		list.stream().filter(condition).map(num -> num +10).sorted().forEach(System.out::println);
	}

}
