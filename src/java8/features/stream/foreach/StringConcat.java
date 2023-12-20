package java8.features.stream.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcat {

	public static void main(String[] args) {
		Stream<Integer> list1 = Stream.of(1,2,3,4,5);
		Stream<Integer> list2 = Stream.of(4,5,6,7,8);
		
		//List<Integer> result = Stream.concat(list1, list2).distinct().collect(Collectors.toList());
		List<Integer> result = Stream.concat(list1, list2).collect(Collectors.toList());
		//result.forEach(System.out::println);
		
		
		List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct elements:"+l);
        String output = list.stream().distinct().collect(Collectors.joining(","));
        System.out.println(output);
	}

}
