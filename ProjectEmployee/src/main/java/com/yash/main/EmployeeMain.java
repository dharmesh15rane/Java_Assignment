package com.yash.main;
import com.yash.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.yash.employee.Employee;

public class EmployeeMain {


public static void main(String[]args)
 {
	 List<Employee> empList = new ArrayList<Employee>(); 
	  Employee e1 = new Employee(121,"Rane", 67900, "Manager", "Indore", 04);
	  Employee e2 = new Employee(122,"Jain", 66000, "Trainer", "Pune", 07);
	  Employee e3 = new Employee(123,"Patni",73000, "Testing", "Mirzapur",03);
	  Employee e4 = new Employee(124,"Motu", 56000, "Devloper", "Mumbai", 02);
	  
	  //object of EmployeeServiceImpelent
	  EmployeeServiceImplementation esi = new EmployeeServiceImplementation();

	  
	  empList.add(e1);
	  empList.add(e2);
	  empList.add(e3);
	  empList.add(e4);

	  boolean exit =false;
	  while(!exit) {
	  System.out.println("Press 1 for Add new Empoyee");
      System.out.println("Press 2 for existing Employee_List");
      System.out.println("Press 3 for exit");
      System.out.println("press 4 for Get Empoyee by Id");
      System.out.println("press 5 for Get Empoyee by Dept_Num");
      System.out.println("press 6 for Get Empoyee by Name");
      System.out.println("press 7 for Get Max Salary");
      System.out.println("press 8 for Get Min Salary");
		  Scanner input = new Scanner(System.in);
		  int choice = input.nextInt();
	       
	 switch(choice)
	 {
	 case 1:
		 Scanner input1 = new Scanner(System.in);
			System.out.println("Employee_ID");
			  int emp_id = input1.nextInt();
		    System.out.println("Employee_Name");
			  String emp_name = input1.next();
			System.out.println("Employee_Salary");
		      int emp_salary = input1.nextInt();
			System.out.println("Employee_Designation");
		      String emp_degis = input1.next();
			System.out.println("Employee_Location");
		      String emp_location = input1.next();
			System.out.println("Employee_Dept_Num");
		      int emp_dept = input1.nextInt();
		  empList.add(new Employee(emp_id,emp_name,emp_salary,emp_degis,emp_location,emp_dept));
		     for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
			    System.out.println(employee);	
			}
		  break;
		  
	 case 2:
		 //System.out.println(empList);
		 for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			 System.out.println(employee);
		}
		 break;
		 
	 case 3: 
		 exit = true;
	     break;
	     
	 case 4:
		 System.out.println("Enter Employee Id");
		 Scanner input2 = new Scanner(System.in);
		  int empId = input2.nextInt();
		  esi.getEmployeeById(empList, empId );
		  break;
	 case 5:
		 System.out.println("Enter Employee Dept_Numb");
		 Scanner input3 = new Scanner(System.in);
		  int empDept = input3.nextInt();
		  esi.getEmployeeByDept(empList, empDept );
		  break;
	 case 6:
		 System.out.println("Enter Employee Name");
		 Scanner input4 = new Scanner(System.in);
		  String empName = input4.next();
		  esi.getEmployeeByName(empList, empName );
		  break;
	 case 7:
		 System.out.println("Maximun Salary");
		  esi.getEmployeeByMaxSalary(empList);
		  break;
	 case 8:
		 System.out.println("Minimum Salary");
		 esi.getEmployeeByMinSalary(empList);
		  break;
	 }
	 
	 if(exit)
	 {
		 break;
	 }
	  }	
 }


}
