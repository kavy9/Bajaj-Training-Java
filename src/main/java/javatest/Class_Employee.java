package javatest;

import java.util.Comparator;

public class Class_Employee implements Comparable<Class_Employee>{

	protected String name;
	protected int emp_id;
	protected int salary;
	protected String department; 
	public Class_Employee(String name, int emp_id, int salary, String department) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.salary = salary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "[ name=" + name + ", emp_id=" + emp_id + ", salary=" + salary + ", department="
				+ department + " ]";
	}
	public int compareTo(Class_Employee o) {
		if(this.emp_id>o.emp_id) {
			return 1;
		}
		else if(this.emp_id<o.emp_id) {
			return -1;
		}	
		return 0;
	}


}

class sortBySalary implements Comparator<Class_Employee>{

	public int compare(Class_Employee o1, Class_Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary())
		{
			return -1;
		}
		return 0;
	}
}
class sortBySalaryReverse implements Comparator<Class_Employee>{

	public int compare(Class_Employee o1, Class_Employee o2) {
		if(o1.getSalary()<o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary()>o2.getSalary())
		{
			return -1;
		}
		return 0;
	}
}
class sortByName implements Comparator<Class_Employee>{

	public int compare(Class_Employee o1, Class_Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
