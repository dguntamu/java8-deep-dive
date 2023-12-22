package java8.features.stream.partitionby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.features.stream.maxsaldept.Emp;

public class PartitionByClient {

	public static void main(String[] args) {
		List<Emp> empLists = Arrays.asList(
				new Emp(1,"emp1","DEV",5000),
				new Emp(2,"emp2","QA",7000),
				new Emp(3,"emp3","QA",5000),
				new Emp(4,"emp4","DEVOPS",4000),
				new Emp(5,"emp5","DEV",9000),
				new Emp(6,"emp6","DEVOPS",5000),
				new Emp(7,"emp7","DEVOPS",11000)
				);
		
		//Partition emp based on salary i.e. salary > 5000
		Map<Boolean,List<Emp>> result = empLists.stream().collect(Collectors.partitioningBy(emp -> emp.getSal() > 6000));
		
		
		result.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                ((List<Emp>)v).stream().map(s->s.getName()).collect(Collectors.joining(","))));
		
		System.out.println("============");
		Map<String,List<Emp>> output = empLists.stream().collect(Collectors.groupingBy(Emp::getDept));
		output.forEach((k,v) -> {
			System.out.println("Key : "+k+", value : "+((List<Emp>)v).stream().map(s->s.getName()).collect(Collectors.joining(",")));
		});
	}

}
