package java8.features.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentDefaultCustomeSort {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(1, "dhanu", 33), 
				new Student(2, "sai", 20),
				new Student(1, "chahel", 35), 
				new Student(1, "hetvik", 25));

//		List<Student> sortedList = students.stream().sorted().collect(Collectors.toList());
		List<Student> sortedList = students.stream().sorted().toList();
		System.out.println("---Natural Sorting by Name---");
		sortedList.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("---Natural Sorting by Name in reverse order/Comparator.reverseOrder()---");
		students.stream().sorted(Comparator.reverseOrder()).toList().forEach(s -> System.out.println(s.getName()));

		
		System.out.println("---Sorting using Comparator by Age---");
		students.stream().sorted(Comparator.comparing(Student::getAge)).toList().forEach(s -> System.out.println(s.getAge()));
		
		System.out.println("---Sorting using Comparator by Age in reverse order---");
		students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList()).forEach(s -> System.out.println(s.getAge()));
		
		
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.getName());
	}

}