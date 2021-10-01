package com.yash.emsjdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Connection;
import java.util.Scanner;

import com.yash.emsjdbc.dao.EmployeeDao;
import com.yash.emsjdbc.serviceimpl.EmployeeServiceImplementation;
import com.yash.emsjdbc.util.jdbc.JDBCUtil;

/**
 * Main App of emplyoee which contains menu and methods calls according to
 * user input
 * @author 
 *
 */
public class EmployeeApp 
{
	public static void main(String[] args) throws Exception
	{
		
		EmployeeServiceImplementation esimpl = new EmployeeServiceImplementation();
	    EmployeeDao ed = new EmployeeDao();

		
		 
		int option;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(true)
		{
			System.out.println("Press 1 for Display existing list ");
			System.out.println("Press 2 for Add new Employee Record");
			System.out.println("Press 3 to get employee by id");
			System.out.println("Press 4 to get employee by name");
			System.out.println("Press 5 to get employee by maximum salary");
			System.out.println("Press 6 to get employee by minimum salary");
			System.out.println("Press any key(except 1-6) to exit...");

			option = sc.nextInt();
			switch(option)
			{
			case 1:
				esimpl.displayExistingData();
				break;

			case 2:
			//	esimpl.addEmployeeData();
				//EmployeeDao.insert();
				Connection con=JDBCUtil.psDemo();
				break;

			case 3:
				try 
				{
					esimpl.getEmployeeById();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;

			case 4:
				try 
				{
					esimpl.getEmployeeByName();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;

			case 5:
				esimpl.getEmployeeByMaxSalary();
				break;

			case 6:
				esimpl.getemployeeByMinSalary();
				break;

			default:
				flag = true;
				break;	
			}

			if(flag)
				break;

		}

	}
}

