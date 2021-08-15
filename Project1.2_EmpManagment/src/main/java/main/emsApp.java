package main;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Scanner;

import modal.Employee;
import service.EmployeeService;
import serviceimpl.EmployeeSerivceImpl;
public class emsApp
{

	private static final String STR_1 = null;
	private static final String STR_2 = null;
	private static final String STR_3 = null;
	private static final String STR_4 = null;
	private static final String STR_5 = null;
	private static final String STR_0 = null;

	public static void main(String[] args)
	{
		EmployeeSerivceImpl.EmpList(EmployeeService.initEmpList(new ArrayList<Employee>()));
	     empOperation();
	     }
	
	private static void empOperation()
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Constable i=Constant.STR_EMPTY;
			do
			{
				System.out.println("Select your choice -");
				System.out.println("1. Get Employee By Id");
				System.out.println("2. Search Employee By Name");
				System.out.println("3. Search Employee By Department");
				System.out.println("4. Get Employee By Salary");
				System.out.println("5. Get DepartmentList");
				System.out.println("6. Exit");
				
				i=sc.next();
				EmployeeService empService = new EmployeeSerivceImpl();
				switch(i)
				{
				case STR_1:
					System.out.println("Enter Id of Emp");
					empService.getEmployeeById();
					break;
				case STR_2:
					System.out.println("Enter name of Emp");
					empService.getEmployeeByName();
					break;
				case STR_3:
					System.out.println("Enter name of Dept");
					empService.getEmployeeByDepartment();
					break;
					
				case STR_4:
					System.out.println("Enter salary of Emp");
					Constant userInput1= Constant.STR_EMPTY;
					empService.getEmployeeBySalary();
					break;
					
                case STR_5:
				 empService.getAllDepartment();
					break;
					
            
                case STR_0:
   				 default:
   					break;
				}
			}
			while(!i.equals(Constant.STR_0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
				
			}
		}
	}

