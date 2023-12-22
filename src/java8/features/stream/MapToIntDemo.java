package java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 20000);
		Employee e2 = new Employee(2, 15000);
		Employee e3 = new Employee(3, 30000);

		List<Employee> emps = Arrays.asList(e1, e2, e3);
		//Find the total salary drawing by all employees.
		int sum = emps.stream().mapToInt(emp -> emp.getSal()).sum();
		System.out.println(sum);
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		long count = list.stream().count();
		System.out.println(count);
		long cnt = list.stream().collect(Collectors.counting());
		System.out.println(cnt);

	}
}

class Employee {
	private int id;
	private int sal;

	public Employee(int id, int sal) {
		this.id = id;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public int getSal() {
		return sal;
	}
}