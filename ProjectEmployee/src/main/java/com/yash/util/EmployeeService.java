package com.yash.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.employee.Employee;




public interface EmployeeService 

{
  
		
	 public void getEmployeeById(List<Employee> empList,int  empId);
	 
	 public void getEmployeeByDept(List<Employee> empList,int  empDept);
	 
	 public void getEmployeeByName(List<Employee> empList, String  empName);
	 
	 public void getEmployeeByMaxSalary(List<Employee> empList); 
	 
	 public void getEmployeeByMinSalary(List<Employee> empList); 
	 
	 	
}
