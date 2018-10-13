package com.Map;

public class Employee {
String empName;
int salary;
public Employee(String empName, int salary) {
	super();
	this.empName = empName;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", salary=" + salary + "]";
}

}
