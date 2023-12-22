package java8.features.stream.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntFloatMap {

	public static void main(String[] args) {
		int intInput[][] = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		 IntStream intStream = Arrays.stream(intInput).flatMapToInt(row -> Arrays.stream(row));
		 System.out.println("InStream.sum -> "+intStream.sum());
		 
		 long longInput[][] = { 
					{ 1L, 2L, 3l }, 
					{ 4l, 5l, 6l }, 
					{ 7l, 8l, 9l } 
					};
		 LongStream longStream = Arrays.stream(longInput).flatMapToLong(row -> Arrays.stream(row));
		 System.out.println("longStream.sum -> "+longStream.sum());
	}

}
