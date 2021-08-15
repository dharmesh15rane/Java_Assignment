package com.yash.collection;

public class Employee {
   int emp_id;
   String emp_name;
   int emp_salary;
   String emp_degis;
   String emp_location;
   int emp_dept;
public Employee(int emp_id, String emp_name, int emp_salary, String emp_degis, String emp_location, int emp_dept) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_salary = emp_salary;
	this.emp_degis = emp_degis;
	this.emp_location = emp_location;
	this.emp_dept = emp_dept;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_degis="
			+ emp_degis + ", emp_location=" + emp_location + ", emp_dept=" + emp_dept + "]";
}
   
   
}
