package com.yash.util;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

import com.yash.employee.Employee;
import com.yash.main.*;
public   class EmployeeServiceImplementation implements EmployeeService 
{


	public void getEmployeeById(List<Employee> empList, int empId)
	{
	System.out.println( empList.stream().filter(e->e.emp_id == empId)
			.map(e->e.toString()).collect(Collectors.toList()));
	 
	}
	public void getEmployeeByDept(List<Employee> empList, int empDept)
	{
	System.out.println( empList.stream().filter(e->e.emp_dept == empDept)
			.map(e->e.toString()).collect(Collectors.toList()));
	 }
	public void getEmployeeByName(List<Employee> empList, String empName)
	{
	System.out.println( empList.stream().filter(e->e.emp_name .equals(empName))
			.map(e->e.toString()).collect(Collectors.toList()));
	 }
	@Override
	public void getEmployeeByMaxSalary(List<Employee> empList) {
		System.out.println( empList.stream()
			.max((emp1,emp2)->emp1.emp_salary >emp2.emp_salary ?1:-1).get());		
	}
	@Override
	public void getEmployeeByMinSalary(List<Employee> empList) {
		System.out.println( empList.stream()
			.min((emp1,emp2)->emp1.emp_salary >emp2.emp_salary ?1:-1).get());
		
	}
	
	

}
