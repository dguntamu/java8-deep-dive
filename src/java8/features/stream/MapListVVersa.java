package java8.features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapListVVersa {

	public static void main(String[] args) {
		String[] strArray = {"AA", "BB", "CC"};
		//array to List
		List<String> list = Arrays.stream(strArray).collect(Collectors.toList());
		
		//List to Map<ID,SAL>
		Employee e1 = new Employee(1, 20000);
		Employee e2 = new Employee(2, 15000);
		Employee e3 = new Employee(3, 30000);

		List<Employee> empList = Arrays.asList(e1, e2, e3);
		Map<Integer,Integer> empMap = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getSal));
		
		empMap.forEach((k,v) -> System.out.println(k+", "+v));
		
		
		//Map to List
		List<Integer> mapValues = empMap.values().stream().collect(Collectors.toList());
		List<Integer> mapKeys = empMap.keySet().stream().collect(Collectors.toList());
		
		empMap.values().stream().sorted().collect(Collectors.toList());
//		empMap.values().stream().sorted(Comparator.comparing(()).collect(Collectors.toList());
		
	}

}
