package java8.features.stream.wordcount;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class WordCount {

	public static void main(String[] args) {
		String input = "jaava";
		
		Map<String,Long> wordCount = Arrays.stream(input.split(""))
											.collect(
													groupingBy(Function.identity(),counting())
													);
		System.out.println(wordCount);
	}

}
