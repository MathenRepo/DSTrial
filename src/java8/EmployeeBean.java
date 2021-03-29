package java8;

import java.util.Comparator;

public class EmployeeBean implements Comparator<EmployeeBean>{
	
	String name;
	Integer salary;
	
	
	public EmployeeBean(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
