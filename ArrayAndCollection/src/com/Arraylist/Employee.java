package com.Arraylist;

public class Employee {
	int employeeid;
	String empName;
	int salary;
	public Employee(int employeeid, String empName, int salary) {
		super();
		this.employeeid = employeeid;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
