package com.yash.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.yash.collection.Employee;

public class EmployeeMain {

  public static void main(String[] args) 
  {
	  
	Scanner scan = new Scanner(System.in); 
    ArrayList<Employee> empList = new ArrayList<Employee>();
     char quit = 'y';
    while(quit =='y')
    {
    	System.out.println("Employee_ID");
    	  int emp_id = scan.nextInt();
        System.out.println("Employee_Name");
      	  String emp_name = scan.next();
      	System.out.println("Employee_Salary");
  	      int emp_salary = scan.nextInt();
  		System.out.println("Employee_Designation");
  	      String emp_degis = scan.next();
  		System.out.println("Employee_Location");
  	      String emp_location = scan.next();
  		System.out.println("Employee_Dept_Num");
  	      int emp_dept = scan.nextInt();
  	   empList.add(new Employee(emp_id,emp_name,emp_salary,emp_degis,emp_location,emp_dept));
  	   System.out.println("Enter Another Record (y/n)");
  	   	String word = scan.next();
  	   //	word =word.toUpperCase();
  	   	quit =word.charAt(0);
    }
        for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.toString());				
		}
        
      
  }

}
