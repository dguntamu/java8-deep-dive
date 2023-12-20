package java8.features.stream.foreach;

import java.util.LinkedHashMap;
import java.util.Map;

public class ForEachMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		
		map.forEach((k,v) -> System.out.println(k+", "+v));
		
	}

}
