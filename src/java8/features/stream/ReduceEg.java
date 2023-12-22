package java8.features.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceEg {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);
		int identity = 1;
		
		//way-1
		long start = System.currentTimeMillis();
		int sum = list.stream().map(e -> e).reduce(identity, (x,y)->{
			//System.out.println("identity -> "+identity);
			//System.out.println("x -> "+x+", y-> "+y);
			return x+y;
		}).intValue();
		long end = System.currentTimeMillis();
		System.out.println("time taken is : "+(end-start)+", for value : "+sum);
		
		//way-2
		start = System.currentTimeMillis();
		int sum2 = list.stream().reduce(identity,Integer::sum);
		end = System.currentTimeMillis();
		System.out.println("time taken is : "+(end-start)+", for value : "+sum2);
		
		
		
		//Array to String
		String[] array = {"Mohan", "Sohan", "Mahesh"};
		Arrays.stream(array).reduce((s1,s2) -> s1+", "+s2).ifPresent(System.out::println);
		
		//List to String
		List<String> l = Arrays.asList("Mohan", "Sohan", "Mahesh");
		l.stream().reduce((s1,s2) -> s1+"-"+s2).ifPresent(s->System.out.println("List to String : "+s));
		
	}

}
