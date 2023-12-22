package java8.features.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoComparators {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(1,"emp1",2000,10),
				new Employee(2,"emp2",2500,20),
				new Employee(3,"emp3",3000,10),
				new Employee(4,"emp4",5000,20),
				new Employee(5,"emp5",1000,20)
				);
		
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getEmpName);
		Comparator<Employee> compareBySal  = Comparator.comparing(Employee::getSalary);
		
		List<Employee> sortedEmps = emps.stream().sorted(compareByName.thenComparing(compareBySal)).collect(Collectors.toList());
		sortedEmps.forEach(System.out::println);
		

		//emps.stream().collect(Collectors.groupingBy(Employee::getDeptNo)).;
	}

}

class Employee {
	private int empId;
	private String empName;
	private int salary;
	private int deptNo;

	public Employee(int empId, String empName, int salary, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}