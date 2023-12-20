package java8.features.stream.maxsaldept;

public class Emp {
	private Integer empId;
	private String name;
	private String dept;
	private Integer sal;

	public Emp(Integer empId, String name, String dept, Integer sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
}
