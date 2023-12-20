package java8.features.stream.maxsaldept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * List<Emp> list = Stream.generate(() -> new Emp(1, "emp1", "DEV", 5000))
		 * .limit(10) .collect(Collectors.toList());
		 */
		
		List<Emp> empLists = Arrays.asList(
				new Emp(1,"emp1","DEV",5000),
				new Emp(2,"emp2","QA",7000),
				new Emp(3,"emp3","QA",5000),
				new Emp(4,"emp4","DEVOPS",4000),
				new Emp(5,"emp5","DEV",9000),
				new Emp(6,"emp6","DEVOPS",5000),
				new Emp(7,"emp7","DEVOPS",11000)
				);
		
		//find the employee paid highest salary from each dept.
		
		//Approach--1
		//Step-1: Group the employees based on DEPT
		//Step-2: Apply the comparator on salary to compare
		Comparator<Emp> compareBySal = Comparator.comparing(Emp::getSal);
		
		Map<String, Optional<Emp>> resp = empLists.stream()
				.collect(
						Collectors.groupingBy(Emp::getDept,Collectors.reducing(BinaryOperator.maxBy(compareBySal)))
						);
		System.out.println(resp);
		
		
		//Approach---2
		empLists.stream().collect(
				Collectors.groupingBy(
						Emp::getDept,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Emp::getSal)), Optional::get))
				);
	}

}
