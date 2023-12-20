package java8.features.stream.foreach;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamVsPrallelThreadName {

	public static void main(String[] args) {
		//Get the number of processor count
		int processorCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Porcessor count : "+processorCount);
		
		List<Integer> intStream = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		
		
		//StreamVsPrallelThreadName.processStream(intStream.stream()); //Default its a sequential
		StreamVsPrallelThreadName.processStream(intStream.parallelStream()); //its parallel stream, makes use of processorCount cores.
	}
	public static void processStream(Stream<Integer> data) {
		//data.forEach(elt -> {
		data.parallel().forEachOrdered(elt -> { 
		//data.forEachOrdered(elt -> { //used this for parallelStream() to get ordered result
									// but entire data is processing by one thread only at a time.not using all 8 threads for forEachOrdered()
			System.out.println(LocalTime.now()+" value : "+elt+" processed by thread : "+Thread.currentThread().getName());
		});
	}

}
