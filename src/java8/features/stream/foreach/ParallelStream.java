package java8.features.stream.foreach;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		//Get noof processors
		int processorCount = Runtime.getRuntime().availableProcessors();
		System.out.println("processorCount : "+processorCount);
		
		
		List<String> words = Arrays.asList("Java"," is"," a"," object"," oriented"," prog"," lang");
		
		Long startTime1 = System.currentTimeMillis();
		words.stream().forEach(System.out::print);
		Long endTime1 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Sequential/stream().forEach stream time taken : "+(endTime1-startTime1));
		
		Long startTime2 = System.currentTimeMillis();
		words.stream().parallel().forEachOrdered(System.out::print);
		Long endTime2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("parallel().forEachOrdered stream time taken : "+(endTime2-startTime2));
		
		Long startTime3 = System.currentTimeMillis();
		words.parallelStream().forEachOrdered(System.out::print);
		Long endTime3 = System.currentTimeMillis();
		System.out.println();
		System.out.println("parallelStream() time taken : "+(endTime3-startTime3));
		
	}

}
