package java8.features.stream.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "Mahesh");
		map.put(10, "Suresh");
		map.put(30, "Nilesh");
		
		System.out.println("---Sort by Map Value---");
		map.entrySet().stream()
		.sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(e -> System.out.println(e.getKey()+", "+e.getValue()));
		
		System.out.println("---Sort by Map Key---");
		map.entrySet().stream()
		.sorted(Comparator.comparing(Map.Entry::getKey))
		.forEach(e -> System.out.println(e.getKey()+", "+e.getValue()));
		

	}

}
