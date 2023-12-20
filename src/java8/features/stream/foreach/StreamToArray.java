package java8.features.stream.foreach;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		List<Integer> list = Stream.of(10,20,30,40,50).collect(Collectors.toList());
		
		//Stream to Integer[]
		Integer[] result = list.stream().toArray(size -> new Integer[size]);
		for(Integer elt : result) {
			System.out.println(elt);
		}
		
		System.out.println("=========");
		
		String[] ar = Stream.of("Java", "Angular", "Spring")
				.collect(Collectors.toList())
				.toArray(new String[0]);
		
		for(String a : ar) {
			System.out.println(a);
		}
		
	}

}
