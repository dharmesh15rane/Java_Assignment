package com.yash.employee;

import java.util.Scanner;

public class Employee 
{
	 public  int emp_id;
	 public  String emp_name;
	 public  int emp_salary;
	 public  String emp_degis;
	 public  String emp_location;
	 public  int emp_dept;
	   
	public Employee(int emp_id, String emp_name, int emp_salary, String emp_degis, String emp_location, int emp_dept) 
	{
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

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_degis() {
		return emp_degis;
	}

	public void setEmp_degis(String emp_degis) {
		this.emp_degis = emp_degis;
	}

	public String getEmp_location() {
		return emp_location;
	}

	public void setEmp_location(String emp_location) {
		this.emp_location = emp_location;
	}

	public int getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(int emp_dept) {
		this.emp_dept = emp_dept;
	}
	

//	public void new_Employee()
//	{
//	Scanner	input = new Scanner(System.in);
//	System.out.println("Employee_ID");
//	  int emp_id = input.nextInt();
//    System.out.println("Employee_Name");
//	  String emp_name = input.next();
//	System.out.println("Employee_Salary");
//      int emp_salary = input.nextInt();
//	System.out.println("Employee_Designation");
//      String emp_degis = input.next();
//	System.out.println("Employee_Location");
//      String emp_location = input.next();
//	System.out.println("Employee_Dept_Num");
//      int emp_dept = input.nextInt();
//	}
//	public void info_Employee()
//	{
//	   System.out.println(emp_id +" " +emp_name+" "+emp_salary+" "+emp_degis+" "+emp_location+"  "+emp_dept)	;
//	}
}

